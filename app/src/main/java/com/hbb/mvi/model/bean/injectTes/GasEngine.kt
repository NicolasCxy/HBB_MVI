package com.hbb.mvi.model.bean.injectTes

import javax.inject.Inject

class GasEngine @Inject constructor() :Engine {
    override fun start() {
        println("Gas Engine start")
    }

    override fun shutdown() {
        println("Gas Engine shutdown")
    }
}