package com.example.pickerappdemo

import android.os.AsyncTask

class InsertCartItem(
private val appDatabase: AppDatabase,
private val product: Product
) :
AsyncTask<Void, Void, Long?>() {

    override fun doInBackground(vararg voids: Void): Long? {

        return appDatabase.productItemDao()
            .insert(product.toProductItemEntity())
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
