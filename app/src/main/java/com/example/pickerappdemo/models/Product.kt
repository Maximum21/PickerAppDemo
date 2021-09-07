package com.example.pickerappdemo.models

data class Product (
    var id:Int? = null,
    var orderId: String? = null,
    var productId:String? = null,
    var name:String? = null,
    var quantity:Int = 5,
    var productCode:String? = null,
    var product_sku: String? = null,
    var product_bar_code: String? = null,
    var selected:Boolean = false,
    var remaining:Int = 2,
    var basketId:String? = null,
)