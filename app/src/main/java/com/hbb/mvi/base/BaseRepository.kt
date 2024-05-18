package com.hbb.mvi.base

open class BaseRepository {
   suspend fun<T> post(request:()->BaseData<T>):BaseData<T>{
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