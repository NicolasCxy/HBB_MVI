package com.hbb.mvi.model.bean.injectTes

import javax.inject.Inject

class ElectricEngine @Inject constructor() :Engine{
    override fun start() {
        println("Electric Engine start")
    }

    override fun shutdown() {
        println("Electric Engine shutdown")
    }
}