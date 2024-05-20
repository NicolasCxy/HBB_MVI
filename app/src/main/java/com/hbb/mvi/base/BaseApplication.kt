package com.hbb.mvi.base

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.util.Log
import com.hbb.mvi.base.app.ActivityLifecycleCallbacksImpl
import com.hbb.mvi.utils.SpUtils
import com.hbb.mvi.utils.network.NetworkStateClient
import com.tencent.bugly.crashreport.CrashReport
import com.tencent.mmkv.MMKV
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import kotlin.system.measureTimeMillis
import com.hbb.mvi.R
import com.tencent.mmkv.BuildConfig

@HiltAndroidApp
class BaseApplication : Application() {

    private val mCoroutineScope by lazy(mode = LazyThreadSafetyMode.NONE) { MainScope() }

    override fun onCreate() {
        super.onCreate()

        // 全局监听 Activity 生命周期
        registerActivityLifecycleCallbacks(ActivityLifecycleCallbacksImpl())
        //初始化三方库
        initCommonLibrary()

    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        context = base
        application = this

    }

    private fun initCommonLibrary() {
        mCoroutineScope.launch(Dispatchers.Default) { //采用全局线程池来初始化
            val allTimeMillis = measureTimeMillis {
                val depends = initByFrontDesk()
                var dependInfo: String
                depends.forEach {
                    val dependTimeMillis = measureTimeMillis { dependInfo = it() }
                    Log.d("BaseApplication", "initDepends: $dependInfo : $dependTimeMillis ms")
                }
            }
            Log.d("BaseApplication", "初始化完成 $allTimeMillis ms")
        }
    }

    private fun initByFrontDesk(): MutableList<() -> String> {
        val list = mutableListOf<() -> String>()
        list.add { initMMKV() }
        list.add { initNetworkStateClient() }
        list.add { initTencentBugly() }
        return list
    }

    private fun initMMKV(): String {
        val result = SpUtils.initMMKV(context)
        return "MMKV -->> $result"
    }

    /**
     * 初始化网络监听
     */
    private fun initNetworkStateClient(): String {
        NetworkStateClient.register()
        return "NetworkStateClient -->> init complete"
    }

    private fun initTencentBugly(): String {
        // 第三个参数为SDK调试模式开关
        CrashReport.initCrashReport(
            context,
            context.getString(R.string.BUGLY_APP_ID),
            BuildConfig.DEBUG
        )

        return "Bugly -->> init complete"
    }


    override fun onTerminate() {
        super.onTerminate()
        mCoroutineScope.cancel()
    }


    companion object {
        // 全局Context
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        @SuppressLint("StaticFieldLeak")
        lateinit var application: BaseApplication
    }
}

