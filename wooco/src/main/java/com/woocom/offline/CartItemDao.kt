package com.woocom.offline

import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE

@Dao
interface CartItemDao {
    @Insert(onConflict = REPLACE)
    fun insert(category: CartItemEntity?): Long?

    @Query("SELECT * FROM cart_item ORDER BY created_at desc")
    fun fetchAll(): List<CartItemEntity>

    @Query("SELECT * FROM cart_item ORDER BY created_at desc")
    fun items(): LiveData<List<CartItemEntity>>

    @Query("SELECT COUNT(*) FROM cart_item")
    fun count(): LiveData<Int>

    @Query("SELECT COUNT(*) FROM cart_item where product_id = :productId")
    fun exists(productId: Int): LiveData<Boolean>

    @Query("SELECT quantity FROM cart_item where product_id = :productId")
    fun getQuantity(productId: Int): LiveData<Int>

    @Query("SELECT * FROM cart_item WHERE id =:id")
    operator fun get(id: Int): LiveData<CartItemEntity>

    @Update
    fun update(category: CartItemEntity?)

    @Delete
    fun delete(category: CartItemEntity?)

    @Query("DELETE FROM cart_item")
    fun deleteAll()
}