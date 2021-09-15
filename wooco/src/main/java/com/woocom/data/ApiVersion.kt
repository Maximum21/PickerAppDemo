package com.woocom.data

enum class ApiVersion {
    API_VERSION2 {
        override fun toString(): String {
            return "2"
        }
    },
    API_VERSION3 {
        override fun toString(): String {
            return "3"
        }
    }
}