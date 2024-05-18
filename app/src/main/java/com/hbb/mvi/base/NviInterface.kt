package com.hbb.mvi.base

interface IState

interface IEvent

sealed class LoadInter{
    data class Loading(var isShow:Boolean):LoadInter()
    object ShowView:LoadInter()
    data class Error(var errorMsg:String):LoadInter()

}