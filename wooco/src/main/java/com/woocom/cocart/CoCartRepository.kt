package com.woocom.cocart

import com.google.gson.JsonObject
import com.woocom.data.api.CartAPI
import com.woocom.data.api.CartBody
import com.woocom.models.Product
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class CoCartRepository(baseUrl: String, token: String) {

    private var apiService: CartAPI
    private var retrofit: Retrofit

    init {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        val client = OkHttpClient.Builder()
            .addInterceptor(ServiceInterceptor("Bearer ", token))
            .addInterceptor(loggingInterceptor)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .connectTimeout(15, TimeUnit.SECONDS)
            .build()

        retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()

        apiService = retrofit.create(CartAPI::class.java)
    }

    fun addToCart(productId: String, quantity: String): Call<CoCart> {
        val cartItemRequest = CartItemRequest(
            productId = productId, quantity = quantity
        )

        return apiService.addToCart(cartItemRequest)
    }

    fun cart(): Call<Map<String, CoCart>> {
        return apiService.list()
    }

    fun clear(): Call<String> {
        return apiService.clear();
    }

    fun update(item_key: String, cartBody: CartBody): Call<String> {
        return apiService.update(item_key, cartBody);
    }

    fun delete(item_key: String): Call<String> {
        return apiService.delete(item_key);
    }

}
