package com.example.pickerappdemo.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.pickerappdemo.models.Order

@Entity(tableName = "orders")
data class OrderItemEntitiy (

    @ColumnInfo(name = "orderName")
    var orderName: String? = null,

    @PrimaryKey
    @ColumnInfo(name = "orderNumber")
    var orderNumber: String? = null,

    @ColumnInfo(name = "status")
    var status: String? = null,

    @ColumnInfo(name = "type")
    var type: String? = null,


    @ColumnInfo(name = "basketId")
    var basketId: String? = null
)

fun Order.toOrderItemEntitiy() = OrderItemEntitiy(
    orderName = this.orderName,
    orderNumber = this.orderNumber,
    status = this.status,
    type = this.type,
    basketId = this.basketId
)

fun Order.toOrder() = Order(
    orderName = this.orderName,
    orderNumber = this.orderNumber,
    status = this.status,
    type = this.type,
    basketId = this.basketId
)