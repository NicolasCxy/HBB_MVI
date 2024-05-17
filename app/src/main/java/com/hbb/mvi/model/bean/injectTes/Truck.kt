package com.hbb.mvi.model.bean.injectTes

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Inject


class Truck @Inject constructor(val driver: Driver) {

    @BindGasEngine
    @Inject
    lateinit var gasEngine: Engine

    @BindElectricEngine
    @Inject
    lateinit var electricEngine: Engine

    @Inject
    lateinit var okHttpClient: OkHttpClient

    @Inject
    lateinit var retrofit: Retrofit

    fun deliver() {
        println("Truck is delivering context: ${driver.context}")
        println("okHttpClient-connectTimeoutMillis: ${okHttpClient.hashCode()}")
        println("Retrofit-baseUrl: ${retrofit.hashCode()}")
    }
}