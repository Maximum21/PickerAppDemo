package com.example.pickerappdemo.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.pickerappdemo.dao.ProductItemDao
import com.example.pickerappdemo.entities.ProductItemEntity

@Database(
    entities = [
        ProductItemEntity::class
    ], version = 1, exportSchema = false
)

abstract class AppDatabase : RoomDatabase() {
    abstract fun productItemDao(): ProductItemDao
}