package com.hbb.mvi.ui.common

import android.graphics.Color
import android.util.Log
import androidx.annotation.ColorRes
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.gyf.immersionbar.ImmersionBar
import com.hbb.mvi.common.app.ActivityStackManager
import com.hbb.mvi.utils.AndroidBugFixUtils
import com.hbb.mvi.R
import com.hbb.mvi.utils.BarUtils
import com.hbb.mvi.utils.toast

abstract class BaseActivity<VB : ViewBinding, VM : ViewModel>:  BaseFrameActivity<VB, VM>()  {

    /**
     * 设置状态栏
     * 子类需要自定义时重写该方法即可
     * @return Unit
     */
    override fun setStatusBar() {
        // 核心代码
        BarUtils.transparentStatusBar(this)
        BarUtils.setStatusBarLightMode(this, true)
//        BarUtils.setStatusBarVisibility(this,false)
    }

//    /**
//     * 设置状态栏背景色
//     */
    open fun setStatusBarBackground(@ColorRes statusBarColor: Int) {
        ImmersionBar.with(this).autoStatusBarDarkModeEnable(true, 0.2f).statusBarColor(statusBarColor).fitsSystemWindows(true).init()
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