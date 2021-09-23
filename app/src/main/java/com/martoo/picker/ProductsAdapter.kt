package com.martoo.picker

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.martoo.picker.entities.toOrder
import com.martoo.picker.entities.toProduct
import com.martoo.picker.interfaces.ListingView
import com.martoo.picker.models.Order
import com.martoo.picker.models.ParentOrder
import com.martoo.picker.models.Product
import com.woocom.models.MyOrder

class ProductsAdapter(var context: Context,var list: ArrayList<Any>,var viewType: Int,val view: ListingView) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {



    private inner class View1ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var title: TextView = itemView.findViewById(R.id.titleOrder)
        var acceptTv: TextView = itemView.findViewById(R.id.acceptTv)
        fun bind(position: Int) {
            val model = list[position] as MyOrder
            title.text = model.orderNumber
            acceptTv.setOnClickListener {
                view.onAccept(model)
            }
        }
    }

    private inner class ViewViewHolder(itemView: View) :
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

    private inner class View2ViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        var title: TextView = itemView.findViewById(R.id.titleOrder)
        var acceptTv: TextView = itemView.findViewById(R.id.acceptTv)
        fun bind(position: Int) {
            val model = list[position] as ParentOrder
            var check =false
            var order: Order? = null
            var basketStr = ""
            model.baskets?.let{baskets->
                for(temp in baskets){
                    basketStr += if(basketStr.isNullOrEmpty()){
                        temp.basket_code
                    }else{
                        ",${temp.basket_code}"
                    }
                }

            }
            model?.order?.let{orderEntity->
                order = orderEntity.toOrder()
                if (basketStr.isNotEmpty()) {
                    title.text = order?.orderNumber+"($basketStr)"
                }else{
                    title.text = order?.orderNumber
                }
            }
            model?.products?.let{productEntities->
                val products = productEntities.map { it.toProduct() }
                if(products.isNotEmpty()){
                    check = true
                }
                for(temp in products){
                    if(temp.quantity!=temp.remaining){
                        check=false
                        break
                    }
                }
            }
            if(check){
                acceptTv.text = "Completed"
            }else{
                acceptTv.text = "Attach Basket"
            }

            acceptTv.setOnClickListener {
                if(acceptTv.text.toString().lowercase() == "completed"){
                    view.completeOrder(model,position)
                }else{
                    order?.let{
                        view.AttachBasket(it)
                    }
                }
            }
            order?.order_id?.let{myOrderId->
                itemView.setOnClickListener { view.openOrderDetails(myOrderId) }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (viewType == 0) {
            return View1ViewHolder(
                LayoutInflater.from(context).inflate(R.layout.order_request_row, parent, false)
            )
        }else if(viewType==2){
            return View2ViewHolder(
                LayoutInflater.from(context).inflate(R.layout.order_request_row, parent, false)
            )
        }
        return ViewViewHolder(
            LayoutInflater.from(context).inflate(R.layout.products_list_row, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (viewType) {
            0 -> {
                (holder as View1ViewHolder).bind(position)
            }
            2 -> {
                (holder as View2ViewHolder).bind(position)
            }
            else -> {
                (holder as ViewViewHolder).bind(position)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return viewType
    }

    fun removeItem(position: Int) {
        if(list.size>position){
            list.removeAt(position)
            notifyItemRemoved(position)
        }
    }
}