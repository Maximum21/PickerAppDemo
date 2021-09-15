package com.martoo.picker

import android.app.Application
import android.content.Context
import android.os.StrictMode
import com.woocom.models.Category
import java.util.ArrayList

class App : Application() {
    var categories: List<Category>? = null

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
        categories = ArrayList()
        val builder = StrictMode.VmPolicy.Builder()
        StrictMode.setVmPolicy(builder.build())
    }

    companion object {
        var app: App? = null
        var context: Context? = null
            private set
        var instance: App? = null
            get() {
                if (field == null) field = App()
                return field
            }
            private set
    }
}