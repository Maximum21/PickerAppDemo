package com.example.pickerappdemo.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.pickerappdemo.models.Basket

@Entity(tableName = "baskets")
data class BasketItemEntity (
    @PrimaryKey(autoGenerate = true)
    var id: Int?,

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