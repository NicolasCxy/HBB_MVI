package com.hbb.mvi.base

import android.app.Application

class BaseApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initCommonlibrary()
    }

    private fun initCommonlibrary() {


    }
}