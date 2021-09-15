package com.example.pickerappdemo.models

class Order (
    var order_id:String? = null,
    var orderNumber:String = "",
    var status:String? =null,
    var order_total:String? =null,
    var type:String? = null,
    var basketId:String? = null,
    val product: List<Product> = arrayListOf()
)