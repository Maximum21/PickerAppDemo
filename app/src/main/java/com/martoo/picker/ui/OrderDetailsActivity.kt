package com.martoo.picker.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.constraintlayout.widget.Group
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.martoo.picker.interfaces.ListingView
import com.martoo.picker.ProductsAdapter
import com.martoo.picker.R
import com.martoo.picker.Utility
import com.martoo.picker.Utility.getWooCommerce
import com.martoo.picker.entities.toProductItemEntity
import com.martoo.picker.models.Order
import com.martoo.picker.models.ParentOrder
import com.martoo.picker.models.Product
import com.woocom.Woocommerce
import com.woocom.models.Metadata
import com.woocom.models.MyOrder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception
import java.util.*
import kotlin.collections.ArrayList

class OrderDetailsActivity : AppCompatActivity(),
    ListingView {
    private var orderComplete: Boolean = false
    private var scanningProcess: Int = 0
    private var orderId: String = ""
    private var recentsProductsList: List<Product> = arrayListOf()
    private var recentProductCode: String = ""
    private lateinit var headerLL: LinearLayout
    private lateinit var completeBtn: Button
    private lateinit var actionDialog: Group
    private lateinit var actionDialogClose: ImageView
    private lateinit var actionDialogHeadingTv: TextView
    private lateinit var actionDialogHeadingEtv: EditText
    private lateinit var actionDialogScannedBtn: Button
    private lateinit var rvMain: RecyclerView
    private lateinit var woocommerce: Woocommerce
    private lateinit var progressView: RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_details)
        woocommerce = Utility.getWooCommerce(this)
        actionDialog = findViewById<Group>(R.id.actionDialog)
        actionDialogClose = findViewById<ImageView>(R.id.actionDialogClose)
        actionDialogHeadingTv = findViewById<TextView>(R.id.actionDialogHeadingTv)
        actionDialogHeadingEtv = findViewById<EditText>(R.id.actionDialogHeadingEtv)
        actionDialogScannedBtn = findViewById<Button>(R.id.actionDialogScannedBtn)
        rvMain = findViewById<RecyclerView>(R.id.rvMain)
        headerLL = findViewById<LinearLayout>(R.id.header)
        progressView = findViewById<RelativeLayout>(R.id.progressView)
        completeBtn = findViewById<Button>(R.id.orderCompleteBtn)
        setSingleProducts(intent)
        completeBtn.setOnClickListener {
            if (completeBtn.text.toString().trim().lowercase() == "order completed/close") {
                completeOrder()
            }else{
                setScanView(0)
                actionDialog.visibility = View.VISIBLE
            }
        }
        actionDialogClose.setOnClickListener { actionDialog.visibility = View.GONE }
        actionDialogScannedBtn.setOnClickListener {
            when(scanningProcess){
                0->{
                    scanProductOrBasket()
                }
                1->{
                    matchBasketOrAddProduct()
                }
                2->{
//                    if(!actionDialogHeadingEtv.text.toString().trim().isNullOrEmpty()){
//                        val scannedCode = actionDialogHeadingEtv.text.toString().trim().lowercase()
//                        if (scannedCode.startsWith("basket")) {
//                            checkBarCode(scannedCode,orderCurrent?.orderNumber?:"")
//                        }else{
//                            Toast.makeText(this@OrderDetailsActivity,"Please Scan a Basket!",Toast.LENGTH_LONG).show()
//                        }
//                    }else{
//                        Toast.makeText(this@OrderDetailsActivity,"Please Scan Barcode First!",Toast.LENGTH_LONG).show()
//                    }
                }
            }
        }
    }


    private fun setSingleProducts(intent: Intent) {
        val id = intent.getStringExtra("order_id")
        id?.let{orderIds->
            orderId = orderIds
            setOrdersFromDb(id)
        }
    }

    override fun onAccept(order: MyOrder) {

    }

    override fun AttachBasket(model: Order) {

    }

    override fun openOrderDetails(id: String) {

    }

    override fun completeOrder(model: ParentOrder, position: Int) {

    }

    private fun setOrdersFromDb(id: String) {
        var check=false
        Utility.getProducts(this@OrderDetailsActivity,id).observe(this,{ orders->
            orders?.let{
                if(orders.isNotEmpty()){
                    val listing = ArrayList<Any>()
                    for(temp in  orders){
                        listing.add(temp)
                        if(temp.quantity>temp.remaining){
                            check=true
                        }
                    }
                    if (check) {
                        completeBtn.text = "Start Scanning"
                        completeBtn.visibility=View.VISIBLE
                    }else{
                        completeBtn.text = "Order Completed/Close"
                        completeBtn.visibility=View.VISIBLE
                    }
                    val adapter = ProductsAdapter(this, listing,1,this@OrderDetailsActivity)
                    rvMain.layoutManager = LinearLayoutManager(this)
                    rvMain.adapter = adapter
                }
            }
            checkforOrderComplete()
        })

    }
    fun scanProductOrBasket() {
        val code = actionDialogHeadingEtv.text.toString().trim()
        recentProductCode = code
        if(code.isNullOrEmpty()){
            Toast.makeText(this@OrderDetailsActivity,"Scanned Product Code is INVALID", Toast.LENGTH_LONG).show()
        }else{
            Utility.checkProductRequired(code,orderId,this@OrderDetailsActivity).observe(this,{checkProds->
                recentsProductsList = checkProds
                if(checkProds.isNullOrEmpty()){
                    Toast.makeText(this@OrderDetailsActivity,"Invalid Product Scanned. Either full or not needed.",
                        Toast.LENGTH_LONG).show()
                }else{
                    setScanView(1)
                }
            })
        }
    }

    private fun setScanView(tag: Int) {
        actionDialogHeadingEtv.setText("")
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
        actionDialog.visibility = View.VISIBLE
    }

    private fun matchBasketOrAddProduct() {
        val code = actionDialogHeadingEtv.text.toString().trim()
        if(code.isNullOrEmpty()){
            Toast.makeText(this@OrderDetailsActivity,"Scanned Basked Code is INVALID",Toast.LENGTH_LONG).show()
        }else{
            Utility.checkBasketInOrders(code,orderId,this@OrderDetailsActivity).observe(this,{checkProds->
                if(checkProds.isNullOrEmpty()){
                    Toast.makeText(this@OrderDetailsActivity,"Basket scanned is Not attached to order.",Toast.LENGTH_LONG).show()
                }else{
                    val product = getProductsFromOrder()
                    product?.let {
                        it.remaining++
                        it.basketId = code
                        Utility.addProductToBaskedAndDatabase(product.toProductItemEntity(),
                            this@OrderDetailsActivity)
                        Toast.makeText(this@OrderDetailsActivity,"Product Added Successfully!",Toast.LENGTH_LONG).show()
                        actionDialogHeadingEtv.setText("")
                        setScanView(0)
                        Timer().schedule(object: TimerTask(){
                            override fun run() {
                                runOnUiThread{
                                    setOrdersFromDb(orderId)
                                }
                            }

                        },500)
                        return@observe

                    }

                }
            })
        }
    }

    private fun checkforOrderComplete() {
        Utility.getProducts(this@OrderDetailsActivity,orderId).observe(this,{
            if(it.isNullOrEmpty()){
                orderComplete = true
                actionDialog.visibility = View.GONE
                completeBtn.text = "Order Completed/Close"
                completeBtn.visibility = View.VISIBLE
            }
        })
    }

    private fun getProductsFromOrder(): Product? {
        if (recentsProductsList.isNotEmpty()) {
            for(temp in recentsProductsList){
                if(!temp?.productCode.isNullOrEmpty() && temp.productCode?:"" == recentProductCode ){
                    return temp
                }
            }
        }
        return null
    }
    fun completeOrder() {
        progressView.visibility = View.VISIBLE
        Utility.getOrders(this@OrderDetailsActivity,orderId).observe(this,{myOrders->
            myOrders?.let{parentOrder->
                if(parentOrder.isNotEmpty()){
                    var model = parentOrder[0]
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
                    updateOrder(orderNumber,orderId,baskets)
                }else{
                    runOnUiThread { progressView.visibility = View.GONE }
                }
            }
        })
    }

    private fun updateOrder(orderNumber: String,orderId: String,baskets:String) {
        try {
            progressView.visibility = View.VISIBLE
//            ProgressView.getInstance().showProgressDialog(this@OrderDetailsActivity)
            val order = com.woocom.models.Order()
            order.id = orderId.toInt()
            order.orderNumber = orderNumber
            order.status = "on-hold"
            val meta1 = Metadata()
            meta1.key = "basket_ids"
            meta1.value = baskets
            order.meta_data.add(meta1)
            val call = woocommerce.OrderRepository().update(orderId.toInt(), order)
            call.enqueue(object : Callback<com.woocom.models.Order?> {
                override fun onResponse(call: Call<com.woocom.models.Order?>, response: Response<com.woocom.models.Order?>) {
//                    ProgressView.getInstance().dismissDialog()
                    if (response.code() == 200) {
                        Toast.makeText(
                            this@OrderDetailsActivity,
                            response.message(),
                            Toast.LENGTH_SHORT
                        ).show()
                        Utility.removeCompletedOrderFromDb(this@OrderDetailsActivity,orderNumber)
                        Timer().schedule(object: TimerTask(){
                            override fun run() {
                                runOnUiThread{finish()}
                            }
                        },1000)
                        progressView.visibility = View.GONE
                    } else {
                        progressView.visibility = View.GONE
                        Toast.makeText(
                            this@OrderDetailsActivity,
                            response.message(),
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }

                override fun onFailure(call: Call<com.woocom.models.Order?>, t: Throwable) {
//                    ProgressView.getInstance().dismissDialog()
                    Toast.makeText(
                        this@OrderDetailsActivity,
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

}