package com.woocom.cocart

enum class Status {
    EMPTY,
    SUCCESS,
    ERROR,
    LOADING;

    val isLoading: Status
        get() = LOADING
}
