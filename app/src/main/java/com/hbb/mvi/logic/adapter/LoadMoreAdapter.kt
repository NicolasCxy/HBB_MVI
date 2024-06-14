package com.hbb.mvi.logic.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter4.loadState.LoadState
import com.chad.library.adapter4.loadState.trailing.TrailingLoadStateAdapter
import com.hbb.mvi.databinding.ViewLoadMoreBinding

class LoadMoreAdapter : TrailingLoadStateAdapter<LoadMoreAdapter.LoaderVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState): LoaderVH {
        val viewBinding = ViewLoadMoreBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LoaderVH(viewBinding).apply {
            viewBinding.loadMoreLoadFailView.setOnClickListener {
                // 失败重试点击事件
                invokeFailRetry()
            }
            viewBinding.loadMoreLoadCompleteView.setOnClickListener {
                // 加载更多，手动点击事件
                invokeLoadMore()
            }
        }
    }

    override fun onBindViewHolder(holder: LoaderVH, loadState: LoadState) {
        when (loadState) {
            is LoadState.NotLoading -> {
                if (loadState.endOfPaginationReached) {
                    holder.viewBinding.loadMoreLoadCompleteView.visibility = View.GONE
                    holder.viewBinding.loadMoreLoadingView.visibility = View.GONE
                    holder.viewBinding.loadMoreLoadFailView.visibility = View.GONE
                    holder.viewBinding.loadMoreLoadEndView.visibility = View.VISIBLE
                } else {
                    holder.viewBinding.loadMoreLoadCompleteView.visibility = View.VISIBLE
                    holder.viewBinding.loadMoreLoadingView.visibility = View.GONE
                    holder.viewBinding.loadMoreLoadFailView.visibility = View.GONE
                    holder.viewBinding.loadMoreLoadEndView.visibility = View.GONE
                }
            }
            is LoadState.Loading -> {
                holder.viewBinding.loadMoreLoadCompleteView.visibility = View.GONE
                holder.viewBinding.loadMoreLoadingView.visibility = View.VISIBLE
                holder.viewBinding.loadMoreLoadFailView.visibility = View.GONE
                holder.viewBinding.loadMoreLoadEndView.visibility = View.GONE
            }
            is LoadState.Error -> {
                holder.viewBinding.loadMoreLoadCompleteView.visibility = View.GONE
                holder.viewBinding.loadMoreLoadingView.visibility = View.GONE
                holder.viewBinding.loadMoreLoadFailView.visibility = View.VISIBLE
                holder.viewBinding.loadMoreLoadEndView.visibility = View.GONE
            }
            is LoadState.None -> {
                holder.viewBinding.loadMoreLoadCompleteView.visibility = View.GONE
                holder.viewBinding.loadMoreLoadingView.visibility = View.GONE
                holder.viewBinding.loadMoreLoadFailView.visibility = View.GONE
                holder.viewBinding.loadMoreLoadEndView.visibility = View.GONE
            }
        }
    }


    class LoaderVH(val viewBinding: ViewLoadMoreBinding) : RecyclerView.ViewHolder(viewBinding.root)
}