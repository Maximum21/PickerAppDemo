package com.martoo.picker.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.martoo.picker.dao.BasketItemDao
import com.martoo.picker.dao.OrderItemDao
import com.martoo.picker.dao.ProductItemDao
import com.martoo.picker.entities.BasketItemEntity
import com.martoo.picker.entities.OrderItemEntitiy
import com.martoo.picker.entities.ProductItemEntity

@Database(
    entities = [
        ProductItemEntity::class,
        OrderItemEntitiy::class,
        BasketItemEntity::class
    ], version = 1, exportSchema = false
)

abstract class AppDatabase : RoomDatabase() {
    abstract fun productItemDao(): ProductItemDao
    abstract fun orderItemDao(): OrderItemDao
    abstract fun basketItemDao(): BasketItemDao
}