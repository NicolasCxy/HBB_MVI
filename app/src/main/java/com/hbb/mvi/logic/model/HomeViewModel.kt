package com.hbb.mvi.logic.model

import androidx.lifecycle.viewModelScope
import com.hbb.mvi.logic.common.BaseData
import com.hbb.mvi.logic.common.BaseViewModel
import com.hbb.mvi.logic.common.LoadInter
import com.hbb.mvi.logic.common.RequestState
import com.hbb.mvi.logic.intent.HomeIEvent
import com.hbb.mvi.logic.intent.HomeISate
import com.hbb.mvi.logic.intent.UserInfoState
import com.hbb.mvi.logic.intent.UserListState
import com.hbb.mvi.logic.repository.HomeRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.android.ext.android.inject

    class HomeViewModel(val repository: HomeRepository ) :
    BaseViewModel<HomeISate, HomeIEvent>() {

    override fun handlerIEvent(it: HomeIEvent) {

        when (it) {
            is HomeIEvent.GetUserList -> {
                requestDataWithFlow(showLoading = true, request = {
                    repository.requestUserInfoPost()    //开启网络请求
                }, onSuccess = {
                    sendSateIntent {
                        copy(userListState = UserListState.Success(it))
                    }

                }, onError = { errorMsg ->
                    sendLoaderIntent(LoadInter.Error(errorMsg))
                })
            }

            is HomeIEvent.GetUserInfo -> {
            }
        }
    }

    fun <T : Any> requestDataWithFlow1(
        showLoading: Boolean,
        request: suspend () -> BaseData<T>,
        onSuccess: (T) -> Unit,
        onError: suspend (String) -> Unit
    ) {
        viewModelScope.launch {
            if (showLoading) {
                sendLoaderIntent(LoadInter.Loading(true))
            }

            try {
                val response = withContext(Dispatchers.IO) {
                    request()
                }

                when (response.requestState) {
                    RequestState.IDLE -> {}
                    RequestState.SUCCESS -> {
                        response.data?.let { mData ->
                            onSuccess(mData)
                        }
                    }

                    RequestState.ERROR -> {
                        onError(response.msg)
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
                onError(e.toString())
            } finally {
                sendLoaderIntent(LoadInter.Loading(false))
                sendLoaderIntent(LoadInter.ShowView)
            }

        }

    }

    override fun initISate(): HomeISate {
        return HomeISate(UserListState.Instance, UserInfoState.Instance)
    }
}