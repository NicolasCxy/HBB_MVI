package com.hbb.mvi.ui.common

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.flyco.tablayout.CommonTabLayout
import com.flyco.tablayout.listener.CustomTabEntity
import com.flyco.tablayout.listener.OnTabSelectListener
import com.hbb.mvi.R
import com.hbb.mvi.common.extension.gone
import com.hbb.mvi.common.extension.setOnClickListener
import com.hbb.mvi.utils.toast


abstract class BaseViewPagerFragment<VB : ViewBinding, VM : ViewModel> : BaseFragment<VB, VM>() {

    protected var ivCalendar: ImageView? = null

    protected var ivSearch: ImageView? = null

    protected var viewPager: ViewPager2? = null

    protected var tabLayout: CommonTabLayout? = null

    protected var pageChangeCallback: PageChangeCallback? = null

    protected var offscreenPageLimit = 1

    protected val adapter: VpAdapter by lazy {
        VpAdapter(requireActivity()).apply {
            Log.i("cxyTest", ": ")
            addFragments(
                createFragments
            )
        }
    }

    abstract val createTitles: ArrayList<CustomTabEntity>

    abstract val createFragments: Array<Fragment>

    protected var rootView: View? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupHardViews()
    }

    private fun setupHardViews() {
        rootView = mBinding.root
        ivCalendar = baseBinding.ivCalendar
        ivSearch = baseBinding.ivSearch
        baseBinding.title.gone()
        setOnClickListener(ivCalendar, ivSearch) {
            if (this == ivCalendar) {
                toast(R.string.currently_not_supported)
            } else if (this == ivSearch) {
//                SearchFragment.switchFragment(activity)  //todo:后续开放
            }
        }
        initViewPager()
    }

    private fun initViewPager() {
        viewPager = rootView?.findViewById(R.id.viewPager)
        tabLayout = baseBinding.tabLayout
        viewPager?.offscreenPageLimit = offscreenPageLimit
        viewPager?.adapter = adapter
        tabLayout?.setTabData(createTitles)
        tabLayout?.setOnTabSelectListener(object : OnTabSelectListener {
            override fun onTabSelect(position: Int) {
                viewPager?.currentItem = position
            }

            override fun onTabReselect(position: Int) {

            }
        })

        //绑定监听
        pageChangeCallback = PageChangeCallback(tabLayout)
        viewPager?.registerOnPageChangeCallback(pageChangeCallback!!)
    }


    class PageChangeCallback(private val tabLayout: CommonTabLayout?) : OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            super.onPageSelected(position)
            tabLayout?.currentTab = position
        }
    }


    class VpAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

        private val fragments = mutableListOf<Fragment>()

        fun addFragments(fragment: Array<Fragment>) {
            fragments.addAll(fragment)
        }

        override fun getItemCount() = fragments.size

        override fun createFragment(position: Int) = fragments[position]

    }

    override fun onDestroy() {
        super.onDestroy()
        pageChangeCallback?.run { viewPager?.unregisterOnPageChangeCallback(this) }
        pageChangeCallback = null
    }

    /**
     * 需要在布局声明BannerViewPager，要不然会报错
     */
//    fun initViewPager() {
//        val mViewPager: BannerViewPager<Int> = mBinding.root.findViewById(R.id.banner_view)
//        mViewPager.apply {
//            adapter = CommonBannerAdapter()
//            registerLifecycleObserver(lifecycle)
//            setRevealWidth(resources.getDimensionPixelOffset(R.dimen.dp_30),resources.getDimensionPixelOffset(R.dimen.dp_30))
//            setPageStyle(PageStyle.MULTI_PAGE_SCALE)
//            setPageMargin(15)
//        }.create(getDefaultBannerData())
//
//
//    }
//
//    private fun getDefaultBannerData():List<Int> {
//        R.dimen.lagerTextSize
//      return  listOf(R.drawable.banner1,R.drawable.banner2,R.drawable.banner3,R.drawable.banner4)
//    }


}