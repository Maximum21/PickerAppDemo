package com.martoo.picker.main

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContentInfo
import android.view.ContextMenu
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.martoo.picker.*
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

class ListingActivity : AppCompatActivity(),
    ListingView {
    private var recentCode: String = ""
    private lateinit var woocommerce: Woocommerce
    private lateinit var orderCompleteBtn: Button
    private lateinit var headerLL: LinearLayout
    private lateinit var rvMain: RecyclerView
    private lateinit var segmentedControl: SegmentedControl<*>
    private var attachBasket = false
    private var scanning = false
    var segmentSelected = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listing)
        woocommerce = getWooCommerce()
        rvMain = findViewById<RecyclerView>(R.id.rvMain)
        headerLL = findViewById<LinearLayout>(R.id.header)
        orderCompleteBtn = findViewById<Button>(R.id.orderCompleteBtn)
        segmentedControl = findViewById<SegmentedControl<*>>(R.id.segmented_control)
        segmentedControl.addOnSegmentSelectListener { segmentViewHolder, isSelected, isReselected ->
            if (isSelected && segmentViewHolder.absolutePosition!=segmentSelected) {
                when(segmentViewHolder.absolutePosition){
                    0->{
                        scanning=false
                        segmentSelected=0
                        setView(-1)
                    }
                    1->{
                        scanning=false
                        segmentSelected=1
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
        orderCompleteBtn.setOnClickListener {
            if(orderCompleteBtn.text.toString().toLowerCase() == "start scanning"){
                orderCompleteBtn.text = "Stop Scanning"
                scanning=true
            }else{
                scanning=false
                orderCompleteBtn.text = "Start Scanning"
            }
        }
        segmentedControl.setSelectedSegment(0)
    }

    private fun setRequest(list: List<Any>) {
        headerLL.visibility = View.GONE
        orderCompleteBtn.text = "Start Scanning"
        orderCompleteBtn.visibility = View.GONE
        val adapter = ProductsAdapter(this, list as ArrayList,0,this@ListingActivity)
        rvMain.layoutManager = LinearLayoutManager(this)
        rvMain.adapter = adapter
    }

    private fun setOrdersFromDb() {
        Utility.getOrders(this@ListingActivity).observe(this,{myOrders->
            myOrders?.let{
                if(it.isNotEmpty()){
                    val listing = ArrayList<Any>()
                    for(temp in  it){
                        listing.add(temp)
                    }
                    headerLL.visibility = View.GONE
                    orderCompleteBtn.text = "Start Scanning"
                    orderCompleteBtn.visibility = View.GONE
                    val adapter = ProductsAdapter(this, listing,2,this@ListingActivity)
                    rvMain.layoutManager = LinearLayoutManager(this)
                    rvMain.adapter = adapter
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
                    headerLL.visibility = View.VISIBLE
                    orderCompleteBtn.text = "Start Scanning"
                    orderCompleteBtn.visibility = View.VISIBLE
                    val adapter = ProductsAdapter(this, listing,1,this@ListingActivity)
                    rvMain.layoutManager = LinearLayoutManager(this)
                    rvMain.adapter = adapter
                }
            }
        })
    }

    fun checkBarCode(barcode: String,orderNumber:Int){
        recentCode=barcode
        Utility.checkBarCode(recentCode,orderNumber)
    }

    fun getWooCommerce(): Woocommerce {
        val token = SharedPrefHelper.readString(
            this,
            Config.token
        ) ?:""
        return Woocommerce.Builder()
            .setSiteUrl(Config.siteUrl)
            .setApiVersion(API_V3)
            .setConsumerKey(Config.consumerKey)
            .setConsumerSecret(Config.consumerSecret)
            .setToken(token)
            .build()
    }

    private fun setView(tag: Int) {

        val filter = OrderFilter()
        filter.setAccepted(tag)
        val test = woocommerce!!.OrderRepository().myOrders(filter)

        test.enqueue(object : Callback<List<MyOrder>> {
            override fun onResponse(
                call: Call<List<MyOrder>>,
                response: Response<List<MyOrder>>
            ) {
//                    ProgressView.getInstance().dismissDialog()
                if (response.code() == 200) {
                    assert(response.body() != null)
                    if (response.body()?.isNotEmpty() == true) {
                        //creating our adapter
                        when(segmentSelected){
                            0->{
                                setRequest(response.body()!!)
                            }
                            1->{
                                setOrders(this@ListingActivity,response.body()!!)
                            }
                        }

                    } else {

                    }
                }
            }

            override fun onFailure(call: Call<List<MyOrder>>, t: Throwable) {

            }
        })

    }

    private fun setOrders(context: Context, list: List<MyOrder>) {
        Utility.addOrders(context,list)
    }

    override fun onAccept(order: MyOrder) {
        updateOrder(order)
    }

    override fun AttachBasket(model: com.martoo.picker.models.Order) {

    }

    private fun updateOrder(orderTemp: MyOrder) {
        try {
//            ProgressView.getInstance().showProgressDialog(context)
            val order = com.woocom.models.Order()
            order.id = orderTemp.id
            order.orderNumber = orderTemp.orderNumber
            val meta = Metadata()
            meta.key = "accepted"
            meta.value = "1"
            val meta1 = Metadata()
            meta1.key = "accepted_by"
            meta1.value = "1"
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
                    } else {

                    }
                }

                override fun onFailure(call: Call<com.woocom.models.Order?>, t: Throwable) {

                }
            })
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}