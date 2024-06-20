package com.hbb.mvi.utils

import com.hbb.mvi.common.BaseApplication

object GlobalUtils {

    fun getString(resId: Int): String = BaseApplication.context.resources.getString(resId)
    
}