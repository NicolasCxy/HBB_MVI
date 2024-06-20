package com.hbb.mvi.ui.common

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import com.hbb.mvi.common.event.MessageEvent
import com.hbb.mvi.common.event.RefreshEvent
import com.hbb.mvi.databinding.LayoutPageTitleBarBinding
import com.hbb.mvi.utils.EventBusUtils
import com.hbb.mvi.utils.RegisterEventBus
import org.greenrobot.eventbus.Subscribe

/**
 * Fragment基类
 *
 * @author Qu Yunshuo
 * @since 8/27/20
 */
abstract class BaseFragment<VB : ViewBinding, VM : ViewModel> : Fragment(),
    FrameView<VB> {

    /**
     * 私有的 ViewBinding 此写法来自 Google Android 官方
     */
    private var _binding: VB? = null

    protected lateinit var baseBinding: LayoutPageTitleBarBinding

    protected val mBinding get() = _binding!!

    protected abstract val mViewModel: VM

    /**
     * 是否有 [RegisterEventBus] 注解，避免重复调用 [Class.isAnnotation]
     */
    private var mHaveRegisterEventBus = false

//    protected var loadHeardLayout: Boolean = true

    abstract val loadHeardLayout: Boolean

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = createVB()
        if (loadHeardLayout) {
            baseBinding = LayoutPageTitleBarBinding.inflate(inflater)
            baseBinding.content.addView(mBinding.root)
            return baseBinding.root
        }
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 根据子类是否有 RegisterEventBus 注解決定是否进行注册 EventBus
        if (javaClass.isAnnotationPresent(RegisterEventBus::class.java)) {
            mHaveRegisterEventBus = true
            EventBusUtils.register(this)
        }
        _binding?.initView()
        initData()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    @Subscribe(sticky = true)
    open fun onMessage(event: MessageEvent) {
        Log.d("cxyTest", "onMessageBase: ${(event as RefreshEvent).activityClass}")
    }


    override fun onDestroy() {
        // 根据子类是否有 RegisterEventBus 注解决定是否进行注册 EventBus
        if (mHaveRegisterEventBus) {
            EventBusUtils.unRegister(this)
        }
        super.onDestroy()
    }
}