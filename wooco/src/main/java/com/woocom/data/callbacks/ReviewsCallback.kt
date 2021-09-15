package com.woocom.data.callbacks


import com.google.gson.annotations.SerializedName
import com.woocom.models.ProductReview

import java.util.ArrayList


class ReviewsCallback {
    @SerializedName("product_reviews")
    lateinit var productReviews: ArrayList<ProductReview>
}
