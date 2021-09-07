package com.example.pickerappdemo

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pickerappdemo.models.Order
import com.example.pickerappdemo.models.Product

class ProductsAdapter(var context: Context,var list: ArrayList<Any>,var viewType: Int) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {



    private inner class View1ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var title: TextView = itemView.findViewById(R.id.titleOrder)
        var acceptTv: TextView = itemView.findViewById(R.id.acceptTv)
        fun bind(position: Int) {
            val model = list[position] as Order
            title.text = model.orderName
            if(model.type?.equals("type") == true){
                acceptTv.visibility  = View.INVISIBLE
                itemView.setOnClickListener {
                    context.startActivity(Intent(context, OrderDetailsActivity::class.java))
                }
            }else{
                acceptTv.visibility  = View.VISIBLE
            }
        }
    }

    private inner class View2ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var title: TextView = itemView.findViewById(R.id.productName)
        var qty: TextView = itemView.findViewById(R.id.productQty)
        var rem: TextView = itemView.findViewById(R.id.productRem)
        fun bind(position: Int) {
            val model = list[position] as Product
            title.text = model.name
            qty.text = model.quantity.toString()
            rem.text = model.remaining.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == 0) {
            return View1ViewHolder(
                LayoutInflater.from(context).inflate(R.layout.order_request_row, parent, false)
            )
        }
        return View2ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.products_list_row, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (viewType == 0) {
            (holder as View1ViewHolder).bind(position)
        } else {
            (holder as View2ViewHolder).bind(position)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return viewType
    }
}