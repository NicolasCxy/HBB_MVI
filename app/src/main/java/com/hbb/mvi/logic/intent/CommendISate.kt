package com.hbb.mvi.logic.intent

import com.hbb.mvi.logic.bean.CommendInfo
import com.hbb.mvi.logic.bean.HomeNewsInfo.DataBean
import com.hbb.mvi.logic.common.IState

data class CommendISate(
    val commendListState: CommendListState
) : IState


sealed class CommendListState {
    data object Instance : CommendListState()
    data class Success(val commendNewsData: CommendInfo) : CommendListState()
}


