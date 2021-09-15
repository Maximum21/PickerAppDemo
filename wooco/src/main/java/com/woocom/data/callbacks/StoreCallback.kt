package com.woocom.data.callbacks

import com.google.gson.annotations.SerializedName
import com.woocom.models.Store

class StoreCallback {

    @SerializedName("store")
    lateinit var store: Store
}
