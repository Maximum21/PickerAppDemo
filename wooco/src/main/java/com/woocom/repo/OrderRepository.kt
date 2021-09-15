package com.woocom.repo

import com.woocom.data.api.OrderAPI
import com.woocom.models.LineItem
import com.woocom.models.MyOrder
import com.woocom.models.Order
import com.woocom.models.OrderNote
import com.woocom.models.filters.OrderFilter
import com.woocom.repo.order.OrderNoteRepository
import com.woocom.repo.order.RefundRepository
import retrofit2.Call

class OrderRepository(baseUrl: String, consumerKey: String, consumerSecret: String) :
    WooRepository(baseUrl, consumerKey, consumerSecret) {

    private val apiService: OrderAPI

    internal var orderNoteRepository: OrderNoteRepository
    internal var refundRepository: RefundRepository

    init {
        apiService = retrofit.create(OrderAPI::class.java)

        orderNoteRepository = OrderNoteRepository(baseUrl, consumerKey, consumerSecret)
        refundRepository = RefundRepository(baseUrl, consumerKey, consumerSecret)
    }

    fun create(order: Order): Call<Order> {
        return apiService.create(order)
    }

    fun addToCart(productId: Int, cartOrder: Order?): Call<Order> {
        var cartOrder = cartOrder
        val lineItem = LineItem()
        lineItem.productId = productId
        lineItem.quantity = 1

        if (cartOrder != null) {
            cartOrder.addLineItem(lineItem)
            return apiService.update(cartOrder.id, cartOrder)
        } else {
            cartOrder = Order()
            cartOrder.orderNumber = "Cart"
            cartOrder.status = "on-hold"
            cartOrder.addLineItem(lineItem)
            return apiService.create(cartOrder)
        }

    }

    fun cart(): Call<List<Order>> {
        val orderFilter = OrderFilter()
        orderFilter.status = "on-hold"

        return apiService.filter(orderFilter.filters)
    }

    fun order(id: Int): Call<Order> {
        return apiService.view(id)
    }

    fun orders(): Call<List<Order>> {
        return apiService.list()
    }

    fun orders(orderFilter: OrderFilter): Call<List<Order>> {
        return apiService.filter(orderFilter.filters)
    }

    fun myOrders(orderFilter: OrderFilter): Call<List<MyOrder>> {
        return apiService.myFilter(orderFilter.filters)
    }

    fun update(id: Int, order: Order): Call<Order> {
        return apiService.update(id, order)
    }

    fun delete(id: Int): Call<Order> {
        return apiService.delete(id)
    }

    fun delete(id: Int, force: Boolean): Call<Order> {
        return apiService.delete(id, force)
    }


    fun createNote(order: Order, note: OrderNote): Call<OrderNote> {
        return orderNoteRepository.create(order, note)
    }

    fun note(order: Order, id: Int): Call<OrderNote> {
        return orderNoteRepository.note(order, id)
    }

    fun notes(order: Order): Call<List<OrderNote>> {
        return orderNoteRepository.notes(order)
    }

    fun deleteNote(order: Order, id: Int): Call<OrderNote> {
        return orderNoteRepository.delete(order, id)
    }

    fun deleteNote(order: Order, id: Int, force: Boolean): Call<OrderNote> {
        return orderNoteRepository.delete(order, id, force)
    }


}
