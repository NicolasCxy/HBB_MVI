package com.hbb.mvi

import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.hbb.mvi.base.BaseActivity
import com.hbb.mvi.base.LoadInter
import com.hbb.mvi.databinding.ActivityMainBinding
import com.hbb.mvi.model.bean.injectTes.Truck
import com.hbb.mvi.model.intent.HomeIEvent
import com.hbb.mvi.model.intent.UserListState
import com.hbb.mvi.model.mv.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, HomeViewModel>() {

    @Inject
    lateinit var truck: Truck

    private val TAG = "MainActivity"

//    private val mViewModel by lazy { ViewModelProvider(this)[HomeViewModel::class.java] }
//
//    override fun initData(savedInstanceState: Bundle?) {
//        observerFlowIntent()
//    }


    override val mViewModel by viewModels<HomeViewModel>()

    override fun createVB() = ActivityMainBinding.inflate(layoutInflater)


    override fun ActivityMainBinding.initView() {

    }

    override fun initData() {
        observerFlowIntent()
    }


    private fun observerFlowIntent() {
        //监听业务事件
        lifecycleScope.launch {
            mViewModel.iStateFlow.collect { state ->
                when (state.userListState) {
                    is UserListState.Instance -> {
                    }

                    is UserListState.Success -> {
                        val userList = state.userListState.userList
                        Log.i(TAG, "request success!: $userList")
                        //todo：处理用户列表信息
                    }
                }
            }
        }

        //监听加载状态
        lifecycleScope.launch {
            mViewModel.loadInterFlow.collect { loadInter ->
                when (loadInter) {
                    is LoadInter.Error -> {
                        Log.d(TAG, "loadFlow -> load error: ${loadInter.errorMsg} ")
                    }

                    is LoadInter.Loading -> {
                        val show = loadInter.isShow
                        //是否显示弹框
                    }

                    LoadInter.ShowView -> {
                        //表示当前处理完了
                    }
                }

            }

        }
    }

    fun getUserList(view: View) {
        Toast.makeText(this, "开始请求!!", Toast.LENGTH_SHORT).show()
        //发起用户列表请求
        mViewModel.sendEventIntent(HomeIEvent.GetUserList)
//        truck.deliver()
    }


}