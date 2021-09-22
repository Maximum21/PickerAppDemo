package com.martoo.picker.entities

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey
import com.martoo.picker.models.Product

@Entity(tableName = "products",primaryKeys = ["productId","orderId"])

data class ProductItemEntity(
    @NonNull
    @ColumnInfo(name = "orderId")
    var orderId: String,

    @NonNull
    @ColumnInfo(name = "productId")
    var productId: String,

    @ColumnInfo(name = "basketId")
    var basketId: String? = null,

    @ColumnInfo(name = "productCode")
    var productCode: String? = null,

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
    productId = this.productId,
    orderId = this.orderId,
    quantity = this.quantity,
    basketId = this.basketId,
    productCode = this.productCode,
    name = this.name,
    selected = this.selected,
    remaining = this.remaining
)

fun Product.toProductItemEntity() = ProductItemEntity(
    productId = this.productId,
    orderId = this.orderId,
    productCode = this.productCode,
    quantity = this.quantity,
    basketId = this.basketId,
    name = this.name,
    selected = this.selected,
    remaining = this.remaining
)