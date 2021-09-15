package com.woocom.repo

import retrofit2.Call
import com.woocom.data.api.ShippingMethodAPI
import com.woocom.data.api.ShippingZoneAPI
import com.woocom.models.ShippingMethod
import com.woocom.models.ShippingZone

class ShippingZoneMethodRepository(baseUrl: String, consumerKey: String, consumerSecret: String) :
    WooRepository(baseUrl, consumerKey, consumerSecret) {

    private val apiService: ShippingZoneAPI

    init {
        apiService = retrofit.create(ShippingZoneAPI::class.java)
    }

    fun shippingZone(id: Int): Call<ShippingZone> {
        return apiService.view(id)
    }

    fun shippingZones(): Call<List<ShippingZone>> {
        return apiService.list()
    }

    fun shippingMethods(id: Int): Call<List<ShippingMethod>> {
        return apiService.getMethod(id)
    }


}
