package com.woocom.models

import java.io.Serializable

class ShippingSetting : Serializable {
    lateinit var cost: Cost
    lateinit var tax_status: Cost
}
