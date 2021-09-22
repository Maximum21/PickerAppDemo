package com.martoo.picker.entities

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.martoo.picker.models.Order

@Entity(tableName = "orders")
data class OrderItemEntitiy (

    @ColumnInfo(name = "order_id")
    var order_id: String? = null,

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "order_number")
    var orderNumber: String,

    @ColumnInfo(name = "status")
    var status: String? = null,

    @ColumnInfo(name = "order_total")
    var order_total: String? = null,

    @ColumnInfo(name = "type")
    var type: String? = null,


    @ColumnInfo(name = "basketId")
    var basketId: String? = null,

    var completed: Int
)

fun Order.toOrderItemEntity() = OrderItemEntitiy(
    order_id = this.order_id,
    orderNumber = this.orderNumber,
    status = this.status,
    order_total = this.order_total,
    type = this.type,
    basketId = this.basketId
)

fun OrderItemEntitiy.toOrder() = Order(
    order_id = this.order_id,
    orderNumber = this.orderNumber,
    status = this.status,
    order_total = this.order_total,
    type = this.type,
    basketId = this.basketId
)