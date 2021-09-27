package com.martoo.picker.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.martoo.picker.entities.BasketItemEntity
import com.martoo.picker.entities.OrderItemEntitiy
import com.martoo.picker.models.Order
import com.martoo.picker.models.ParentOrder
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

    @Transaction
    @Query("SELECT * FROM orders ORDER BY order_id asc")
    fun itemsNew(): LiveData<List<ParentOrder>>

    @Transaction
    @Query("SELECT * FROM orders WHERE order_number = :orderId ORDER BY order_id asc")
    fun itemsNew(orderId: String): LiveData<List<ParentOrder>>

    @Transaction
    @Query("SELECT o.order_id,o.order_number,o.status,o.type,o.basketId,o.order_total, (SELECT Count(p.orderId) From products WHERE p.quantity != p.remaining AND o.order_id = p.orderId) as completed FROM orders o ,products p ORDER BY order_id asc")
    fun itemss(): LiveData<List<OrderItemEntitiy>>



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

    @Query("DELETE FROM orders WHERE order_number = :orderId")
    fun delete(orderId: String)

    @Query("DELETE FROM orders")
    fun deleteAll()
}