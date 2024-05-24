package com.hbb.mvi.ui.common

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.hbb.mvi.common.app.ActivityStackManager
import com.hbb.mvi.utils.AndroidBugFixUtils
import com.hbb.mvi.utils.BarUtils

abstract class BaseActivity<VB : ViewBinding, VM : ViewModel>:  BaseFrameActivity<VB, VM>()  {

    /**
     * 设置状态栏
     * 子类需要自定义时重写该方法即可
     * @return Unit
     */
    override fun setStatusBar() {
        BarUtils.transparentStatusBar(this)
        BarUtils.setStatusBarLightMode(this, true)
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActivityLifecycle", "ActivityStack: ${ActivityStackManager.activityStack}")
    }

    override fun onDestroy() {
        super.onDestroy()
        // 解决某些特定机型会触发的Android本身的Bug
        AndroidBugFixUtils().fixSoftInputLeaks(this)
    }
}