package com.hbb.mvi.ui.fragemnt.community

import com.hbb.mvi.databinding.FragmentRvContainerBinding
import com.hbb.mvi.logic.model.EmptyViewModel
import com.hbb.mvi.ui.common.BaseFragment
import com.hbb.mvi.utils.RegisterEventBus

/**
 * 社区-关注页面
 */
@RegisterEventBus
class FollowFragment : BaseFragment<FragmentRvContainerBinding, EmptyViewModel>() {

    override val mViewModel: EmptyViewModel = EmptyViewModel()

    override val loadHeardLayout = false

    override fun createVB() = FragmentRvContainerBinding.inflate(layoutInflater)

    override fun initData() {

    }

    override fun FragmentRvContainerBinding.initView() {
    }

    companion object {

        fun newInstance() = FollowFragment()
    }

}