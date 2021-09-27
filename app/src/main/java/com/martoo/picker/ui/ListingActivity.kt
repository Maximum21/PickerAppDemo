package com.martoo.picker.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.constraintlayout.widget.Group
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.martoo.picker.*
import com.martoo.picker.entities.toProductItemEntity
import com.martoo.picker.interfaces.ListingView
import com.martoo.picker.models.ParentOrder
import com.martoo.picker.models.Product
import com.woocom.Woocommerce
import com.woocom.Woocommerce.Companion.API_V3
import com.woocom.models.Metadata
import com.woocom.models.MyOrder
import com.woocom.models.Order
import com.woocom.models.filters.OrderFilter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import segmented_control.widget.custom.android.com.segmentedcontrol.SegmentedControl
import java.lang.Exception
import java.util.*
import kotlin.collections.ArrayList

class ListingActivity : AppCompatActivity(),
    ListingView {
    private var adapter: ProductsAdapter?= null
    private lateinit var progressView: RelativeLayout
    private var recentProductCode: String = ""
    private var recentsProductsList: List<Product> = arrayListOf()
    private var orderCurrent: com.martoo.picker.models.Order? = null
    private var scanningProcess: Int = 0
    var productScanned = false
    private var recentCode: String = ""
    private lateinit var woocommerce: Woocommerce
    private lateinit var orderCompleteBtn: Button
    private lateinit var headerLL: LinearLayout
    private lateinit var rvMain: RecyclerView
    private lateinit var actionDialog: Group
    private lateinit var actionDialogClose: ImageView
    private lateinit var actionDialogHeadingTv: TextView
    private lateinit var actionDialogHeadingEtv: EditText
    private lateinit var actionDialogScannedBtn: Button
    private lateinit var segmentedControl: SegmentedControl<*>
    private var attachBasket = false
    private var scanning = false
    var segmentSelected = -1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listing)
        woocommerce = Utility.getWooCommerce(this)
        actionDialogClose = findViewById<ImageView>(R.id.actionDialogClose)
        rvMain = findViewById<RecyclerView>(R.id.rvMain)
        actionDialog = findViewById<Group>(R.id.actionDialog)
        actionDialogHeadingTv = findViewById<TextView>(R.id.actionDialogHeadingTv)
        actionDialogHeadingEtv = findViewById<EditText>(R.id.actionDialogHeadingEtv)
        actionDialogScannedBtn = findViewById<Button>(R.id.actionDialogScannedBtn)
        headerLL = findViewById<LinearLayout>(R.id.header)
        orderCompleteBtn = findViewById<Button>(R.id.orderCompleteBtn)
        segmentedControl = findViewById<SegmentedControl<*>>(R.id.segmented_control)
        progressView = findViewById<RelativeLayout>(R.id.progressView)
        segmentedControl.addOnSegmentSelectListener { segmentViewHolder, isSelected, isReselected ->
            if (isSelected && segmentViewHolder.absolutePosition!=segmentSelected) {
                rvMain.adapter = null
                progressView.visibility = View.VISIBLE
                when(segmentViewHolder.absolutePosition){
                    0->{
                        segmentSelected=0
                        scanning=false
                        setView(-1)
                    }
                    1->{
                        segmentSelected=1
                        scanning=false
                        setOrdersFromDb()
                        setView(1)
                    }
                    2->{
                        segmentSelected=2
                        setProducts(this)
                    }
                }
            }
        }
//        Utility.getorderstest(this@ListingActivity)
        orderCompleteBtn.setOnClickListener {
            if(orderCompleteBtn.text.toString().toLowerCase() == "start scanning"){
                setScanView(0)
                orderCompleteBtn.text = "Stop Scanning"
                scanning=true
            }else{
                scanning=false
                orderCompleteBtn.text = "Start Scanning"
            }
        }
        actionDialogScannedBtn.setOnClickListener {
            when(scanningProcess){
                0->{
                    scanProductOrBasket()
                }
                1->{
                    matchBasketOrAddProduct()
                }
                2->{
                    if(!actionDialogHeadingEtv.text.toString().trim().isNullOrEmpty()){
                        val scannedCode = actionDialogHeadingEtv.text.toString().trim().lowercase()
                        if (scannedCode.startsWith("basket")) {
                            checkBarCode(scannedCode,orderCurrent?.orderNumber?:"")
                        }else{
                            Toast.makeText(this@ListingActivity,"Please Scan a Basket!",Toast.LENGTH_LONG).show()
                        }
                    }else{
                        Toast.makeText(this@ListingActivity,"Please Scan Barcode First!",Toast.LENGTH_LONG).show()
                    }
                }
            }
        }
        actionDialogClose.setOnClickListener {
            actionDialog.visibility = View.GONE
        }
        segmentedControl.setSelectedSegment(0)
    }

    private fun matchBasketOrAddProduct() {
        val code = actionDialogHeadingEtv.text.toString().trim()
        if(code.isNullOrEmpty()){
            Toast.makeText(this@ListingActivity,"Scanned Basked Code is INVALID",Toast.LENGTH_LONG).show()
        }else{
            var orderNumbers: String? = getProductsFromOrder(0,"-1") as String?
            Utility.checkBasketInOrders(code,this@ListingActivity).observe(this,{checkProds->
                if(checkProds.isNullOrEmpty()){
                    Toast.makeText(this@ListingActivity,"Basket scanned is Not attached to order.",Toast.LENGTH_LONG).show()
                }else{
                    val product = getProductsFromOrder(1,checkProds[0].orderId) as Product?
                    product?.let{
                        product.remaining++
                        product.basketId = code
                        for(temp in checkProds){
                            if(!temp.orderId.isNullOrEmpty() && !orderNumbers.isNullOrEmpty() && orderNumbers.contains(temp.orderId)){
                                Utility.addProductToBaskedAndDatabase(product.toProductItemEntity(),
                                    this@ListingActivity)
                                Toast.makeText(this@ListingActivity,"Product Added Successfully!",Toast.LENGTH_LONG).show()
                                setScanView(0)
                                Timer().schedule(object: TimerTask(){
                                    override fun run() {
                                        runOnUiThread{
                                            setProducts(this@ListingActivity)
                                        }
                                    }

                                },500)
                                actionDialogHeadingEtv.setText("")
                                return@observe
                            }
                        }
                    }?: run{
                        Toast.makeText(this@ListingActivity,"Basket not attached to this order!",Toast.LENGTH_LONG).show()
                    }
                }
            })
        }
    }
    private fun getProductsFromOrder(tag:Int,orderId: String) : Any?{
        when(tag) {
            0 -> {
                var orderNumbers = ""
                for(temp in recentsProductsList){
                    orderNumbers += if(orderNumbers.isEmpty()){
                        temp.orderId
                    }else{
                        ",${temp.orderId}"
                    }
                }
                return orderNumbers
            }
            1 -> {
                for(temp in recentsProductsList){
                    if(temp.orderId?:"0" == orderId){
                        return temp
                    }
                }
            }
        }
        return null
    }
    private fun setRequest(list: List<Any>) {
        if (segmentSelected==0) {
            headerLL.visibility = View.GONE
            orderCompleteBtn.text = "Start Scanning"
            orderCompleteBtn.visibility = View.GONE
            adapter = ProductsAdapter(this, list as ArrayList,0,this@ListingActivity)
            rvMain.layoutManager = LinearLayoutManager(this)
            progressView.visibility = View.GONE
            rvMain.adapter = adapter
        }
        progressView.visibility = View.GONE
    }

    private fun setOrdersFromDb() {
        Utility.getOrders(this@ListingActivity).observe(this,{myOrders->
            myOrders?.let{
                if(it.isNotEmpty()){
                    val listing = ArrayList<Any>()
                    for(temp in  it){
                        listing.add(temp)
                    }
                    if (segmentSelected==1) {
                        headerLL.visibility = View.GONE
                        orderCompleteBtn.text = "Start Scanning"
                        orderCompleteBtn.visibility = View.GONE
                        adapter = ProductsAdapter(this, listing,2,this@ListingActivity)
                        rvMain.layoutManager = LinearLayoutManager(this)
                        progressView.visibility = View.GONE
                        rvMain.adapter = adapter
                    }
                }
            }
        })
    }

    private fun setProducts(context: Context) {
        Utility.getProducts(context).observe(this,{ productsList->
            productsList?.let{products->
                if(products.isNotEmpty()){
                    val listing = ArrayList<Any>()
                    for(temp in  products){
                        listing.add(temp)
                    }
                    if (segmentSelected==2) {
                        headerLL.visibility = View.VISIBLE
                        orderCompleteBtn.text = "Start Scanning"
                        orderCompleteBtn.visibility = View.VISIBLE
                        adapter = ProductsAdapter(this, listing,1,this@ListingActivity)
                        rvMain.layoutManager = LinearLayoutManager(this)
                        progressView.visibility = View.GONE
                        rvMain.adapter = adapter
                    }else{
                        progressView.visibility = View.GONE
                    }
                }else{
                    progressView.visibility = View.GONE
                }
            }?: run{
                progressView.visibility = View.GONE
            }
        })
    }

    fun checkBarCode(barcode: String,orderNumber:String){
        recentCode=barcode
        Utility.checkBarCode(recentCode,this@ListingActivity).observe(this,{basketOrders->
            if(basketOrders.isNullOrEmpty()){
                Utility.addBasektToOrder(recentCode,orderNumber,this@ListingActivity)
                Toast.makeText(this@ListingActivity,"Basket Added Successfully!",Toast.LENGTH_LONG).show()
                actionDialog.visibility= View.GONE
                actionDialogHeadingEtv.setText("")
                setOrdersFromDb()
            }else{
                Toast.makeText(this@ListingActivity,"Basket Already Attached!",Toast.LENGTH_LONG).show()
            }
        })
    }



    private fun setView(tag: Int) {
        progressView.visibility = View.VISIBLE
        val filter = OrderFilter()
        filter.setAccepted(tag)
        if (tag!=-1) {
            val userId = SharedPrefHelper.readString(this,Constant.user_id)
            userId?.let{
                filter.setAcceptedBy(it)
            }
        }
        filter.setStatus("processing,pending")
        val test = woocommerce!!.OrderRepository().myOrders(filter)
        test.enqueue(object : Callback<List<MyOrder>> {
            override fun onResponse(
                call: Call<List<MyOrder>>,
                response: Response<List<MyOrder>>
            ) {
                if (response.code() == 200) {
                    if (response.body() != null && response.body()?.isNotEmpty() == true) {
                        //creating our adapter
                        when(segmentSelected){
                            0->{
                                setRequest(response.body()!!)
                            }
                            1->{
                                setOrders(this@ListingActivity,response.body()!!)
                            }else->{
                                progressView.visibility = View.GONE
                            }
                        }

                    }else{
                        progressView.visibility = View.GONE
                    }
                }else{
                    progressView.visibility = View.GONE
                }
            }

            override fun onFailure(call: Call<List<MyOrder>>, t: Throwable) {
                t.printStackTrace()
                progressView.visibility = View.GONE
            }
        })

    }

    private fun setOrders(context: Context, list: List<MyOrder>) {
        if (segmentSelected==1) {
            Utility.addOrders(context,list)
            Timer().schedule(object : TimerTask() {
                override fun run() {
                    runOnUiThread {
                        setOrdersFromDb()
                    }
                }
            }, 2000)
        }
    }

    override fun onAccept(order: MyOrder) {
        updateOrder(order)
    }

    override fun AttachBasket(model: com.martoo.picker.models.Order) {
        orderCurrent = model
        setScanView(2)
    }

    private fun setScanView(tag: Int) {
        actionDialog.visibility = View.VISIBLE
        when(tag){
            0->{
                scanningProcess = 0
                actionDialogHeadingTv.text = "Scan Product Barcode"
            }
            1->{
                scanningProcess = 1
                actionDialogHeadingTv.text = "Scan Basket for Product"
            }
            2->{
                scanningProcess = 2
                actionDialogHeadingTv.text = "Scan Basket QR Code"
            }
            else->{
                scanningProcess = 3
            }
        }
    }


    override fun openOrderDetails(id: String) {
        startActivity(Intent(this@ListingActivity,OrderDetailsActivity::class.java).putExtra("order_id",id))
    }

    override fun completeOrder(model: ParentOrder, position: Int) {
        var baskets = ""
        var orderId = "0"
        var orderNumber = "0"
        for(temp in model.baskets){
            baskets += if(baskets.isEmpty()){
                temp.basket_code
            }else{
                ",${temp.basket_code}"
            }
        }
        model?.order?.let{orderItemEntitiy ->
            orderId = orderItemEntitiy.order_id?:"0"
            orderNumber = orderItemEntitiy.orderNumber?:"0"
        }
        updateOrder(orderNumber,orderId,baskets,position)
    }

    private fun updateOrder(orderNumber: String,orderId: String,baskets:String,position: Int) {
        try {
            progressView.visibility = View.VISIBLE
//            ProgressView.getInstance().showProgressDialog(this@ListingActivity)
            val order = Order()
            order.id = orderId.toInt()
            order.orderNumber = orderNumber
            order.status = "on-hold"
            val meta1 = Metadata()
            meta1.key = "basket_ids"
            meta1.value = baskets
            order.meta_data.add(meta1)
            val call = woocommerce.OrderRepository().update(orderId.toInt(), order)
            call.enqueue(object : Callback<Order?> {
                override fun onResponse(call: Call<Order?>, response: Response<Order?>) {
//                    ProgressView.getInstance().dismissDialog()
                    if (response.code() == 200) {
                        Toast.makeText(
                            this@ListingActivity,
                            response.message(),
                            Toast.LENGTH_SHORT
                        ).show()
                        adapter?.removeItem(position)
                        Utility.removeCompletedOrderFromDb(this@ListingActivity,orderNumber)
                        progressView.visibility = View.GONE
                    } else {
                        progressView.visibility = View.GONE
                        Toast.makeText(
                            this@ListingActivity,
                            response.message(),
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }

                override fun onFailure(call: Call<Order?>, t: Throwable) {
//                    ProgressView.getInstance().dismissDialog()
                    Toast.makeText(
                        this@ListingActivity,
                        t.message,
                        Toast.LENGTH_SHORT
                    ).show()
                    progressView.visibility = View.GONE
                }
            })
        } catch (e: Exception) {
            e.printStackTrace()
            progressView.visibility = View.GONE
        }
    }
    private fun updateOrder(orderTemp: MyOrder) {
        try {
            progressView.visibility = View.VISIBLE
//            ProgressView.getInstance().showProgressDialog(context)
            val order = com.woocom.models.Order()
            order.id = orderTemp.id
            order.orderNumber = orderTemp.orderNumber
            val meta = Metadata()
            meta.key = "accepted"
            meta.value = "1"
            val meta1 = Metadata()
            meta1.key = "accepted_by"
            meta1.value = SharedPrefHelper.readString(this@ListingActivity,Constant.user_id)
            order.meta_data.add(meta)
            order.meta_data.add(meta1)
            val call = woocommerce.OrderRepository().update(orderTemp.id, order)
            call.enqueue(object : Callback<com.woocom.models.Order?> {
                override fun onResponse(
                    call: Call<Order?>,
                    response: Response<Order?>
                ) {
//                    ProgressView.getInstance().dismissDialog()
                    if (response.code() == 200) {
                        Utility.addOrder(this@ListingActivity,orderTemp)
                        setView(-1)
                    } else {
                        progressView.visibility = View.GONE
                    }
                }

                override fun onFailure(call: Call<com.woocom.models.Order?>, t: Throwable) {
                    progressView.visibility = View.GONE
                }
            })
        } catch (e: Exception) {
            progressView.visibility = View.GONE
            e.printStackTrace()
        }
    }

    fun scanProductOrBasket() {
        val code = actionDialogHeadingEtv.text.toString().trim()
        recentProductCode = code
        if(code.isNullOrEmpty()){
            Toast.makeText(this@ListingActivity,"Scaned Product Code is INVALID",Toast.LENGTH_LONG).show()
        }else{
            Utility.checkProductRequired(code,this@ListingActivity).observe(this,{checkProds->
                recentsProductsList = checkProds
                if(checkProds.isNullOrEmpty()){
                    Toast.makeText(this@ListingActivity,"Invalid Product Scanned. Either full or not needed.",Toast.LENGTH_LONG).show()
                }else{
                    actionDialogHeadingEtv.setText("")
                    setScanView(1)
                }
            })
        }
    }
}