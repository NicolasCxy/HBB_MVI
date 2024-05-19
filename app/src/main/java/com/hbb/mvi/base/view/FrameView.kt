package com.hbb.mvi.base.view

import androidx.lifecycle.LiveData
import androidx.viewbinding.ViewBinding

/**
 * View层基类抽象
 *
 * @author Qu Yunshuo
 * @since 10/13/20
 */
interface FrameView<VB : ViewBinding> {

    /**
     * 创建 [ViewBinding] 实例
     */
    fun createVB(): VB

    /**
     * 初始化 View
     */
    fun VB.initView()

    /**
     * 初始化 数据，网络数据请求
     */
    fun initData()
}