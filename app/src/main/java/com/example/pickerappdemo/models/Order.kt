package com.example.pickerappdemo.models

class Order (
    var order_id:String? = null,
    var orderNumber:String? = null,
    var status:String? =null,
    var order_total:Int =0,
    var type:String? = null,
    var basketId:String? = null,
    val product: List<Product> = arrayListOf()
)