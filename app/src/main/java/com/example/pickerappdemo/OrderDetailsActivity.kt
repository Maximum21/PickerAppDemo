package com.example.pickerappdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class OrderDetailsActivity : AppCompatActivity() {
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
        list.add(Product("","Product 1",5,false,0))
        list.add(Product("","Product 2",7,false,7))
        list.add(Product("","Product 4",7,false,6))
        list.add(Product("","Product 7",3,false,3))
        list.add(Product("","Product 9",2,false,2))
        list.add(Product("","Product 10",2,false,2))
        val adapter = ProductsAdapter(this, list,1)
        rvMain.layoutManager = LinearLayoutManager(this)
        rvMain.adapter = adapter
    }
}