package com.woocom.repo

import com.woocom.data.api.ProductAPI
import com.woocom.models.Product
import com.woocom.models.filters.ProductFilter
import retrofit2.Call

import java.util.HashMap

class ProductRepository(baseUrl: String, consumerKey: String, consumerSecret: String) :
    WooRepository(baseUrl, consumerKey, consumerSecret) {

    private val apiService: ProductAPI = retrofit.create(ProductAPI::class.java)

    fun create(product: Product): Call<Product> {
        return apiService.create(product)
    }


    fun product(id: Int,lang: String): Call<Product> {
        return apiService.view(id,lang)
    }

    fun products(): Call<List<Product>> {
        return apiService.list()
    }

    fun filter(filters: Map<String, String>, lang: String): Call<List<Product>> {
        return apiService.filter(filters)
    }

    fun products(productFilter: ProductFilter, lang: String): Call<List<Product>> {
        productFilter.status = "publish"
        return filter(productFilter.filters, lang)
    }

    fun search(term: String, lang: String): Call<List<Product>> {
        val productFilter = ProductFilter()
        productFilter.search = term
        productFilter.status = "publish"
        return filter(productFilter.filters, lang)
    }

    fun products(page: Int, per_page: Int, lang: String): Call<List<Product>> {
        val productFilter = ProductFilter()
        productFilter.page = page
        productFilter.per_page = per_page
        productFilter.status = "publish"
        return filter(productFilter.filters, lang)
    }

    fun products(page: Int, lang: String): Call<List<Product>> {
        val productFilter = ProductFilter()
        productFilter.page = page
        productFilter.status = "publish"
        return filter(productFilter.filters, lang)
    }

    fun update(id: Int, product: Product): Call<Product> {
        return apiService.update(id, product)
    }

    fun delete(id: Int): Call<Product> {
        return apiService.delete(id)
    }

    fun delete(id: Int, force: Boolean): Call<Product> {
        return apiService.delete(id, force)
    }

    fun products(filters: HashMap<String, String>): Call<List<Product>> {
        filters["status"] = "publish"
        return apiService.filter(filters)
    }


}
