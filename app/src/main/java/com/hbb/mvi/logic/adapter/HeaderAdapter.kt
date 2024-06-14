package com.hbb.mvi.logic.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter4.BaseSingleItemAdapter
import com.hbb.mvi.R
import com.zhpan.bannerview.BannerViewPager
import com.zhpan.bannerview.constants.PageStyle

class HeaderAdapter(val host: Fragment? = null) : BaseSingleItemAdapter<Any, HeaderAdapter.VH>() {
    private val TAG = "HeaderAdapter"

    class VH(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(context: Context, parent: ViewGroup, viewType: Int): VH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_banner_header_page, parent, false)
        return VH(view)
    }

    override fun onBindViewHolder(holder: VH, item: Any?) {
        initViewPager(holder.itemView)
    }


    private fun initViewPager(view: View) {
        val mViewPager: BannerViewPager<Int> = view.findViewById(R.id.banner_view)
        mViewPager.apply {
            adapter = CommonBannerAdapter()
            host?.apply {
                registerLifecycleObserver(lifecycle)
            }
            setRevealWidth(resources.getDimensionPixelOffset(R.dimen.dp_30),resources.getDimensionPixelOffset(R.dimen.dp_30))
            setPageStyle(PageStyle.MULTI_PAGE_SCALE)
            setPageMargin(15)
        }.create(getDefaultBannerData())

        mViewPager.setOnPageClickListener{view,position ->
            Log.i(TAG, "initViewPager: $position")
        }
    }

    private fun getDefaultBannerData():List<Int> {
        R.dimen.lagerTextSize
        return  listOf(R.drawable.banner1,R.drawable.banner2,R.drawable.banner3,R.drawable.banner4)
    }

}