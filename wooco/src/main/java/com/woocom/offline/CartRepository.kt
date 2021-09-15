package com.woocom.offline

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.room.Room
import com.woocom.offline.task.DeleteCartItem
import com.woocom.offline.task.InsertCartItem
import com.woocom.offline.task.UpdateCartItem
import com.woocom.offline.task.DeleteAllCartItems
import com.woocom.offline.utils.AppUtils
import com.woocom.offline.utils.Cart
import com.woocom.offline.utils.CartItem

class RoomCartRepository(val context: Context) {

    private val appDatabase: AppDatabase = Room
            .databaseBuilder(context, AppDatabase::class.java, Config.DB_NAME)
            .fallbackToDestructiveMigration()
            .build()


    fun addToCart(cartItem: CartItem) {
        if (cartItem.createdAt == null) {
            cartItem.createdAt = AppUtils.currentDateTime.time
        }

        InsertCartItem(appDatabase, cartItem).execute()
    }


    fun update(cartItem: CartItem) {
        cartItem.modifiedAt = AppUtils.currentDateTime.time
        UpdateCartItem(appDatabase, cartItem).execute()

    }

    fun count(): LiveData<Int> {
        return appDatabase.cartItemDao().count()
    }

    fun exists(productId: Int): LiveData<Boolean> {
        return appDatabase.cartItemDao().exists(productId)
    }
    fun getQuantity(productId: Int): LiveData<Int> {
        return appDatabase.cartItemDao().getQuantity(productId)
    }

    fun delete(cartItem: CartItem) {
        DeleteCartItem(appDatabase, cartItem).execute()
    }

    fun deleteAll() {
        DeleteAllCartItems(appDatabase).execute()
    }

    fun cartItem(id: Int): LiveData<CartItem> {
        return Transformations.map(
                appDatabase.cartItemDao().get(id)
        ) { cartItemEntity: CartItemEntity? ->
            cartItemEntity?.toCartItem()
        }
    }

    fun cart(): Cart {
        return Cart(
                items = Transformations.map(appDatabase.cartItemDao().items()) {
                    it.map { cartItemEntity -> cartItemEntity.toCartItem() }
                }
        )
    }

}
