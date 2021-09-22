package com.martoo.picker.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.martoo.picker.entities.BasketItemEntity
import com.martoo.picker.entities.OrderItemEntitiy
import io.reactivex.Flowable

@Dao
interface OrderItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(category: OrderItemEntitiy)


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(category: List<OrderItemEntitiy>)

    @Query("SELECT * FROM orders ORDER BY order_id asc")
    fun fetchAll(): List<OrderItemEntitiy>

    @Query("SELECT * FROM orders ORDER BY order_id asc")
    fun items(): LiveData<List<OrderItemEntitiy>>

    @Query("SELECT o.*, (SELECT Count(p.orderId) From products WHERE p.quantity < p.remaining AND o.order_id = p.orderId) as completed FROM orders o ,products p ORDER BY order_id asc")
    fun itemss(): LiveData<List<Any>>



    @Query("SELECT COUNT(*) FROM orders")
    fun count(): LiveData<Int>

    @Query("SELECT COUNT(*) FROM orders where order_number = :orderNumber")
    fun exists(orderNumber: Int): LiveData<Boolean>

    @Query("SELECT Count(order_number) FROM orders where order_number = :orderNumber")
    fun getQuantity(orderNumber: Int): LiveData<Int>

    @Query("SELECT * FROM orders WHERE order_number =:orderNumber")
    operator fun get(orderNumber: Int): LiveData<OrderItemEntitiy>

    @Update
    fun update(category: OrderItemEntitiy?)

    @Delete
    fun delete(category: OrderItemEntitiy?)

    @Query("DELETE FROM orders")
    fun deleteAll()
}