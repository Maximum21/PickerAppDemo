package com.woocom.data.callbacks


import com.google.gson.annotations.SerializedName
import com.woocom.models.Category


import java.util.ArrayList


class CategoriesCallback {
    @SerializedName("product_categories")
    lateinit var categories: ArrayList<Category>
}
