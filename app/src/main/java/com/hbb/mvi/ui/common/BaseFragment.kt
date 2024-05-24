package com.hbb.mvi.ui.common
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding

abstract class BaseFragment <VB : ViewBinding, VM : ViewModel>: BaseFrameFragment<VB, VM>() {

}