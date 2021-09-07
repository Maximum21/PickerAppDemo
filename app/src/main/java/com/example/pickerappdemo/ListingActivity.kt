package com.example.pickerappdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pickerappdemo.models.Order
import com.example.pickerappdemo.models.Product
import segmented_control.widget.custom.android.com.segmentedcontrol.SegmentedControl

class ListingActivity : AppCompatActivity() {
    private lateinit var orderCompleteBtn: Button
    private lateinit var headerLL: LinearLayout
    private lateinit var rvMain: RecyclerView
    private lateinit var segmentedControl: SegmentedControl<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listing)
        rvMain = findViewById<RecyclerView>(R.id.rvMain)
        headerLL = findViewById<LinearLayout>(R.id.header)
        orderCompleteBtn = findViewById<Button>(R.id.orderCompleteBtn)
        segmentedControl = findViewById<SegmentedControl<*>>(R.id.segmented_control)
        segmentedControl.addOnSegmentSelectListener { segmentViewHolder, isSelected, isReselected ->
            when(segmentViewHolder.absolutePosition){
                0->{
                  setRequest()
                }
                1->{
                    setOrders()
                }
                2->{
                    setProducts()
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

    private fun setRequest() {
        headerLL.visibility = View.GONE
        orderCompleteBtn.text = "Start Scanning"
        orderCompleteBtn.visibility = View.GONE
        val list = ArrayList<Any>()
        list.add(Order())
        list.add(Order())
        list.add(Order())
        list.add(Order())
        list.add(Order())
        list.add(Order())
        list.add(Order())
        list.add(Order())
        list.add(Order())
        val adapter = ProductsAdapter(this, list,0)
        rvMain.layoutManager = LinearLayoutManager(this)
        rvMain.adapter = adapter
    }

    private fun setOrders() {
        headerLL.visibility = View.GONE
        orderCompleteBtn.text = "Start Scanning"
        orderCompleteBtn.visibility = View.GONE
        val list = ArrayList<Any>()
        list.add(Order("order","Order 1","order-001","0","true"))
        list.add(Order("order","Order 2","order-002","0","true"))
        list.add(Order("order","Order 3","order-003","0","true"))
        list.add(Order("order","Order 4","order-004","0","true"))
        list.add(Order("order","Order 5","order-005","0","true"))
        list.add(Order("order","Order 6","order-006","0","true"))
        list.add(Order("order","Order 7","order-007","0","true"))
        list.add(Order("order","Order 8","order-008","0","true"))
        list.add(Order("order","Order 9","order-009","0","true"))
        val adapter = ProductsAdapter(this, list,0)
        rvMain.layoutManager = LinearLayoutManager(this)
        rvMain.adapter = adapter
    }

    private fun setProducts() {
        headerLL.visibility = View.VISIBLE
        orderCompleteBtn.visibility = View.VISIBLE
        val list = ArrayList<Any>()
        list.add(Product(1,"1","1","Product 1",5  ,"","","",false,0))
        list.add(Product(1,"1","1","Product 1",5  ,"","","",false,0))
        list.add(Product(1,"1","1","Product 1",5  ,"","","",false,0))
        list.add(Product(1,"1","1","Product 1",5  ,"","","",false,0))
        list.add(Product(1,"1","1","Product 1",5  ,"","","",false,0))
        list.add(Product(1,"1","1","Product 1",5  ,"","","",false,0))
        list.add(Product(1,"1","1","Product 1",5  ,"","","",false,0))
        list.add(Product(1,"1","1","Product 1",5  ,"","","",false,0))
        val adapter = ProductsAdapter(this, list,1)
        rvMain.layoutManager = LinearLayoutManager(this)
        rvMain.adapter = adapter
    }
}