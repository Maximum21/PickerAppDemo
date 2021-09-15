package com.martoo.picker

import com.woocom.models.MyOrder

interface ListingView {
    fun onAccept(order: MyOrder)
}