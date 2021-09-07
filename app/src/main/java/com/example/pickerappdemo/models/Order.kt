package com.example.pickerappdemo.models

class Order (
    var orderName:String? = null,
    var orderNumber:String? = null,
    var status:String? =null,
    var type:String? = null,
    var basketId:String? = null,
    val product: List<Product> = arrayListOf()
)