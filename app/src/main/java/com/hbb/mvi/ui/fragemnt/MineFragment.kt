package com.hbb.mvi.ui.fragemnt

import com.hbb.mvi.databinding.FragmentMineContainerBinding
import com.hbb.mvi.logic.model.EmptyViewModel
import com.hbb.mvi.ui.common.BaseFragment
import com.hbb.mvi.ui.common.BaseViewPagerFragment

class MineFragment : BaseFragment<FragmentMineContainerBinding, EmptyViewModel>() {

    override val loadHeardLayout = true

    override val mViewModel: EmptyViewModel by lazy { EmptyViewModel() }

    override fun createVB() = FragmentMineContainerBinding.inflate(layoutInflater)

    override fun initData() {

    }

    override fun FragmentMineContainerBinding.initView() {

    }

    companion object {
        fun newInstance() = MineFragment()
    }
}