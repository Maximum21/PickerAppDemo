package com.example.pickerappdemo

import com.woocom.models.MyOrder

interface ListingView {
    fun onAccept(order: MyOrder)
}