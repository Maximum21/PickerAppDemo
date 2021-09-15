package com.martoo.picker.interfaces

import com.woocom.models.MyOrder

interface ListingView {
    fun onAccept(order: MyOrder)
}