package com.martoo.picker.models

data class Product (
    var id:Int? = null,
    var orderId: String = "",
    var productId:String = "",
    var name:String? = null,
    var quantity:Int = 0,
    var productCode:String? = null,
    var product_sku: String? = null,
    var product_bar_code: String? = null,
    var selected:Boolean = false,
    var remaining:Int = 0,
    var basketId:String? = null,
)