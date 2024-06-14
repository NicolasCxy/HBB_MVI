package com.hbb.mvi.logic.model

import com.hbb.mvi.logic.common.BaseViewModel
import com.hbb.mvi.logic.common.LoadInter
import com.hbb.mvi.logic.intent.HomeIEvent
import com.hbb.mvi.logic.intent.HomeISate
import com.hbb.mvi.logic.intent.UserInfoState
import com.hbb.mvi.logic.intent.HomeNewsState
import com.hbb.mvi.logic.repository.HomeRepository

class HomeViewModel(val repository: HomeRepository) :
    BaseViewModel<HomeISate, HomeIEvent>() {


    override fun handlerIEvent(it: HomeIEvent) {
        when (it) {
            is HomeIEvent.GetHomeNews -> {
                requestDataWithFlow(showLoading = true, request = {
                    repository.requestUserInfoPost(it.page)    //开启网络请求
                }, onSuccess = {
                    sendSateIntent {
                        copy(userListState = HomeNewsState.Success(it))
                    }
                }, onError = { errorMsg ->
                    sendLoaderIntent(LoadInter.Error(errorMsg))
                })
            }

            is HomeIEvent.GetUserInfo -> {
            }
        }
    }

    override fun initISate(): HomeISate {
        return HomeISate(HomeNewsState.Instance, UserInfoState.Instance)
    }
}