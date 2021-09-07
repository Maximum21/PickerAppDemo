package com.example.pickerappdemo.entities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE


//@Entity(tableName = "basket_reference", foreignKeys = {
//    @ForeignKey(
//        entity = OrderItemEntitiy.class,
//                parentColumns = "orderNumber",
//        childColumns = "orderId",
//        onDelete = ForeignKey.CASCADE
//    )
//})
//data class BasketReference (
//
//)