package com.hbb.mvi.base

import android.util.Log
import androidx.databinding.BindingAdapter
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.internal.wait

/**
 * 封装请求，以及各种Intent的监听
 */
abstract class BaseViewModel<IS : IState, IE : IEvent> : ViewModel() {
    private val TAG = "BaseViewModel"

    /**
     * 声明各个Intent
     * 对各个Intent进行监听
     * 声明请求
     */

    private val _iState = MutableStateFlow(initISate())
    val iStateFlow get() = _iState


    private val _loadIntentFlow: Channel<LoadInter> = Channel()
    val loadInterFlow = _loadIntentFlow.receiveAsFlow()

    private val _iEventFlow: Channel<IE> = Channel()
    private val iEventFlow get() = _iEventFlow.receiveAsFlow()

    init {
        viewModelScope.launch {
            iEventFlow.collect { event ->
                handlerIEvent(event)
            }
        }

    }

    abstract fun handlerIEvent(it: IE)
    abstract fun initISate(): IS


    fun <T : Any> requestDataWithFlow(
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
                        response.data?.let { mData -> onSuccess(mData) }
                    }

                    RequestState.ERROR -> {
                        onError(response.msg)
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
                onError(e.toString())
            } finally {
                if (showLoading) {
                    sendLoaderIntent(LoadInter.Loading(false))
                }
                sendLoaderIntent(LoadInter.ShowView)
            }
        }
    }



    fun sendLoaderIntent(loadInter: LoadInter) {
        viewModelScope.launch {
            _loadIntentFlow.send(loadInter)
        }
    }

    /**
     * 处理业务事件
     */
    fun sendEventIntent(ie: IE) {
        viewModelScope.launch {
            _iEventFlow.send(ie)
        }
    }

    /**
     * 处理各种UI状态
     */
    fun sendSateIntent(block: IS.() -> IS) {

        viewModelScope.launch {
            Log.i(TAG, "sendSateIntent!!")
            iStateFlow.update { block(iStateFlow.value) }
        }
//        iStateFlow.update { block(iStateFlow.value) }
    }


}