package com.martoo.picker.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.martoo.picker.entities.ProductItemEntity

@Dao
interface ProductItemDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(category: ProductItemEntity?)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(category: List<ProductItemEntity>)

    @Query("SELECT * FROM products ORDER BY productId asc")
    fun fetchAll(): LiveData<List<ProductItemEntity>>

    @Query("SELECT * FROM products ORDER BY orderId asc")
    fun items(): LiveData<List<ProductItemEntity>>

    @Query("SELECT * FROM products where orderId = :id ORDER BY orderId asc")
    fun items(id: String): LiveData<List<ProductItemEntity>>


    @Query("DELETE FROM products WHERE orderId = :orderId")
    fun delete(orderId: String)

    @Query("SELECT COUNT(*) FROM products")
    fun count(): LiveData<Int>

    @Query("SELECT COUNT(*) FROM products where productId = :productId")
    fun exists(productId: Int): LiveData<Boolean>

    @Query("SELECT quantity FROM products where productId = :productId")
    fun getQuantity(productId: Int): LiveData<Int>

    @Query("SELECT * FROM products WHERE productId =:id")
    operator fun get(id: Int): LiveData<ProductItemEntity>

    @Update
    fun update(product: ProductItemEntity?)

    @Delete
    fun delete(product: ProductItemEntity?)

    @Query("DELETE FROM products")
    fun deleteAll()

    @Query("SELECT * FROM products where productCode = :code AND remaining < quantity ORDER BY productId asc")
    fun checkProductRequired(code: String): LiveData<List<ProductItemEntity>>

    @Query("SELECT * FROM products where productCode = :code AND orderId = :orderId AND remaining < quantity ORDER BY productId asc")
    fun checkProductRequired(code: String,orderId:String): LiveData<List<ProductItemEntity>>
}