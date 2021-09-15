package com.woocom.models

import com.google.gson.annotations.SerializedName


class CouponLine {

    constructor(code: String?) {
        this.code = code
    }

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("code")
    var code: String? = null
    var discount: String? = null
    var discount_tax: String? = null
}
