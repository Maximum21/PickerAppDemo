package com.example.pickerappdemo.service

import com.example.pickerappdemo.models.MyOrder
import retrofit2.Call
import retrofit2.http.*

interface WebApiService {

    @GET("orders")
    fun myFilter(@QueryMap filter: Map<String, String>): Call<List<MyOrder>>

}