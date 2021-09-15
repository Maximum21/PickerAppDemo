package com.woocom.repo.order

import com.woocom.data.api.OrderNoteAPI
import com.woocom.models.Order
import com.woocom.models.OrderNote
import com.woocom.models.filters.OrderNoteFilter
import com.woocom.repo.WooRepository
import retrofit2.Call

class OrderNoteRepository(baseUrl: String, consumerKey: String, consumerSecret: String) :
    WooRepository(baseUrl, consumerKey, consumerSecret) {

    private val apiService: OrderNoteAPI = retrofit.create(OrderNoteAPI::class.java)

    fun create(order: Order, note: OrderNote): Call<OrderNote> {
        return apiService.create(order.id, note)
    }

    fun note(order: Order, id: Int): Call<OrderNote> {
        return apiService.view(order.id, id)
    }

    fun notes(order: Order): Call<List<OrderNote>> {
        return apiService.list(order.id)
    }

    fun notes(order: Order, orderNoteFilter: OrderNoteFilter): Call<List<OrderNote>> {
        return apiService.filter(order.id, orderNoteFilter.filters)
    }

    fun delete(order: Order, id: Int): Call<OrderNote> {
        return apiService.delete(order.id, id)
    }

    fun delete(order: Order, id: Int, force: Boolean): Call<OrderNote> {
        return apiService.delete(order.id, id, force)
    }


}
