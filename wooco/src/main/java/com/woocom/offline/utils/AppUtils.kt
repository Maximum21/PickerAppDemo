package com.woocom.offline.utils

import android.content.Context
import java.util.*

class AppUtils(internal var context: Context) {
    internal var token: String? = null
    internal var expiry: String? = null

    companion object {
        val currentDateTime: Date
            get() = Calendar.getInstance().time

    }

}