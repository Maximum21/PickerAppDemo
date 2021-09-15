package com.martoo.picker.repo

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.room.Room
import com.martoo.picker.*
import com.martoo.picker.database.AppDatabase
import com.martoo.picker.entities.ProductItemEntity
import com.martoo.picker.entities.toOrder
import com.martoo.picker.entities.toProduct
import com.martoo.picker.entities.toProductItemEntity
import com.martoo.picker.models.Order
import com.martoo.picker.models.Product

class RoomOrdersRepository(val context: Context) {

    private val appDatabase: AppDatabase = Room
        .databaseBuilder(context, AppDatabase::class.java, Config.DB_NAME)
        .fallbackToDestructiveMigration()
        .build()

    fun addOrderToDb(order: Order) {

        InsertOrder(appDatabase, order).execute()
    }

    fun addProductsToDb(products: List<Product>){
        InsertProducts(appDatabase, products.map { it.toProductItemEntity() }).execute()
    }


    fun update(product: Product) {
        UpdateCartItem(appDatabase, product).execute()

    }

    fun count(): LiveData<Int> {
        return appDatabase.productItemDao().count()
    }

    fun exists(productId: Int): LiveData<Boolean> {
        return appDatabase.productItemDao().exists(productId)
    }
    fun getQuantity(productId: Int): LiveData<Int> {
        return appDatabase.productItemDao().getQuantity(productId)
    }

    fun delete(product: Product) {
        DeleteCartItem(appDatabase, product).execute()
    }

    fun deleteAll() {
        DeleteAllCartItems(appDatabase).execute()
    }

    fun cartItem(id: Int): LiveData<Product> {
        return Transformations.map(
            appDatabase.productItemDao()[id]
        ) { cartItemEntity: ProductItemEntity? ->
            cartItemEntity?.toProduct()
        }
    }

    fun orders(): LiveData<List<Order>> {
        return Transformations.map(appDatabase.orderItemDao().items()) {
                it.map { orderItemEntity -> orderItemEntity.toOrder() }
            }
    }
}