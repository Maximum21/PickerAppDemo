package com.example.pickerappdemo.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pickerappdemo.ListingView
import com.example.pickerappdemo.ProductsAdapter
import com.example.pickerappdemo.R
import com.example.pickerappdemo.models.Product
import com.woocom.models.MyOrder

class OrderDetailsActivity : AppCompatActivity(),
    ListingView {
    private lateinit var headerLL: LinearLayout
    private lateinit var completeBtn: Button
    private lateinit var rvMain: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_details)
        rvMain = findViewById<RecyclerView>(R.id.rvMain)
        headerLL = findViewById<LinearLayout>(R.id.header)
        completeBtn = findViewById<Button>(R.id.orderCompleteBtn)
        setSingleProducts()
        completeBtn.setOnClickListener {
            finish()
        }
    }

    private fun setSingleProducts() {
        headerLL.visibility = View.VISIBLE
        val list = ArrayList<Any>()
        list.add(Product(1,"1","1","Product 1",5,"","","",false,0))
        list.add(Product(2,"2","2","Product 2",7,"","","",false,7))
        list.add(Product(3,"3","3","Product 4",7,"","","",false,6))
        list.add(Product(4,"4","4","Product 7",3,"","","",false,3))
        list.add(Product(5,"5","5","Product 9",2,"","","",false,2))
        list.add(Product(6,"6","6","Product 10",2,"","","",false,2))
        val adapter = ProductsAdapter(this, list,1,this@OrderDetailsActivity)
        rvMain.layoutManager = LinearLayoutManager(this)
        rvMain.adapter = adapter
    }

    override fun onAccept(order: MyOrder) {

    }
}