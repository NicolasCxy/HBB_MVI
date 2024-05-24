package com.hbb.mvi.logic.intent

import com.hbb.mvi.logic.common.IState
import com.hbb.mvi.logic.bean.User

data class HomeISate(
    val userListState: UserListState,
    val userInfoState: UserInfoState
) : IState

//object GetUserList : HomeIEvent()
//data class GetUserInfo(var uid: Long) : HomeIEvent()

sealed class UserListState {
    object Instance : UserListState()
    data class Success(val userList: List<User>) : UserListState()
}



sealed class UserInfoState {
    object Instance : UserInfoState()
    data class Sucess(val userInfo: User) : UserInfoState()
}