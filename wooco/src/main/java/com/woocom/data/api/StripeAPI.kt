package com.woocom.data.api

import com.google.gson.JsonObject
import com.woocom.models.Product
import com.woocom.models.Stripe
import retrofit2.Call
import retrofit2.http.*

interface StripeAPI {

    @Headers("Content-Type: application/json")
    @POST("stripe_secret")
    fun create(@Body body: Stripe): Call<String>

    @GET("home_tab/{id}")
    fun filter(@Path("id") id:String,@QueryMap filter: Map<String, String>): Call<List<Product>>
}