package com.hbb.mvi.logic.repository

import com.hbb.mvi.logic.common.BaseData
import com.hbb.mvi.logic.common.BaseRepository
import com.hbb.mvi.logic.common.RequestState
import com.hbb.mvi.common.extension.logD
import com.hbb.mvi.logic.bean.HomeNewsInfo
import com.hbb.mvi.logic.bean.User
import kotlinx.coroutines.delay
import rxhttp.awaitResult
import rxhttp.toAwait
import rxhttp.wrapper.cache.CacheMode
import rxhttp.wrapper.param.RxHttp

class HomeRepository : BaseRepository() {
    private val TAG = "HomeRepository"

    suspend fun requestUserInfoPost(page: Int): BaseData<HomeNewsInfo.DataBean> {
        return post {
            val baseData = BaseData<HomeNewsInfo.DataBean>().apply {
                //回调式写法
                RxHttp.get("/article/list/$page/json")
                    .toAwait<HomeNewsInfo>()
                    .awaitResult {
                        //成功回调
                        code = it.errorCode
                        msg = it.errorMsg
                        data = it.data
                        requestState = RequestState.SUCCESS
                    }.onFailure {
                        //异常回调
                        code = -1
                        msg = "requestUserInfoPostLost,msg: ${it.message}"
                        requestState = RequestState.ERROR
                    }
                logD(TAG, "requestUserInfoPostResult: ${msg}, page: $page")
            }
            baseData
        }
    }

    /**
     * mainActivity
     *  - BaseViewModel 声明状态flow和操作flow,封装函数
     *      - 封装网络请求函数，把一些共用操作搞进去
     *  - HomeViewModel
     *      - 声明state和action的flow
     *      - 收集action的flow,处理action操作
     *  - MainActivity
     *      - 创建viewModel
     *      - 收集自己关心的状态
     *      - 可以触发Action操作
     */

    companion object {

        @Volatile
        private var INSTANCE: HomeRepository? = null

        fun getInstance(): HomeRepository {
            if (INSTANCE == null) {
                synchronized(this) {
                    if (INSTANCE == null) {
                        INSTANCE = HomeRepository()
                    }
                }
            }
            return INSTANCE!!
        }
    }

}