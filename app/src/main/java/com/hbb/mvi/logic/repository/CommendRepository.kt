package com.hbb.mvi.logic.repository

import android.util.Log
import com.hbb.mvi.common.Const
import com.hbb.mvi.logic.bean.CommendInfo
import com.hbb.mvi.logic.bean.HomeNewsInfo
import com.hbb.mvi.logic.common.BaseData
import com.hbb.mvi.logic.common.BaseRepository
import com.hbb.mvi.logic.common.RequestState
import rxhttp.awaitResult
import rxhttp.toAwait
import rxhttp.wrapper.param.RxHttp

class CommendRepository : BaseRepository() {
    private val TAG = "BaseRepository"

    private val hostUrl = Const.ActionUrl.BAOBAB_LIST_URL
    private var nextUrl = Const.ActionUrl.BAOBAB_LIST_URL  //下一页的地址，默认是首页

    suspend fun requestCommendPost(loadMore: Boolean): BaseData<CommendInfo> {
        return post {
            val url = if (loadMore) nextUrl else hostUrl
            Log.i(TAG, "requestCommendPost: $url")
            BaseData<CommendInfo>().apply {
                RxHttp.get(url)
                    .toAwait<CommendInfo>()
                    .awaitResult {
                        it.isAdd = loadMore
                        if(!it.nextPageUrl.isNullOrEmpty()) nextUrl = it.nextPageUrl
                        code = 200
                        msg = "request success"
                        data = it
                        requestState = RequestState.SUCCESS
                    }.onFailure {
                        it.printStackTrace()
                        //异常回调
                        code = -1
                        msg = "requestCommendLost,msg: ${it.message}"
                        requestState = RequestState.ERROR
                    }
            }
        }
    }
}

