package com.hbb.mvi.base

import rxhttp.wrapper.annotation.DefaultDomain

open class BaseRepository {



   suspend fun<T> post( request:suspend ()->BaseData<T>):BaseData<T>{
        val response = request.invoke()
        when(response.code){
            -1 ->{ //失败
                response.requestState = RequestState.ERROR
            }
            200 ->{
                response.requestState = RequestState.SUCCESS
            }
        }
        return response
    }
}