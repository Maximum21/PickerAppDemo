package com.woocom.callback

enum class Status {
    EMPTY,
    SUCCESS,
    ERROR,
    LOADING;

    val isLoading: Status
        get() = LOADING
}
