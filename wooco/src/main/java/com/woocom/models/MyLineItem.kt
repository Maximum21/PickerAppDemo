package com.woocom.models

import com.google.gson.annotations.SerializedName

import java.util.ArrayList


class MyLineItem {

    lateinit var subtotal: String

    @SerializedName("subtotal_tax")
    lateinit var subtotalTax: String
    lateinit var total: String
    lateinit var totalTax: String
    lateinit var price: String
    var quantity: Int = 0
    lateinit var taxClass: Any
    lateinit var name: String

    @SerializedName("product_id")
    var productId: Int = 0

    lateinit var sku: String
    lateinit var variations: String
    lateinit var barcode: String

    lateinit var image_url: String
    lateinit var points: Any
//    var units: List<Any> = ArrayList()
}





