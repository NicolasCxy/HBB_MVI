package com.hbb.mvi.logic.repository

import com.hbb.mvi.logic.common.BaseData
import com.hbb.mvi.logic.common.BaseRepository
import com.hbb.mvi.logic.common.RequestState
import com.hbb.mvi.extension.logD
import com.hbb.mvi.logic.bean.User
import rxhttp.awaitResult
import rxhttp.toAwait
import rxhttp.wrapper.param.RxHttp

class HomeRepository : BaseRepository() {
    private val TAG = "HomeRepository"

    var age = 20

    suspend fun requestUserInfoPost(): BaseData<List<User>> {
        return post {
            val baseData = BaseData<List<User>>()
            //回调式写法
            RxHttp.get("/article/list/0/json")
                .toAwait<String>()
                .awaitResult {
                    //成功回调
                    baseData.code = 200
                    baseData.msg = it
                    baseData.requestState = RequestState.SUCCESS
                }.onFailure {
                    //异常回调
                    baseData.code = -1
                    baseData.msg = "request Lose"
                    baseData.requestState = RequestState.ERROR
                }

            logD(TAG, "requestUserInfoPostResult!!: ${baseData.msg}")

            baseData.apply {
                data = listOf(User("cxy", age), User("sanMao", 18), User("laoSi", 17))
                age++
            }
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