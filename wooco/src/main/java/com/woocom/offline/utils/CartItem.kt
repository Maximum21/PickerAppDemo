package com.woocom.offline.utils


data class CartItem(
    var id: Int? = null,
    var createdAt: Long? = null,
    var modifiedAt: Long? = null,
    var productId: Int = 0,
    var variationId: Int? = 0,
    var quantity: Int = 0,

    var productName: String? = "",
    var onSale: Boolean? = false,
    var productSalePrice: String? = "",
    var productPrice: String? = "",
    var productImage: String? = "",
    var productPoints: String? = "",
    var productMeasurement: String? = "",
    var priceChange: Boolean = false,
    var itemKey: String? = ""

)