package com.example.pickerappdemo.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.pickerappdemo.dao.BasketItemDao
import com.example.pickerappdemo.dao.OrderItemDao
import com.example.pickerappdemo.dao.ProductItemDao
import com.example.pickerappdemo.entities.BasketItemEntity
import com.example.pickerappdemo.entities.OrderItemEntitiy
import com.example.pickerappdemo.entities.ProductItemEntity

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
    abstract fun BasketItemDao(): BasketItemDao
}