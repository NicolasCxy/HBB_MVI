package com.hbb.mvi.ui.fragemnt

import com.hbb.mvi.databinding.FragmentNotificationContainerBinding
import com.hbb.mvi.logic.model.EmptyViewModel
import com.hbb.mvi.ui.common.BaseFragment
import com.hbb.mvi.ui.common.BaseViewPagerFragment

class NotificationFragment : BaseFragment<FragmentNotificationContainerBinding, EmptyViewModel>() {

    override val loadHeardLayout = true

    override val mViewModel: EmptyViewModel by lazy { EmptyViewModel() }

    override fun createVB() = FragmentNotificationContainerBinding.inflate(layoutInflater)

    override fun initData() {

    }

    override fun FragmentNotificationContainerBinding.initView() {

    }

    companion object {
        fun newInstance() = NotificationFragment()
    }
}