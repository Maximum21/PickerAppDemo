package com.martoo.picker.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.martoo.picker.entities.BasketItemEntity
import com.martoo.picker.entities.OrderItemEntitiy

@Dao
interface BasketItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(category: BasketItemEntity?)

    @Query("SELECT * FROM baskets ORDER BY basket_code asc")
    fun fetchAll(): List<BasketItemEntity>

    @Query("SELECT * FROM baskets where basket_code = :barcode ORDER BY order_id asc")
    fun itemsWithBasket(barcode:String): LiveData<List<BasketItemEntity>>

    @Update
    fun update(category: BasketItemEntity?)

    @Delete
    fun delete(category: BasketItemEntity?)

    @Query("DELETE FROM baskets WHERE order_id = :orderId")
    fun delete(orderId: String)

    @Query("DELETE FROM baskets")
    fun deleteAll()

    @Query("SELECT * FROM baskets where basket_code = :code ORDER BY order_id asc")
    fun checkBasketInOrders(code: String): LiveData<List<BasketItemEntity>>

    @Query("SELECT * FROM baskets where basket_code = :code AND order_id = :orderId ORDER BY order_id asc")
    fun checkBasketInOrders(code: String,orderId: String): LiveData<List<BasketItemEntity>>
}