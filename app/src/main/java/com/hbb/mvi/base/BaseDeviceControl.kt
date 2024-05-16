package com.hbb.mvi.base

import androidx.lifecycle.ViewModel

/**
 * 设备控制基类
 */
open class BaseDeviceControl< T : ViewModel>(val mViewModel: T) {
}