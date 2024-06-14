package com.hbb.mvi.ui.common
import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import androidx.viewpager2.widget.ViewPager2
import com.hbb.mvi.R
import com.hbb.mvi.common.extension.dp2px
import com.hbb.mvi.logic.adapter.CommonBannerAdapter
import com.zhpan.bannerview.BannerViewPager
import com.zhpan.bannerview.constants.PageStyle


abstract class BaseFragment <VB : ViewBinding, VM : ViewModel>: BaseFrameFragment<VB, VM>() {

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