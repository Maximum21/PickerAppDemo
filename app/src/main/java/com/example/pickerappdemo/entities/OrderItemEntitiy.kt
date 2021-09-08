package com.example.pickerappdemo.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.pickerappdemo.models.Order

@Entity(tableName = "orders")
data class OrderItemEntitiy (

    @ColumnInfo(name = "order_id")
    var order_id: String? = null,

    @PrimaryKey
    @ColumnInfo(name = "order_number")
    var orderNumber: String? = null,

    @ColumnInfo(name = "status")
    var status: String? = null,

    @ColumnInfo(name = "order_total")
    var order_total: Int = 0,

    @ColumnInfo(name = "type")
    var type: String? = null,


    @ColumnInfo(name = "basketId")
    var basketId: String? = null
)

fun Order.toOrderItemEntity() = OrderItemEntitiy(
    order_id = this.order_id,
    orderNumber = this.orderNumber,
    status = this.status,
    order_total = this.order_total,
    type = this.type,
    basketId = this.basketId
)

fun Order.toOrder() = Order(
    order_id = this.order_id,
    orderNumber = this.orderNumber,
    status = this.status,
    order_total = this.order_total,
    type = this.type,
    basketId = this.basketId
)