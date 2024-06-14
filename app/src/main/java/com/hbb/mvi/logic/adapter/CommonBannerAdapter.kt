package com.hbb.mvi.logic.adapter

import android.util.Log
import androidx.annotation.DrawableRes
import com.zhpan.bannerview.BaseBannerAdapter
import com.zhpan.bannerview.BaseViewHolder
import com.hbb.mvi.R

class CommonBannerAdapter : BaseBannerAdapter<Int>() {

    override fun bindData(
        holder: BaseViewHolder<Int>,
        @DrawableRes data: Int,
        position: Int,
        pageSize: Int
    ) {
        holder.setImageResource(R.id.banner_image, data)
    }

    override fun getLayoutId(viewType: Int): Int {
        return R.layout.item_custom_view
    }
}