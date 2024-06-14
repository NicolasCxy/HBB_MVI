package com.hbb.mvi.logic.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter4.BaseQuickAdapter
import com.hbb.mvi.common.extension.gone
import com.hbb.mvi.common.extension.load
import com.hbb.mvi.common.extension.setVisible
import com.hbb.mvi.common.extension.visible
import com.hbb.mvi.databinding.RvItmeHomePageBinding
import com.hbb.mvi.logic.bean.HomeNewsInfo.DataBean.DatasBean

class HomeAdapter : BaseQuickAdapter<DatasBean, HomeAdapter.VH>() {

    class VH(
        parent: ViewGroup,
        val binding: RvItmeHomePageBinding = RvItmeHomePageBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    ) : RecyclerView.ViewHolder(binding.root)

    override fun onBindViewHolder(holder: VH, position: Int, item: DatasBean?) {
//        holder.binding.issueUserImg.load(url = testUrl, round = 8f)
        item?.run {
            holder.binding.itemHomeAuthor.text = author.ifEmpty { shareUser }
            holder.binding.itemHomeContent.text = title
            holder.binding.itemHomeType2.text = ("$superChapterName·$chapterName")
//            Do not concatenate text displayed with setText.Use resource string with placeholders
            holder.binding.itemHomeDate.text = niceDate
            holder.binding.itemHomeNew.visible()
            holder.binding.itemHomeNew.setVisible(type == 1)
            if (tags.isNotEmpty()) {
                holder.binding.itemHomeType1.visible()
                holder.binding.itemHomeType1.text = tags[0].name
            }else{
                holder.binding.itemHomeType1.gone()
            }
        }
    }

    override fun onCreateViewHolder(context: Context, parent: ViewGroup, viewType: Int): VH {
        return VH(parent)
    }

}