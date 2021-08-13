package com.example.pickerappdemo

data class Product (
    var id:String = "",
    var name:String = "Product Name",
    var quantity:Int = 5,
    var selected:Boolean = false,
    var remaining:Int = 2
)