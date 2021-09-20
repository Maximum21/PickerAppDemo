package com.woocom.models

import com.google.gson.annotations.SerializedName

import java.util.ArrayList


class MyLineItem {

    var subtotal: String? = null

    @SerializedName("subtotal_tax")
    var subtotalTax: String? = null
    var total: String? = null
    var totalTax: String? = null
    var price: String? = null
    var quantity: Int = 0
    var taxClass: Any? = null
    var name: String? = null

    @SerializedName("product_id")
    var productId: Int = 0

    var sku: String? = null
    var variations: String? = null
    var barcode: String? = null

    var image_url: String? = null
    var points: Any? = null
//    var units: List<Any> = ArrayList()
}





