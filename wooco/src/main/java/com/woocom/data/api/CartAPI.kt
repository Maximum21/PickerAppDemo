package com.woocom.data.api

import com.google.gson.JsonObject
import com.woocom.cocart.CartItemRequest
import com.woocom.cocart.CoCart
import com.woocom.models.User
import retrofit2.Call
import retrofit2.http.*

interface CartAPI {

    @Headers("Content-Type: application/json")
    @POST("add-item")
    fun addToCart(@Body body: CartItemRequest): Call<CoCart>

    @Headers("Content-Type: application/json")
    @GET("")
    fun list(): Call<Map<String, CoCart>>

    @Headers("Content-Type: application/json")
    @POST("clear")
    fun clear(): Call<String>

    @Headers("Content-Type: application/json")
    @POST("item/{item_key}")
    fun update(@Path("item_key") item_key: String, @Body body: CartBody): Call<String>

    @Headers("Content-Type: application/json")
    @DELETE("item/{item_key}")
    fun delete(@Path("item_key") item_key: String): Call<String>

    @Headers("Content-Type: application/json")
    @POST("get_wishlisted_products")
    fun getWishlist(@Body body: User, @Query("lang") lang : String): Call<JsonObject>



}