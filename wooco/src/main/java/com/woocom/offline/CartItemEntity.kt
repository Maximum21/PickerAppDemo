package com.woocom.offline

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.woocom.offline.utils.CartItem

@Entity(tableName = "cart_item")
data class CartItemEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int?,

    @ColumnInfo(name = "created_at")
    var createdAt: Long? = null,

    @ColumnInfo(name = "modified_at")
    var modifiedAt: Long? = null,

    @ColumnInfo(name = "product_id")
    var productId: Int = 0,

    @ColumnInfo(name = "quantity")
    var quantity: Int = 0,

    @ColumnInfo(name = "variation_id")
    var variationId: Int? = 0,

    @ColumnInfo(name = "product_name")
    var productName: String? = "",

    @ColumnInfo(name = "product_points")
    var productPoints: String? = "",

    @ColumnInfo(name = "product_measurements")
    var productMeasurement: String? = "",

    @ColumnInfo(name = "product_price")
    var productPrice: String? = "",

    @ColumnInfo(name = "on_sale")
    var onSale: Boolean? = false,

    @ColumnInfo(name = "product_sale_price")
    var productSalePrice: String? = "",

    @ColumnInfo(name = "product_image")
    var productImage: String? = "",

    @ColumnInfo(name = "item_key")
    var itemKey: String? = ""

)

fun CartItemEntity.toCartItem() = CartItem(
    id = this.id,
    createdAt = this.createdAt,
    modifiedAt = this.modifiedAt,
    productId = this.productId,
    quantity = this.quantity,
    variationId = this.variationId,
    productName = this.productName,
    productPoints = this.productPoints,
    productMeasurement = this.productMeasurement,
    productPrice = this.productPrice,
    productSalePrice = this.productSalePrice,
    onSale = this.onSale,
    productImage = this.productImage,
    itemKey = this.itemKey
)

fun CartItem.toCartItemEntity() = CartItemEntity(
    id = this.id,
    createdAt = this.createdAt,
    modifiedAt = this.modifiedAt,
    productId = this.productId,
    quantity = this.quantity,
    variationId = this.variationId,
    productName = this.productName,
    productPoints = this.productPoints,
    productMeasurement = this.productMeasurement,
    productPrice = this.productPrice,
    productSalePrice = this.productSalePrice,
    onSale = this.onSale,
    productImage = this.productImage,
    itemKey = this.itemKey

)
