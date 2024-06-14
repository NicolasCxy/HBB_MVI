package com.hbb.mvi.ui.fragemnt

import android.graphics.Color
import android.util.Log
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter4.BaseQuickAdapter
import com.chad.library.adapter4.QuickAdapterHelper
import com.chad.library.adapter4.loadState.LoadState
import com.chad.library.adapter4.loadState.trailing.TrailingLoadStateAdapter
import com.hbb.mvi.common.event.MessageEvent
import com.hbb.mvi.common.event.RefreshEvent
import com.hbb.mvi.databinding.FragmentHomeContainerBinding
import com.hbb.mvi.logic.adapter.HeaderAdapter
import com.hbb.mvi.logic.adapter.HomeAdapter
import com.hbb.mvi.logic.adapter.LoadMoreAdapter
import com.hbb.mvi.logic.common.LoadInter
import com.hbb.mvi.logic.intent.HomeIEvent
import com.hbb.mvi.logic.intent.HomeNewsState
import com.hbb.mvi.logic.model.HomeViewModel
import com.hbb.mvi.ui.common.BaseFragment
import com.hbb.mvi.utils.RegisterEventBus
import com.hbb.mvi.utils.toast
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

@RegisterEventBus
class HomePageFragment : BaseFragment<FragmentHomeContainerBinding, HomeViewModel>() {
    private val TAG = "HomePageFragment"

    override val mViewModel: HomeViewModel by viewModel()
    override fun createVB() = FragmentHomeContainerBinding.inflate(layoutInflater)

    private lateinit var helper: QuickAdapterHelper

    lateinit var adapter: HomeAdapter

    private var initPageNo = 0 //注意，主页的页码是从0开始的！！！！！

    var pageNo = initPageNo

    override fun initData() {
        observerFlowIntent()
        //请求数据加载
        requestHomeInfo(initPageNo)
    }

    override fun FragmentHomeContainerBinding.initView() {
        initRvAdapter(rvHome)
        initRefreshLayout()
    }

    private fun initRvAdapter(recyclerView: RecyclerView) {
        adapter = HomeAdapter()
        adapter.setItemAnimation(BaseQuickAdapter.AnimationType.SlideInBottom)

        //加载更多
        initLoaderMore()
        initBannerHeard()

        adapter.setOnItemClickListener { adapter, view, position ->
            toast("点击：$position")
        }

        recyclerView.adapter = helper.adapter
    }


    private fun initLoaderMore() {
        val loadMoreAdapter = LoadMoreAdapter()
        loadMoreAdapter.isAutoLoadMore = false
        loadMoreAdapter.setOnLoadMoreListener(object : TrailingLoadStateAdapter.OnTrailingListener {
            override fun onLoad() {
                requestHomeInfo(pageNo)
            }

            override fun onFailRetry() {
                requestHomeInfo(pageNo)
            }

            override fun isAllowLoading(): Boolean {
                // 下拉刷新的适合，不允许进行"加载更多"
                return !mBinding.refreshLayout.isRefreshing
            }
        })

        helper = QuickAdapterHelper.Builder(adapter)
            .setTrailingLoadStateAdapter(loadMoreAdapter)
            .build()
    }

    private fun initBannerHeard() {
        val headerAdapter = HeaderAdapter(this)
        helper.addBeforeAdapter(headerAdapter)
    }

    private fun initRefreshLayout() {
        mBinding.refreshLayout.setColorSchemeColors(Color.rgb(47, 223, 189))
        mBinding.refreshLayout.setOnRefreshListener { requestHomeInfo(initPageNo) }
    }


    private fun observerFlowIntent() {
        //监听业务事件
        lifecycleScope.launch {
            mViewModel.iStateFlow.collect { state ->
                when (state.userListState) {
                    is HomeNewsState.Instance -> {}

                    is HomeNewsState.Success -> {
                        val newsData = state.userListState.homeNewsData
                        if (pageNo == initPageNo && newsData.datas.size == 0) {

                        } else if (pageNo == initPageNo) { //第一次加载成功
                            adapter.submitList(newsData.datas)
                        } else { //追加数据
                            adapter.addAll(newsData.datas)
                        }

                        Log.i(TAG, "request success: ${newsData.datas}")

                        pageNo++
                        helper.trailingLoadState = LoadState.NotLoading(newsData.isOver)
                    }
                }
            }
        }

        //监听加载状态
        lifecycleScope.launch {
            mViewModel.loadInterFlow.collect { loadInter ->
                when (loadInter) {
                    is LoadInter.Error -> {
                        Log.e(TAG, "loadFlow -> load error: ${loadInter.errorMsg} ")
                        helper.trailingLoadState = LoadState.Error( Throwable(loadInter.errorMsg))
                    }

                    is LoadInter.Loading -> {
                        //是否显示弹框
                        mBinding.refreshLayout.isRefreshing = loadInter.isShow
                    }

                    LoadInter.ShowView -> {
                        //表示当前处理完了
                        helper.trailingLoadState = LoadState.NotLoading(false)
                    }
                }
            }
        }
    }

    override fun onMessage(event: MessageEvent) {
        if (event is RefreshEvent && this::class.java == event.activityClass) {
            //发起用户列表请求
            requestHomeInfo(initPageNo)
        }
    }

    private fun requestHomeInfo(page: Int) {
        if (page == 0) pageNo = 0
        mViewModel.sendEventIntent(HomeIEvent.GetHomeNews(page))
    }


    companion object {
        fun newInstance() = HomePageFragment()
    }
}