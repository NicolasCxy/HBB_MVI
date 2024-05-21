package com.hbb.mvi.model.repository

import com.hbb.mvi.base.BaseData
import com.hbb.mvi.base.BaseRepository
import com.hbb.mvi.base.RequestState
import com.hbb.mvi.base.ktx.logD
import com.hbb.mvi.model.bean.User
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import rxhttp.awaitResult
import rxhttp.toAwait
import rxhttp.toFlow
import rxhttp.wrapper.param.RxHttp

class HomeRepository : BaseRepository() {
    private val TAG = "HomeRepository"

    var age = 20

    suspend fun requestUserInfoPost(): BaseData<List<User>> {
//        RxHttp.get("/article/list/0/json")
//            .toFlow<String>()
//            .catch {
//                logD(TAG, "requestUserInfoPostError: ${it.message}")
//            }.collect {
//                logD(TAG, "requestUserInfoPostSuccess!: $it")
//            }
//
//        val string = RxHttp.get("https://www.wanandroid.com/article/list/0/json")
//            .toAwait<String>()
//            .await()

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
}