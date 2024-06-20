package com.hbb.mvi.common

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Application
import android.content.Context
import android.util.Log
import com.hbb.mvi.common.app.ActivityLifecycleCallbacksImpl
import com.hbb.mvi.utils.SpUtils
import com.hbb.mvi.utils.network.NetworkStateClient
import com.tencent.bugly.crashreport.CrashReport
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import kotlin.system.measureTimeMillis
import com.hbb.mvi.R
import com.hbb.mvi.common.config.KoinConfig
import com.scwang.smart.refresh.header.MaterialHeader
import com.scwang.smart.refresh.layout.SmartRefreshLayout
import com.snail.collie.Collie
import com.snail.collie.CollieListener
import com.snail.collie.Config
import com.snail.collie.battery.BatteryInfo
import com.snail.collie.mem.TrackMemoryInfo
import com.tencent.mmkv.BuildConfig
import okhttp3.OkHttpClient
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import rxhttp.RxHttpPlugins
import rxhttp.wrapper.cache.CacheMode
import java.io.File

class BaseApplication : Application() {

    private val mCoroutineScope by lazy(mode = LazyThreadSafetyMode.NONE) { MainScope() }

    override fun onCreate() {
        super.onCreate()

        // 全局监听 Activity 生命周期
        registerActivityLifecycleCallbacks(ActivityLifecycleCallbacksImpl())
//        initCollie()
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
        list.add { initRxHttp() }
        list.add { initNetworkStateClient() }
        list.add { initTencentBugly() }
        list.add { initKoin() }
        list.add { initRefreshLayout() }
        return list
    }


    private fun initMMKV(): String {
        val result = SpUtils.initMMKV(context)
        return "MMKV -->> $result"
    }

    private fun initRxHttp():String{
        //设置缓存目录为：Android/data/{app包名目录}/cache/RxHttpCache
        File(context.externalCacheDir, "RxHttpCache")
        //设置最大缓存为10M，缓存有效时长为60秒
        RxHttpPlugins.init(OkHttpClient()).setCache(cacheDir, 10 * 1024 * 1024,
            CacheMode.REQUEST_NETWORK_FAILED_READ_CACHE, 60 * 1000)

        return "RxHttp -->> init complete"
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

    private fun initKoin(): String {
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@BaseApplication)
            // 将moduleList传入modules中，这样Koin就会帮助我们实现依赖注入
            modules(KoinConfig.moduleList)
        }
        return "Koin -->> init complete"
    }

    private fun initRefreshLayout():String{
        SmartRefreshLayout.setDefaultRefreshHeaderCreator { context, layout ->
            layout.setEnableHeaderTranslationContent(true)
            MaterialHeader(context).setColorSchemeResources(R.color.blue, R.color.blue, R.color.blue)
        }
        return "RefreshLayout -->> init complete"
    }


    private fun initCollie(): String {
        Collie.instance.init(this@BaseApplication, Config(
            showDebugView = true, useFpsTrack = true,
            useTrafficTrack = true, useMemTrack = true, useBatteryTrack = true, useStartUpTrack = true
        ), object : CollieListener {
            override fun onANRAppear(activity: Activity?) {
                Log.v("Collie", "Activity $activity ANR")
            }

            override fun onActivityFocusableCost(
                activity: Activity?,
                duration: Long,
                finishNow: Boolean
            ) {
                Log.v("Collie","onActivityFocusableCost: $activity")
            }

            override fun onActivityLaunchCost(
                activity: Activity?,
                duration: Long,
                finishNow: Boolean
            ) {
                Log.v("Collie", "activity启动耗时 $activity $duration finishNow $finishNow");
            }

            override fun onAppColdLaunchCost(duration: Long, processName: String?) {
                Log.v("Collie", "启动耗时 $duration processName $processName");
            }

            override fun onBatteryCost(batteryInfo: BatteryInfo?) {
                Log.v("Collie", " 电量流量消耗 " + batteryInfo?.cost)
            }

            override fun onCurrentMemoryCost(trackMemoryInfo: TrackMemoryInfo?) {
                trackMemoryInfo?.apply {
                    Log.v(
                        "Collie", "内存  " + procName + " java内存  "
                                + appMemory?.dalvikPss + " native内存  " +
                                appMemory?.nativePss
                    )
                }
            }

            override fun onFpsTrack(
                activity: Activity,
                currentCostMils: Long,
                currentDropFrame: Long,
                isInFrameDraw: Boolean,
                averageFps: Long
            ) {
                if (currentDropFrame >= 2)
                    Log.v(
                        "Collie",
                        "Activity $activity 掉帧 $currentDropFrame 是否因为Choro 绘制掉帧 $isInFrameDraw 1s 平均帧率$averageFps"
                    );
            }

            override fun onLeakActivity(activity: String?, count: Int) {
                Log.v("Collie", "内存泄露 $activity 数量 $count")
            }

            override fun onTrafficStats(activity: Activity, value: Long) {
                Log.v(
                    "Collie",
                    "" + activity.javaClass.simpleName + " 流量消耗 " + value * 1.0f / (1024 * 1024) + "M"
                )
            }
        })

        return "collie -->> init complete"
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

