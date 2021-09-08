package com.example.pickerappdemo.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey


@Entity(
    foreignKeys = [ForeignKey(
        entity = OrderItemEntitiy::class,
        parentColumns = arrayOf("order_number"),
        childColumns = arrayOf("order_id"),
        onDelete = CASCADE
    ), ForeignKey(
        entity = BasketItemEntity::class,
        parentColumns = arrayOf("basket_code"),
        childColumns = arrayOf("basket_id"),
        onDelete = CASCADE
    )]
)
data class BasketReferenceEntity(

    @PrimaryKey
    @ColumnInfo(name = "id")
    var order_id: Int = 0,

    @ColumnInfo(name = "order_id")
    var orderId: String? = null,

    @ColumnInfo(name = "basket_id")
    var basketId: String? = null
)