package com.woocom.repo

import com.google.gson.JsonObject
import com.woocom.cocart.ServiceInterceptor
import com.woocom.data.api.CartAPI
import com.woocom.data.api.StripeAPI
import com.woocom.models.Product
import com.woocom.models.Stripe
import com.woocom.models.User
import com.woocom.models.WishlistResponse
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class WishlistRepository (baseUrl: String, token: String)
{
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

    fun getWishList(userId : String, lang: String): Call<JsonObject> {
        val user = User(userId)
        return apiService.getWishlist(user, lang)
    }
}