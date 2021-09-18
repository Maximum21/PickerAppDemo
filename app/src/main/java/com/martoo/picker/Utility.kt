package com.martoo.picker

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import com.martoo.picker.main.ListingActivity
import com.woocom.models.MyOrder
import com.martoo.picker.models.Order
import com.martoo.picker.models.Product
import com.martoo.picker.repo.RoomOrdersRepository
import java.lang.Exception

object Utility {
    fun addOrder(context: Context, order: MyOrder) {
        try {
            val repository = RoomOrdersRepository(context)
            val item: Order = convertToOrder(order)
            val orders = RoomOrdersRepository(context).orders()
            var check : List<Order>? = null
            orders.observe(context as ListingActivity,{ myOrders->
                myOrders?.let{
                    if(it.isNotEmpty()){
                        Log.e("testingorders","====${it.size}")
                        check = it.filter { orderTemp -> orderTemp.orderNumber ==  order.orderNumber }

                    }
                }

            })
            if(check==null || check?.size?:0 <= 0){
                repository.addOrderToDb(item)
                repository.addProductsToDb(order.lineItems.map {tempProduct->
                    val product = Product()
                    product.orderId = order.orderNumber
                    product.productId = tempProduct.productId.toString()
                    product.name = tempProduct.name
                    product.productCode = tempProduct.barcode
                    product.product_sku = tempProduct.sku
                    product.quantity = tempProduct.quantity
                    product.remaining = tempProduct.quantity
                    return@map product
                })
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun convertToOrder(orderTemp: MyOrder): Order {
        val order = Order()
        order.order_id = orderTemp.id.toString()
        order.orderNumber = orderTemp.orderNumber
        order.order_total = orderTemp.total
        order.status = orderTemp.status
        order.type = "accepted"
        return order
    }

    fun getOrders(context: Context): LiveData<List<Order>> {
       return RoomOrdersRepository(context).orders()
    }
    fun getProducts(context: Context): LiveData<List<Product>> {
       return RoomOrdersRepository(context).products()
    }

    fun addOrders(context: Context, list: List<MyOrder>) {
        try {
            val repository = RoomOrdersRepository(context)
            for(order in list){
                val item: Order = convertToOrder(order)
                repository.addOrderToDb(item)
                repository.addProductsToDb(order.lineItems.map {tempProduct->
                    val product = Product()
                    product.orderId = order.orderNumber
                    product.productId = tempProduct.productId.toString()
                    product.name = tempProduct.name
                    product.productCode = tempProduct.barcode
                    product.product_sku = tempProduct.sku
                    product.quantity = tempProduct.quantity
                    product.remaining = tempProduct.quantity
                    return@map product
                })
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun checkBarCode(recentCode: String, orderNumber: Int) {

    }
}