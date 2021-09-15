package com.woocom.repo

import retrofit2.Call
import com.woocom.data.api.ShippingMethodAPI
import com.woocom.models.ShippingMethod

class ShippingMethodRepository(baseUrl: String, consumerKey: String, consumerSecret: String) :
    WooRepository(baseUrl, consumerKey, consumerSecret) {

    private val apiService: ShippingMethodAPI

    init {
        apiService = retrofit.create(ShippingMethodAPI::class.java)
    }

    fun shippingMethod(id: String): Call<ShippingMethod> {
        return apiService.view(id)
    }

    fun shippingMethods(): Call<List<ShippingMethod>> {
        return apiService.list()
    }


}
