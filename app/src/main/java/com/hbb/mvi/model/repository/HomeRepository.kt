package com.hbb.mvi.model.repository

import com.hbb.mvi.base.BaseData
import com.hbb.mvi.base.BaseRepository
import com.hbb.mvi.base.RequestState
import com.hbb.mvi.model.bean.User

class HomeRepository : BaseRepository() {
    var age = 20

    suspend fun requestUserInfoPost(): BaseData<List<User>> {
        return post {
            BaseData<List<User>>().apply {
                code = 200
                msg = "request Success"
                data = listOf(User("cxy", age), User("sanMao", 18), User("laoSi", 17))
                requestState = RequestState.SUCCESS
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