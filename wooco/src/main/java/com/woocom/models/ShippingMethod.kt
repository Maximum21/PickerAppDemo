package com.woocom.models

class ShippingMethod {
    var id: String? = null
    var title: String? = null
    var enabled: Boolean = false
    lateinit var settings: ShippingSetting
}
