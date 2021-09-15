package com.woocom.models

import java.io.Serializable

class Metadata : Serializable {
    var id: Int = 0
    lateinit var key: String
    lateinit var value: Any

}
