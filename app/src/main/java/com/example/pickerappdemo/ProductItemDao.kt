package com.example.pickerappdemo

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ProductItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(category: ProductItemEntity?): Long?

    @Query("SELECT * FROM products ORDER BY id asc")
    fun fetchAll(): List<ProductItemEntity>

    @Query("SELECT * FROM products ORDER BY orderId asc")
    fun items(): LiveData<List<ProductItemEntity>>

    @Query("SELECT COUNT(*) FROM products")
    fun count(): LiveData<Int>

    @Query("SELECT COUNT(*) FROM products where productId = :productId")
    fun exists(productId: Int): LiveData<Boolean>

    @Query("SELECT quantity FROM products where productId = :productId")
    fun getQuantity(productId: Int): LiveData<Int>

    @Query("SELECT * FROM products WHERE id =:id")
    operator fun get(id: Int): LiveData<ProductItemEntity>

    @Update
    fun update(category: ProductItemEntity?)

    @Delete
    fun delete(category: ProductItemEntity?)

    @Query("DELETE FROM products")
    fun deleteAll()
}