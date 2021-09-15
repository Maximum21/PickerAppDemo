package com.example.pickerappdemo.repo

import android.os.AsyncTask
import com.example.pickerappdemo.database.AppDatabase
import com.example.pickerappdemo.entities.ProductItemEntity
import com.example.pickerappdemo.entities.toOrderItemEntity
import com.example.pickerappdemo.entities.toProductItemEntity
import com.example.pickerappdemo.models.Order
import com.example.pickerappdemo.models.Product

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
