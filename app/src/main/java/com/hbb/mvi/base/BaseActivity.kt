package com.hbb.mvi.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initData(savedInstanceState)
    }

    abstract fun initData(savedInstanceState: Bundle?)

}