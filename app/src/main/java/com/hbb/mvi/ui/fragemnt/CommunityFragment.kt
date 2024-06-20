package com.hbb.mvi.ui.fragemnt

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter4.BaseQuickAdapter
import com.flyco.tablayout.listener.CustomTabEntity
import com.hbb.mvi.databinding.FragmentCommunityContainerBinding
import com.hbb.mvi.logic.adapter.CommunityAdapter
import com.hbb.mvi.logic.bean.TabEntity
import com.hbb.mvi.logic.model.EmptyViewModel
import com.hbb.mvi.ui.common.BaseViewPagerFragment
import com.hbb.mvi.utils.toast
import com.hbb.mvi.R
import com.hbb.mvi.common.event.MessageEvent
import com.hbb.mvi.common.event.RefreshEvent
import com.hbb.mvi.ui.fragemnt.community.CommendFragment
import com.hbb.mvi.ui.fragemnt.community.FollowFragment
import com.hbb.mvi.utils.EventBusUtils
import com.hbb.mvi.utils.GlobalUtils
import com.hbb.mvi.utils.RegisterEventBus
import org.greenrobot.eventbus.EventBus

@RegisterEventBus
class CommunityFragment :
    BaseViewPagerFragment<FragmentCommunityContainerBinding, EmptyViewModel>() {
    override val createTitles: ArrayList<CustomTabEntity> = ArrayList<CustomTabEntity>().apply {
        add(TabEntity(GlobalUtils.getString(R.string.commend)))
        add(TabEntity(GlobalUtils.getString(R.string.follow)))
    }
    override val createFragments: Array<Fragment> =
        arrayOf(CommendFragment.newInstance(), FollowFragment.newInstance())

    override val mViewModel: EmptyViewModel by lazy { EmptyViewModel() }

    override val loadHeardLayout = true

    override fun createVB() = FragmentCommunityContainerBinding.inflate(layoutInflater)

    override fun initData() {

    }

    override fun FragmentCommunityContainerBinding.initView() {

    }

    override fun onMessage(event: MessageEvent) {
        super.onMessage(event)
        if (event is RefreshEvent && this::class.java == event.activityClass) {
            when (viewPager?.currentItem) {
                1 -> EventBus.getDefault().post(RefreshEvent(CommendFragment::class.java))
                2 -> EventBus.getDefault().post(RefreshEvent(FollowFragment::class.java))
            }
        }
    }

    companion object {
        fun newInstance() = CommunityFragment()
    }
}