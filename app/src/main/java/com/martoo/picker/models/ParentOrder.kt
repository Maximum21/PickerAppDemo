package com.martoo.picker.models

import androidx.room.Embedded
import androidx.room.Relation
import com.martoo.picker.entities.BasketItemEntity
import com.martoo.picker.entities.OrderItemEntitiy
import com.martoo.picker.entities.ProductItemEntity

data class ParentOrder (
    @Embedded val order: OrderItemEntitiy,
    @Relation(parentColumn = "order_number",entityColumn = "orderId")
    val products: List<ProductItemEntity>,
    @Relation(parentColumn = "order_number",entityColumn = "order_id")
    val baskets: List<BasketItemEntity>
        )