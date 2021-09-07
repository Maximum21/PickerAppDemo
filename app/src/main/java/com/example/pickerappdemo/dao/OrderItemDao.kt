package com.example.pickerappdemo.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.pickerappdemo.entities.OrderItemEntitiy

@Dao
interface OrderItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(category: OrderItemEntitiy?): Long?

    @Query("SELECT * FROM orders ORDER BY orderNumber asc")
    fun fetchAll(): List<OrderItemEntitiy>

    @Query("SELECT * FROM orders ORDER BY orderNumber asc")
    fun items(): LiveData<List<OrderItemEntitiy>>

    @Query("SELECT COUNT(*) FROM orders")
    fun count(): LiveData<Int>

    @Query("SELECT COUNT(*) FROM orders where orderNumber = :orderNumber")
    fun exists(orderNumber: Int): LiveData<Boolean>

    @Query("SELECT Count(OrderNumber) FROM orders where orderNumber = :orderNumber")
    fun getQuantity(orderNumber: Int): LiveData<Int>

    @Query("SELECT * FROM orders WHERE orderNumber =:orderNumber")
    operator fun get(orderNumber: Int): LiveData<OrderItemEntitiy>

    @Update
    fun update(category: OrderItemEntitiy?)

    @Delete
    fun delete(category: OrderItemEntitiy?)

    @Query("DELETE FROM orders")
    fun deleteAll()
}