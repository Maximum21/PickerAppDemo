package com.martoo.picker.entities

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.martoo.picker.models.Basket

@Entity(tableName = "baskets")
data class BasketItemEntity (

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "basket_code")
    var basket_code: String,

    @ColumnInfo(name = "order_id")
    var orderId: String
)

fun Basket.toBasketItemEntity()  = BasketItemEntity(
    basket_code = this.basket_code,
    orderId = this.orderId
)

fun BasketItemEntity.toBasket()  = Basket(
    basket_code = this.basket_code,
    orderId = this.orderId
)