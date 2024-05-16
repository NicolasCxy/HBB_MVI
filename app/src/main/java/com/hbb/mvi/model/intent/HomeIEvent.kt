package com.hbb.mvi.model.intent

import com.hbb.mvi.base.IEvent

sealed class HomeIEvent : IEvent {
    object GetUserList : HomeIEvent()
    data class GetUserInfo(var uid: Long) : HomeIEvent()
}

/**
 * 欢迎页：
 *  1、权限申请
 *  2、各种动画效果设置
 *  3、跳到MainActivity
 *
 *
 * MainActivity：
 *  1、设置点击监听
 *  2、监听事件里初始化fragment并添加显示和UI选中
 *  3、监听EventBus 发送不同的事件
 */