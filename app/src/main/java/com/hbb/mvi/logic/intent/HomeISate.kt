package com.hbb.mvi.logic.intent

import com.hbb.mvi.logic.bean.HomeNewsInfo.DataBean
import com.hbb.mvi.logic.common.IState
import com.hbb.mvi.logic.bean.User

data class HomeISate(
    val userListState: HomeNewsState,
    val userInfoState: UserInfoState
) : IState

//object GetUserList : HomeIEvent()
//data class GetUserInfo(var uid: Long) : HomeIEvent()

sealed class HomeNewsState {
    object Instance : HomeNewsState()
    data class Success(val homeNewsData: DataBean) : HomeNewsState()
}



sealed class UserInfoState {
    object Instance : UserInfoState()
    data class Sucess(val userInfo: User) : UserInfoState()
}