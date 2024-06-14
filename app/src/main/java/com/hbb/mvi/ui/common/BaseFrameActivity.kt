package com.hbb.mvi.ui.common

import android.content.res.Resources
import android.os.Bundle
import android.os.Looper
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.hbb.mvi.utils.EventBusUtils
import com.hbb.mvi.utils.RegisterEventBus
import com.hbb.mvi.utils.network.AutoRegisterNetListener
import com.hbb.mvi.utils.network.NetworkStateChangeListener
import com.hbb.mvi.utils.network.NetworkTypeEnum
import com.hbb.mvi.utils.toast
import com.hbb.mvi.R
import com.hbb.mvi.databinding.ActivityBaseBinding
import me.jessyan.autosize.AutoSizeCompat

abstract class BaseFrameActivity<VB : ViewBinding, VM : ViewModel> : AppCompatActivity(),
    FrameView<VB>,
    NetworkStateChangeListener {

    protected abstract val mViewModel: VM

    val binding: VB get() = mBinding

    private val mBinding: VB by lazy(mode = LazyThreadSafetyMode.NONE) { createVB() }

    protected lateinit var baseBinding: ActivityBaseBinding


    /**
     * 是否有 [RegisterEventBus] 注解，避免重复调用 [Class.isAnnotation]
     */
    private var mHaveRegisterEventBus = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        baseBinding = ActivityBaseBinding.inflate(layoutInflater)
        setContentView(baseBinding.root)
        baseBinding.content.addView(mBinding.root)

        // 根据子类是否有 RegisterEventBus 注解決定是否进行注册 EventBus
        if (javaClass.isAnnotationPresent(RegisterEventBus::class.java)) {
            mHaveRegisterEventBus = true
            EventBusUtils.register(this)
        }

        setStatusBar()
        mBinding.initView()
        initNetworkListener()
        initData()
    }

    /**
     * 初始化网络状态监听
     * @return Unit
     */
    private fun initNetworkListener() {
        lifecycle.addObserver(AutoRegisterNetListener(this))
    }

    /**
     * 网络类型更改回调
     * @param type Int 网络类型
     * @return Unit
     */
    override fun networkTypeChange(type: NetworkTypeEnum) {}

    /**
     * 网络连接状态更改回调
     * @param isConnected Boolean 是否已连接
     * @return Unit
     */
    override fun networkConnectChange(isConnected: Boolean) {
        toast(if (isConnected) getString(R.string.base_network_connected) else getString(R.string.base_network_disconnected))
        Log.i(this.javaClass.simpleName, "networkConnectChange: $isConnected")
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

    override fun getResources(): Resources {
        // 主要是为了解决 AndroidAutoSize 在横屏切换时导致适配失效的问题
        // 但是 AutoSizeCompat.autoConvertDensity() 对线程做了判断 导致Coil等图片加载框架在子线程访问的时候会异常
        // 所以在这里加了线程的判断 如果是非主线程 就取消单独的适配
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AutoSizeCompat.autoConvertDensityOfGlobal((super.getResources()))
        }
        return super.getResources()
    }


}