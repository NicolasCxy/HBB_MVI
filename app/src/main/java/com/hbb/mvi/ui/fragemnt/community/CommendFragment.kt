package com.hbb.mvi.ui.fragemnt.community

import android.content.Context
import android.graphics.Color
import android.util.DisplayMetrics
import android.util.Log
import android.view.WindowManager
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.chad.library.adapter4.QuickAdapterHelper
import com.chad.library.adapter4.loadState.LoadState
import com.chad.library.adapter4.loadState.trailing.TrailingLoadStateAdapter
import com.hbb.mvi.common.event.MessageEvent
import com.hbb.mvi.common.event.RefreshEvent
import com.hbb.mvi.common.extension.getDimension
import com.hbb.mvi.databinding.FragmentRvContainerBinding
import com.hbb.mvi.logic.adapter.CommendAdapter
import com.hbb.mvi.logic.common.LoadInter
import com.hbb.mvi.logic.intent.CommendIEvent
import com.hbb.mvi.logic.intent.CommendListState
import com.hbb.mvi.logic.model.CommendViewModel
import com.hbb.mvi.ui.common.BaseFragment
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.hbb.mvi.R
import com.hbb.mvi.common.extension.dp2px
import com.hbb.mvi.logic.adapter.LoadMoreAdapter
import com.hbb.mvi.utils.RegisterEventBus

/**
 * 社区-推荐页面
 */
@RegisterEventBus
class CommendFragment : BaseFragment<FragmentRvContainerBinding, CommendViewModel>() {
    private val TAG = "CommendFragment"

    /**
     * 列表左or右间距
     */
    val bothSideSpace = getDimension(R.dimen.listSpaceSize)

    /**
     * 列表中间内间距，左or右。
     */
    val middleSpace by lazy { dp2px(3f) }

    /**
     * 通过获取屏幕宽度来计算出每张图片最大的宽度。
     *
     * @return 计算后得出的每张图片最大的宽度。
     */
    val maxImageWidth: Int
        get() {
            val windowManager = activity?.getSystemService(Context.WINDOW_SERVICE) as WindowManager
            val metrics = DisplayMetrics()
            windowManager.defaultDisplay?.getMetrics(metrics)
            val columnWidth = metrics.widthPixels
            return (columnWidth - ((bothSideSpace * 2) + (middleSpace * 2))) / 2
        }


    lateinit var adapter: CommendAdapter

    private lateinit var helper: QuickAdapterHelper

    override val mViewModel: CommendViewModel by viewModel()

    override val loadHeardLayout = false

    override fun createVB() = FragmentRvContainerBinding.inflate(layoutInflater)

    override fun initData() {
        observerFlowIntent()
        requestCommendList()
    }

    override fun FragmentRvContainerBinding.initView() {
        initRvAdapter(rvHome)
        initRefreshLayout()
    }

    private fun initRvAdapter(recyclerView: RecyclerView) {
        adapter = CommendAdapter(this)

        initLoaderMore()

        val mainLayoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        mainLayoutManager.gapStrategy = StaggeredGridLayoutManager.GAP_HANDLING_NONE
        recyclerView.layoutManager = mainLayoutManager
        recyclerView.adapter = helper.adapter
        recyclerView.addItemDecoration(CommendAdapter.ItemDecoration(this))
        recyclerView.setHasFixedSize(true)
//        refreshLayout.setOnRefreshListener { adapter.refresh() }
    }

    private fun initLoaderMore() {
//        val loadMoreAdapter = LoadMoreAdapter()
//        loadMoreAdapter.isAutoLoadMore = false
//        loadMoreAdapter.setOnLoadMoreListener(object : TrailingLoadStateAdapter.OnTrailingListener {
//            override fun onLoad() {
//                requestCommendList(true)
//            }
//
//            override fun onFailRetry() {
//                requestCommendList(true)
//            }
//
//            override fun isAllowLoading(): Boolean {
//                // 下拉刷新的适合，不允许进行"加载更多"
//                return !mBinding.refreshLayout.isRefreshing
//            }
//        })

        helper = QuickAdapterHelper.Builder(adapter)
            .setTrailingLoadStateAdapter(object : TrailingLoadStateAdapter.OnTrailingListener {
                override fun onLoad() {
                    requestCommendList(true)
                }

                override fun onFailRetry() {
                    requestCommendList(true)
                }

                override fun isAllowLoading(): Boolean {
                    return !mBinding.refreshLayout.isRefreshing
                }
            }).build()

//        helper = QuickAdapterHelper.Builder(adapter)
//            .setTrailingLoadStateAdapter(loadMoreAdapter)
//            .build()
    }

    private fun initRefreshLayout() {
        mBinding.refreshLayout.setOnRefreshListener { requestCommendList() }
    }

    private fun observerFlowIntent() {
        lifecycleScope.launch {
            mViewModel.iStateFlow.collect { state ->
                when (state.commendListState) {
                    is CommendListState.Success -> {
                        val data = state.commendListState.commendNewsData
                        Log.d(TAG, "observerFlowIntentAdd!: ${data.isAdd}")
                        Log.i(TAG, "observerFlowIntent: $data")
                        if(data.isAdd){
                            adapter.addAll(data.itemList)
                        }else{
                            adapter.submitList(data.itemList)
                        }
                    }

                    else -> {}
                }
            }
        }

        lifecycleScope.launch {
            mViewModel.loadInterFlow.collect { loadInter ->
                when (loadInter) {
                    is LoadInter.Error -> {
                        Log.e(TAG, "loadFlow -> load error: ${loadInter.errorMsg} ")
                        helper.trailingLoadState = LoadState.Error( Throwable(loadInter.errorMsg))
                    }

                    is LoadInter.Loading -> {
                        //是否显示弹框
//                        mBinding.refreshLayout.isRefreshing = loadInter.isShow
                    }

                    LoadInter.ShowView -> {
                        helper.trailingLoadState = LoadState.NotLoading(false)
                        mBinding.refreshLayout.finishRefresh()
                    }
                }

            }
        }
    }

    override fun onMessage(event: MessageEvent) {
        super.onMessage(event)
        if (event is RefreshEvent && javaClass == event.activityClass) {
            requestCommendList()
        }
    }

    /**
     * 是否加载更多，还是重新加载
     */
    private fun requestCommendList(loadMore: Boolean = false) {
        mViewModel.sendEventIntent(CommendIEvent.GetCommendList(loadMore))
    }

    companion object {
        fun newInstance() = CommendFragment()
    }

}