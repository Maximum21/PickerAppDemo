package com.martoo.picker.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
    private lateinit var woocommerce: Woocommerce
    private lateinit var orderCompleteBtn: Button
    private lateinit var headerLL: LinearLayout
    private lateinit var rvMain: RecyclerView
    private lateinit var segmentedControl: SegmentedControl<*>

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
            if (isSelected) {
                when(segmentViewHolder.absolutePosition){
                    0->{
                        segmentSelected=0
                        setView(-1)
                    }
                    1->{
                        segmentSelected=1
                        setView(1)
                    }
                    2->{
                        setProducts()
                    }
                }
            }
        }
        orderCompleteBtn.setOnClickListener {
            if(orderCompleteBtn.text.toString().toLowerCase() == "start scanning"){
                orderCompleteBtn.text = "Stop Scanning"
            }else{
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

    private fun setOrders(list: List<Any>) {
        Utility.getOrders(this@ListingActivity).observe(this,{myOrders->
            myOrders?.let{
                if(it.isNotEmpty()){
                    headerLL.visibility = View.GONE
                    orderCompleteBtn.text = "Start Scanning"
                    orderCompleteBtn.visibility = View.GONE
                    val adapter = ProductsAdapter(this, it as ArrayList<Any>,0,this@ListingActivity)
                    rvMain.layoutManager = LinearLayoutManager(this)
                    rvMain.adapter = adapter
                }
            }
        })
    }

    private fun setProducts() {
        headerLL.visibility = View.VISIBLE
        orderCompleteBtn.visibility = View.VISIBLE
//        val adapter = ProductsAdapter(this, list,1)
//        rvMain.layoutManager = LinearLayoutManager(this)
//        rvMain.adapter = adapter
    }

    public fun getOrders(){

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
                                setOrders(response.body()!!)
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

    override fun onAccept(order: MyOrder) {
        updateOrder(order)
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