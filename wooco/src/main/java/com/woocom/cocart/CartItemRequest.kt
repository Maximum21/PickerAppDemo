package com.woocom.cocart

import com.google.gson.annotations.SerializedName

data class CartItemRequest(
    @SerializedName("id")
    var productId: String,

    @SerializedName("quantity")
    var quantity: String,

    @SerializedName("variation_id")
    var variationId: Int? = null,

    @SerializedName("variation")
    var variation: Any? = null,

    @SerializedName("cart_item_data")
    var cartItemData: Any? = null,

    @SerializedName("refresh_totals")
    var refreshTotals: Boolean? = null,

    @SerializedName("return_cart")
    var returnCart: Boolean? = null
)