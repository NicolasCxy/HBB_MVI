package com.hbb.mvi.logic.model

import com.hbb.mvi.logic.common.BaseViewModel
import com.hbb.mvi.logic.common.LoadInter
import com.hbb.mvi.logic.intent.CommendIEvent
import com.hbb.mvi.logic.intent.CommendISate
import com.hbb.mvi.logic.intent.CommendListState
import com.hbb.mvi.logic.intent.HomeIEvent
import com.hbb.mvi.logic.intent.HomeISate
import com.hbb.mvi.logic.repository.CommendRepository

class CommendViewModel(val repository: CommendRepository) :
    BaseViewModel<CommendISate, CommendIEvent>()  {

    override fun handlerIEvent(it: CommendIEvent) {
        when(it){
            is CommendIEvent.GetCommendList->{
                requestDataWithFlow(showLoading = true, request = {
                    repository.requestCommendPost(it.loadMore)
                }, onSuccess = {
                    sendSateIntent { copy(commendListState = CommendListState.Success(it)) }
                }, onError = {
                    sendLoaderIntent(LoadInter.Error(it))
                })
            }
        }
    }

    override fun initISate(): CommendISate {
        return CommendISate(CommendListState.Instance)
    }
}