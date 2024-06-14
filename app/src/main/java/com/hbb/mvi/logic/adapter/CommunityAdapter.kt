package com.hbb.mvi.logic.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter4.BaseQuickAdapter
import com.hbb.mvi.common.extension.load
import com.hbb.mvi.databinding.RvItmeCommunityPageBinding
import com.hbb.mvi.databinding.RvItmeHomePageBinding

class CommunityAdapter : BaseQuickAdapter<String, CommunityAdapter.VH>() {
    val testUrl =
        "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fc-ssl.duitang.com%2Fuploads%2Fitem%2F202007%2F06%2F20200706122811_llxpu.thumb.400_0.jpg&refer=http%3A%2F%2Fc-ssl.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1720857309&t=0d60c260b19fe99184853760be6acdb9"

    class VH(
        parent: ViewGroup,
        val binding: RvItmeCommunityPageBinding = RvItmeCommunityPageBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    ) : RecyclerView.ViewHolder(binding.root)

    override fun onBindViewHolder(holder: VH, position: Int, item: String?) {
        holder.binding.issueUserImg.load(url = testUrl, round = 8f)
    }

    override fun onCreateViewHolder(context: Context, parent: ViewGroup, viewType: Int): VH {
        return VH(parent)
    }

}