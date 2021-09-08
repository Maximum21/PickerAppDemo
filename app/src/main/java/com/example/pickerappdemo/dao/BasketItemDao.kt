package com.example.pickerappdemo.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.pickerappdemo.entities.BasketItemEntity
import com.example.pickerappdemo.entities.OrderItemEntitiy

@Dao
interface BasketItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(category: BasketItemEntity?): Long?

    @Query("SELECT * FROM baskets ORDER BY basket_id asc")
    fun fetchAll(): List<OrderItemEntitiy>

//    @Query("SELECT * FROM baskets ORDER BY orderNumber asc")
//    fun items(): LiveData<List<OrderItemEntitiy>>
//
//    @Query("SELECT COUNT(*) FROM baskets")
//    fun count(): LiveData<Int>
//
//    @Query("SELECT COUNT(*) FROM baskets where basket_code = :basket_code")
//    fun exists(basket_code: String): LiveData<Boolean>
//
//    @Query("SELECT Count(OrderNumber) FROM baskets where orderNumber = :orderNumber")
//    fun getQuantity(orderNumber: Int): LiveData<Int>
//
//    @Query("SELECT * FROM baskets WHERE orderNumber =:orderNumber")
//    operator fun get(orderNumber: Int): LiveData<BasketItemEntity>

    @Update
    fun update(category: BasketItemEntity?)

    @Delete
    fun delete(category: BasketItemEntity?)

    @Query("DELETE FROM baskets")
    fun deleteAll()
}