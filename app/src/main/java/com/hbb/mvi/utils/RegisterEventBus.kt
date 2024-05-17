package com.hbb.mvi.utils


/**
 * 用来声明是否要注册EventBus
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class RegisterEventBus
