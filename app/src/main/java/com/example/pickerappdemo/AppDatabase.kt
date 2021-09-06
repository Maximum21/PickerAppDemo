package com.example.pickerappdemo

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [
        ProductItemEntity::class
    ], version = 1, exportSchema = false
)

abstract class AppDatabase : RoomDatabase() {
    abstract fun productItemDao(): ProductItemDao
}