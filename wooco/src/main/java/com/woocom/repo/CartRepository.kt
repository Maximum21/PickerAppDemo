package com.woocom.repo

import com.woocom.cocart.CoCart
import com.woocom.cocart.CoCartRepository
import com.woocom.data.api.CartBody
import retrofit2.Call

class CartRepository(internal var baseUrl: String, token: String) {

    private var cartRepository: CoCartRepository = CoCartRepository(baseUrl, token)

    fun addToCart(productId: String, quantity: String): Call<CoCart> {
        return cartRepository.addToCart(productId, quantity)
    }

    fun clear(): Call<String> {
        return cartRepository.clear()
    }

    fun update(item_key: String, cartBody: CartBody): Call<String> {
        return cartRepository.update(item_key, cartBody)
    }

    fun delete(item_key: String): Call<String> {
        return cartRepository.delete(item_key)
    }

}
