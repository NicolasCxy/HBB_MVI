package com.hbb.mvi.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.viewbinding.ViewBinding

abstract class BaseBindingActivity<VB : ViewBinding>(val block: (LayoutInflater) -> VB) : BaseActivity() {

    private var _bind: VB? = null
    protected val dataBinding:VB
        get() = requireNotNull(_bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        _bind = block(layoutInflater)
        setContentView(dataBinding.root)
        super.onCreate(savedInstanceState)
    }

}