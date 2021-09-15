package com.woocom.repo

import com.google.gson.JsonObject
import com.woocom.data.api.StripeAPI
import com.woocom.models.Product
import com.woocom.models.Stripe
import com.woocom.models.filters.ProductFilter
import retrofit2.Call

class StripeRepository(baseUrl: String, consumerKey: String, consumerSecret: String) :
    WooRepository(baseUrl, consumerKey, consumerSecret) {

    private val apiService: StripeAPI = retrofit.create(StripeAPI::class.java)

    fun create(stripe: Stripe): Call<String> {
        return apiService.create(stripe)
    }

    fun filter(filters: Map<String, String>, id: String): Call<List<Product>> {
        return apiService.filter(id,filters)
    }

    fun products(productFilter: ProductFilter, id: String): Call<List<Product>> {
        return filter(productFilter.filters, id)
    }
}
