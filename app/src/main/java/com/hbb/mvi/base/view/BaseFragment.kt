package com.hbb.mvi.base.view
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding

abstract class BaseFragment <VB : ViewBinding, VM : ViewModel>:BaseFrameFragment<VB,VM>() {

}