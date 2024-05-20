package com.hbb.mvi.ui.widget

import android.view.View

class OnSingleClickListener(
    private val mDelayTime: Int = 500,
    private val mListener: (v: View) -> Unit
) : View.OnClickListener {


    private var mLastClickTime = 0L
    override fun onClick(v: View) {
        val currentTimeMillis = System.currentTimeMillis()
        if (currentTimeMillis - mLastClickTime > mDelayTime) {
            mLastClickTime = currentTimeMillis
            mListener.invoke(v)

        }
    }
}