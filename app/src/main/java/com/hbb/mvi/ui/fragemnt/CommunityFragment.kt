package com.hbb.mvi.ui.fragemnt

import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter4.BaseQuickAdapter
import com.hbb.mvi.databinding.FragmentCommunityContainerBinding
import com.hbb.mvi.logic.adapter.CommunityAdapter
import com.hbb.mvi.logic.model.EmptyViewModel
import com.hbb.mvi.ui.common.BaseFragment
import com.hbb.mvi.utils.toast

class CommunityFragment : BaseFragment<FragmentCommunityContainerBinding, EmptyViewModel>() {

    override val mViewModel: EmptyViewModel by lazy { EmptyViewModel() }

    lateinit var adapter: CommunityAdapter

    override fun createVB() = FragmentCommunityContainerBinding.inflate(layoutInflater)

    override fun initData() {

    }

    override fun FragmentCommunityContainerBinding.initView() {
        initRvAdapter(rvCommunity)
    }

    private fun initRvAdapter(recyclerView: RecyclerView) {
        adapter = CommunityAdapter()
        adapter.setItemAnimation(BaseQuickAdapter.AnimationType.SlideInBottom)

        adapter.setOnItemClickListener { adapter, view, position ->
            toast("点击：$position")
        }

        recyclerView.adapter = adapter
    }


    companion object {
        fun newInstance() = CommunityFragment()
    }
}