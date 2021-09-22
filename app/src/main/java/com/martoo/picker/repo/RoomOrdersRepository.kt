package com.martoo.picker.repo

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.room.Room
import com.martoo.picker.*
import com.martoo.picker.database.AppDatabase
import com.martoo.picker.entities.*
import com.martoo.picker.models.Basket
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

    fun addOrdersToDb(context: Context, orders: List<Order>) {

        (InsertOrders(appDatabase, orders.map { order -> order.toOrderItemEntity() }).execute())
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

    fun products(id: Int): LiveData<Product> {
        return Transformations.map(
            appDatabase.productItemDao()[id]
        ) { cartItemEntity: ProductItemEntity? ->
            cartItemEntity?.toProduct()
        }
    }
    fun products(): LiveData<List<Product>> {
        return Transformations.map(
            appDatabase.productItemDao().items()
        ) { it.map { productItemEntity -> productItemEntity.toProduct() }
        }
    }
    fun testorders(): LiveData<List<Any>> {
        return appDatabase.orderItemDao().itemss()
    }

    fun orders(): LiveData<List<Order>> {
        return Transformations.map(appDatabase.orderItemDao().items()) {
                it.map { orderItemEntity -> orderItemEntity.toOrder() }
            }
    }
    fun orders(id:String): LiveData<List<Product>> {
        return Transformations.map(appDatabase.productItemDao().items(id)) {
            it.map { productItemEntity -> productItemEntity.toProduct() }
        }
    }
    fun ordersContainingBasket(barcode: String): LiveData<List<Basket>> {
        return Transformations.map(appDatabase.basketItemDao().itemsWithBasket(barcode)) {
                it.map { basketItemEntity -> basketItemEntity.toBasket() }
            }
    }

    fun addBasketToOrder(recentCode: String, orderNumber: String) {
        (InsertBasketToOrder(appDatabase, recentCode,orderNumber).execute())
    }

    fun checkProductRequired(code: String): LiveData<List<Product>> {
        return Transformations.map(appDatabase.productItemDao().checkProductRequired(code)) {
            it.map { productItemEntity -> productItemEntity.toProduct() }
        }
    }
    fun checkProductRequired(code: String,orderId: String): LiveData<List<Product>> {
        return Transformations.map(appDatabase.productItemDao().checkProductRequired(code,orderId)) {
            it.map { productItemEntity -> productItemEntity.toProduct() }
        }
    }

    fun checkBasketInOrders(code: String): LiveData<List<Basket>> {
        return Transformations.map(appDatabase.basketItemDao().checkBasketInOrders(code)) {
            it.map { basketItemEntity -> basketItemEntity.toBasket() }
        }
    }

    fun checkBasketInOrders(code: String,orderId: String): LiveData<List<Basket>> {
        return Transformations.map(appDatabase.basketItemDao().checkBasketInOrders(code,orderId)) {
            it.map { basketItemEntity -> basketItemEntity.toBasket() }
        }
    }

    fun addProductToBaskedAndDatabase(remaining: ProductItemEntity) {
        update(remaining.toProduct())
    }
}