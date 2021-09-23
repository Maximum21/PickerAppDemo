package com.martoo.picker.interfaces

import com.martoo.picker.models.Order
import com.martoo.picker.models.ParentOrder
import com.woocom.models.MyOrder

interface ListingView {
    fun onAccept(order: MyOrder)
    fun AttachBasket(model: Order)
    fun openOrderDetails(id:String)
    fun completeOrder(model: ParentOrder, position: Int)
}