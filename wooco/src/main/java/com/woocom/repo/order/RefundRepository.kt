package com.woocom.repo.order

import com.woocom.data.api.RefundAPI
import com.woocom.models.Order
import com.woocom.models.Refund
import com.woocom.models.filters.RefundFilter
import com.woocom.repo.WooRepository
import retrofit2.Call

class RefundRepository(baseUrl: String, consumerKey: String, consumerSecret: String) :
    WooRepository(baseUrl, consumerKey, consumerSecret) {

    private val apiService: RefundAPI = retrofit.create(RefundAPI::class.java)

    fun create(order: Order, refund: Refund): Call<Refund> {
        return apiService.create(order.id, refund)
    }

    fun refund(order: Order, id: Int): Call<Refund> {
        return apiService.view(order.id, id)
    }

    fun refunds(order: Order): Call<List<Refund>> {
        return apiService.list(order.id)
    }

    fun refunds(order: Order, refundFilter: RefundFilter): Call<List<Refund>> {
        return apiService.filter(order.id, refundFilter.filters)
    }

    fun delete(order: Order, id: Int): Call<Refund> {
        return apiService.delete(order.id, id)
    }

    fun delete(order: Order, id: Int, force: Boolean): Call<Refund> {
        return apiService.delete(order.id, id, force)
    }


}
