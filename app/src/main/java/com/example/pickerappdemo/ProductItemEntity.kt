package com.example.pickerappdemo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class ProductItemEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int?,

    @ColumnInfo(name = "orderId")
    var orderId: String? = null,

    @ColumnInfo(name = "productId")
    var productId: String? = null,

    @ColumnInfo(name = "basketId")
    var basketId: String? = null,

    @ColumnInfo(name = "name")
    var name: String? = null,

    @ColumnInfo(name = "quantity")
    var quantity: Int = 0,

    @ColumnInfo(name = "selected")
    var selected: Boolean = false,

    @ColumnInfo(name = "remaining")
    var remaining: Int = 0,
)

fun ProductItemEntity.toProduct() = Product(
    id = this.id,
    productId = this.productId,
    orderId = this.orderId,
    quantity = this.quantity,
    basketId = this.basketId,
    name = this.name,
    selected = this.selected,
    remaining = this.remaining
)

fun Product.toProductItemEntity() = ProductItemEntity(
    id = this.id,
    productId = this.productId,
    orderId = this.orderId,
    quantity = this.quantity,
    basketId = this.basketId,
    name = this.name,
    selected = this.selected,
    remaining = this.remaining
)