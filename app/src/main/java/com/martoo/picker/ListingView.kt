package com.martoo.picker

import com.martoo.picker.models.Order
import com.woocom.models.MyOrder

interface ListingView {
    fun onAccept(order: MyOrder)
    fun AttachBasket(model: Order)
}