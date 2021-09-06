package com.example.pickerappdemo

data class Product (
    var id:Int? = null,
    var orderId: String? = null,
    var productId:String? = null,
    var name:String? = null,
    var quantity:Int = 5,
    var selected:Boolean = false,
    var remaining:Int = 2,
    var basketId:String? = null,
)