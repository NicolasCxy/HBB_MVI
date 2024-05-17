package com.hbb.mvi.base

import android.content.res.Resources
import android.os.Bundle
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.hbb.mvi.base.view.FrameView
import com.hbb.mvi.utils.EventBusUtils
import com.hbb.mvi.utils.RegisterEventBus

abstract class BaseFrameActivity<VB : ViewBinding, VM : ViewModel> : AppCompatActivity(),FrameView<VB>{

    protected abstract val mViewModel:VM

    protected val mBinding:VB by lazy(mode = LazyThreadSafetyMode.NONE) { createVB() }

    /**
     * 是否有 [RegisterEventBus] 注解，避免重复调用 [Class.isAnnotation]
     */
    private var mHaveRegisterEventBus = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mBinding.root)

        // 根据子类是否有 RegisterEventBus 注解決定是否进行注册 EventBus
        if (javaClass.isAnnotationPresent(RegisterEventBus::class.java)) {
            mHaveRegisterEventBus = true
            EventBusUtils.register(this)
        }

        setStatusBar()
        mBinding.initView()
        initNetworkListener()
        initRequestData()
    }

    /**
     * 初始化网络状态监听
     * @return Unit
     */
    private fun initNetworkListener() {
//        lifecycle.addObserver(AutoRegisterNetListener(this))  //TODO:后续添加
    }


    /**
     * 设置状态栏
     * 子类需要自定义时重写该方法即可
     * @return Unit
     */
    open fun setStatusBar() {}


    override fun onDestroy() {
        // 根据子类是否有 RegisterEventBus 注解决定是否进行注册 EventBus
        if (mHaveRegisterEventBus) {
            EventBusUtils.unRegister(this)
        }
        super.onDestroy()
    }

//    override fun getResources(): Resources {
//        // 主要是为了解决 AndroidAutoSize 在横屏切换时导致适配失效的问题
//        // 但是 AutoSizeCompat.autoConvertDensity() 对线程做了判断 导致Coil等图片加载框架在子线程访问的时候会异常
//        // 所以在这里加了线程的判断 如果是非主线程 就取消单独的适配
//        if (Looper.myLooper() == Looper.getMainLooper()) {
//            AutoSizeCompat.autoConvertDensityOfGlobal((super.getResources()))
//        }
//        return super.getResources()
//    }

}