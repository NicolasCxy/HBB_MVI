package com.hbb.mvi.base

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseApplication: Application() {


    override fun onCreate() {
        super.onCreate()
        context = this
        initCommonLibrary()
        //注入
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        context = base
        application = this
    }

    private fun initCommonLibrary() {}

    companion object{
        // 全局Context
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        @SuppressLint("StaticFieldLeak")
        lateinit var application: BaseApplication
    }
}

