package com.woocom.offline.task

import android.os.AsyncTask
import com.woocom.offline.AppDatabase
import com.woocom.offline.toCartItemEntity
import com.woocom.offline.utils.CartItem

class InsertCartItem(
    private val appDatabase: AppDatabase,
    private val cartItem: CartItem
) :
    AsyncTask<Void, Void, Long?>() {

    override fun doInBackground(vararg voids: Void): Long? {

        return appDatabase.cartItemDao()
            .insert(cartItem.toCartItemEntity())
    }
}

class UpdateCartItem(
    private val appDatabase: AppDatabase,
    private val cartItem: CartItem
) :
    AsyncTask<Void, Void, Unit>() {

    override fun doInBackground(vararg voids: Void) {
        return appDatabase.cartItemDao().update(cartItem.toCartItemEntity())
    }
}

class DeleteCartItem(
    private val appDatabase: AppDatabase,
    private val cartItem: CartItem
) :
    AsyncTask<Void, Void, Unit>() {

    override fun doInBackground(vararg voids: Void) {
        return appDatabase.cartItemDao().delete(cartItem.toCartItemEntity())
    }
}

class DeleteAllCartItems(
    private val appDatabase: AppDatabase,
) :
    AsyncTask<Void, Void, Unit>() {

    override fun doInBackground(vararg voids: Void) {
        return appDatabase.cartItemDao().deleteAll()
    }
}
