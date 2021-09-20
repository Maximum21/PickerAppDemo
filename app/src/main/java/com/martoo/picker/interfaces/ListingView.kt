package com.martoo.picker.interfaces

import com.martoo.picker.models.Order
import com.woocom.models.MyOrder

interface ListingView {
    fun onAccept(order: MyOrder)
    fun AttachBasket(model: Order)
    fun openOrderDetails(id:String)
}