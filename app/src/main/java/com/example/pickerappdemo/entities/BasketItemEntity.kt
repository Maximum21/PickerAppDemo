package com.example.pickerappdemo.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.pickerappdemo.models.Basket

@Entity(tableName = "baskets")
data class BasketItemEntity (
    @ColumnInfo(name = "basket_id")
    var id: Int = 0,

    @PrimaryKey
    @ColumnInfo(name = "basket_code")
    var basket_code: String? = null
)

fun Basket.toBasketItemEntity()  = BasketItemEntity(
    id = this.id,
    basket_code = this.basket_code
)

fun Basket.toBasket()  = Basket(
    id = this.id,
    basket_code = this.basket_code
)