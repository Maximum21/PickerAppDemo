package com.woocom.repo.product

import com.woocom.data.api.ProductCategoryAPI
import com.woocom.models.Category
import com.woocom.models.filters.ProductCategoryFilter
import com.woocom.repo.WooRepository
import retrofit2.Call

class CategoryRepository(baseUrl: String, consumerKey: String, consumerSecret: String) :
    WooRepository(baseUrl, consumerKey, consumerSecret) {

    private val apiService: ProductCategoryAPI

    init {
        apiService = retrofit.create(ProductCategoryAPI::class.java)
    }

    fun create(category: Category): Call<Category> {
        return apiService.create(category)
    }


    fun category(id: Int): Call<Category> {
        return apiService.view(id)
    }

    fun categories(): Call<List<Category>> {
        return apiService.list()
    }

    fun categories(productCategoryFilter: ProductCategoryFilter): Call<List<Category>> {
        return apiService.filter(productCategoryFilter.filters)
    }

    fun update(id: Int, category: Category): Call<Category> {
        return apiService.update(id, category)
    }

    fun delete(id: Int): Call<Category> {
        return apiService.delete(id)
    }

    fun delete(id: Int, force: Boolean): Call<Category> {
        return apiService.delete(id, force)
    }


}
