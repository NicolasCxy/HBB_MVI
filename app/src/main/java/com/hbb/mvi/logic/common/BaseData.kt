package com.hbb.mvi.logic.common

class BaseData<T> {
    var code = -1
    var msg  = ""
    var data:T? = null
    var requestState: RequestState = RequestState.IDLE
}

enum class RequestState{
    IDLE,SUCCESS,ERROR
}