package com.martoo.picker

import android.app.Activity
import android.content.Context
import android.text.TextUtils
import android.util.Log
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import androidx.lifecycle.LiveData
import com.martoo.picker.entities.ProductItemEntity
import com.martoo.picker.models.Basket
import com.martoo.picker.models.Order
import com.martoo.picker.models.ParentOrder
import com.martoo.picker.models.Product
import com.martoo.picker.repo.RoomOrdersRepository
import com.martoo.picker.ui.ListingActivity
import com.woocom.Woocommerce
import com.woocom.Woocommerce.Companion.API_V3
import com.woocom.models.MyOrder
import java.util.*

object Utility {

    private var instance: Utility? = null

    fun getInstance(): Utility? {
        if (instance == null) instance = Utility
        return instance
    }

    fun getWooCommerce(token:String?): Woocommerce? {
        return token?.let {
            Woocommerce.Builder()
                .setSiteUrl(Config.siteUrl)
                .setApiVersion(API_V3)
                .setConsumerKey(Config.consumerKey)
                .setConsumerSecret(Config.consumerSecret)
                .setToken(it)
                .build()
        }
    }
    fun isValid(vararg editTexts: TextView): Boolean {
        var isValid = true
        for (edt in editTexts) {
            if (TextUtils.isEmpty(edt.text.toString().trim { it <= ' ' })) {
                edt.error = "Required"
                isValid = false
            }
        }
        return isValid
    }


    fun hideKeyboard(activity: Activity) {
        try {
            val inputManager = activity
                .getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            val currentFocusedView = activity.currentFocus
            if (currentFocusedView != null) {
                inputManager.hideSoftInputFromWindow(
                    currentFocusedView.windowToken,
                    InputMethodManager.RESULT_HIDDEN
                )
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun addOrder(context: Context, order: MyOrder) {
        try {
            val repository = RoomOrdersRepository(context)
            val item: Order = convertToOrder(order)
            val orders = RoomOrdersRepository(context).orders()
            var check: List<Order>? = null
            orders.observe(context as ListingActivity, { myOrders ->
                myOrders?.let {
                    if (it.isNotEmpty()) {
                        check =
                            it.filter { orderTemp -> orderTemp.orderNumber == order.orderNumber }

                    }
                }

            })
            if (check == null || check?.size ?: 0 <= 0) {
                repository.addOrderToDb(item)
                repository.addProductsToDb(order.lineItems.map { tempProduct ->
                    val product = Product()
                    product.orderId = order.orderNumber
                    product.productId = tempProduct.productId.toString()
                    product.name = tempProduct.name
                    if(tempProduct.barcode.isNullOrEmpty()){
                        product.productCode = tempProduct.productId.toString()+item.orderNumber
                    }else{
                        product.productCode = tempProduct.barcode
                    }
                    product.product_sku = tempProduct.sku
                    product.quantity = tempProduct.quantity
                    product.remaining = 0
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

    fun getOrders(context: Context): LiveData<List<ParentOrder>> {
        return RoomOrdersRepository(context).ordersNew()
    }

    fun getOrders(context: Context,orderId: String): LiveData<List<ParentOrder>> {
        return RoomOrdersRepository(context).ordersNew(orderId)
    }
    fun getProducts(context: Context,id: String): LiveData<List<Product>> {
        return RoomOrdersRepository(context).orders(id)
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
                    if(tempProduct.barcode.isNullOrEmpty()){
                        product.productCode = tempProduct.productId.toString()+item.orderNumber
                    }else{
                        product.productCode = tempProduct.barcode
                    }
                    product.product_sku = tempProduct.sku
                    product.quantity = tempProduct.quantity
                    product.remaining = 0
                    return@map product
                })
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun checkBarCode(recentCode: String,context: Context): LiveData<List<Basket>> {
        val repository = RoomOrdersRepository(context)
        return repository.ordersContainingBasket(recentCode)
    }

    fun addBasektToOrder(recentCode: String, orderNumber: String, context: Context) {
        val repository = RoomOrdersRepository(context)
        return repository.addBasketToOrder(recentCode,orderNumber)
    }

    fun checkProductRequired(code: String, context: Context): LiveData<List<Product>> {
        val repository = RoomOrdersRepository(context)
        return repository.checkProductRequired(code)
    }

    fun checkBasketInOrders(code: String, context: Context): LiveData<List<Basket>> {
        val repository = RoomOrdersRepository(context)
        return repository.checkBasketInOrders(code)
    }

    fun checkBasketInOrders(code: String,orderId: String, context: Context): LiveData<List<Basket>> {
        val repository = RoomOrdersRepository(context)
        return repository.checkBasketInOrders(code,orderId)
    }

    fun addProductToBaskedAndDatabase(
        remaining:ProductItemEntity,
        context: Context
    ) {
        val repository = RoomOrdersRepository(context)
        return repository.addProductToBaskedAndDatabase(remaining)
    }

    fun checkProductRequired(code: String, orderId: String, context: Context): LiveData<List<Product>> {
        val repository = RoomOrdersRepository(context)
        return repository.checkProductRequired(code,orderId)
    }

    fun removeCompletedOrderFromDb(context: Context,orderId: String) {
        val repository = RoomOrdersRepository(context)
        repository.removeCompletedOrder(orderId)
    }
    fun getWooCommerce(context: Context): Woocommerce {
        val token = SharedPrefHelper.readString(
            context,
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

}