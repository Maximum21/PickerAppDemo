package com.example.pickerappdemo

class Order (
    var id:Int = 0,
    var orderName:String = "Order Name",
    var orderNumber:String = "order-0023",
    var status:Int = 0,
    var type:Boolean =false,
    val product: List<Product> = arrayListOf()
)