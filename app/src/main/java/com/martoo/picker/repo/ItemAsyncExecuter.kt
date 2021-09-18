package com.martoo.picker.repo

import android.os.AsyncTask
import com.martoo.picker.database.AppDatabase
import com.martoo.picker.entities.OrderItemEntitiy
import com.martoo.picker.entities.ProductItemEntity
import com.martoo.picker.entities.toOrderItemEntity
import com.martoo.picker.entities.toProductItemEntity
import com.martoo.picker.models.Order
import com.martoo.picker.models.Product

class InsertOrder(
    private val appDatabase: AppDatabase,
    private val order: Order
) :
AsyncTask<Void, Void, Long?>() {

    override fun doInBackground(vararg voids: Void): Long? {
        appDatabase.orderItemDao()
            .insert(order.toOrderItemEntity())
        return 1
    }
}

class InsertOrders(
    private val appDatabase: AppDatabase,
    private val orders: List<OrderItemEntitiy>
) :
AsyncTask<Void, Void, Long?>() {

    override fun doInBackground(vararg voids: Void): Long? {
        appDatabase.orderItemDao()
            .insert(orders)
        return 1
    }
}


class InsertProducts(
    private val appDatabase: AppDatabase,
    private val products: List<ProductItemEntity>
) :
AsyncTask<Void, Void, Long?>() {

    override fun doInBackground(vararg voids: Void): Long? {
        appDatabase.productItemDao()
            .insert(products)
        return 1
    }
}

class UpdateCartItem(
    private val appDatabase: AppDatabase,
    private val product: Product
) :
    AsyncTask<Void, Void, Unit>() {

    override fun doInBackground(vararg voids: Void) {
        return appDatabase.productItemDao().update(product.toProductItemEntity())
    }
}

class DeleteCartItem(
    private val appDatabase: AppDatabase,
    private val product: Product
) :
    AsyncTask<Void, Void, Unit>() {

    override fun doInBackground(vararg voids: Void) {
        return appDatabase.productItemDao().delete(product.toProductItemEntity())
    }
}

class DeleteAllCartItems(
    private val appDatabase: AppDatabase,
) :
    AsyncTask<Void, Void, Unit>() {

    override fun doInBackground(vararg voids: Void) {
        return appDatabase.productItemDao().deleteAll()
    }
}
