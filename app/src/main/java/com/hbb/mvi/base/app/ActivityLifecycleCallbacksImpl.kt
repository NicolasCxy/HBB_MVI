package com.hbb.mvi.base.app

import android.app.Activity
import android.app.Application.ActivityLifecycleCallbacks
import android.os.Bundle
import android.util.Log

class ActivityLifecycleCallbacksImpl :ActivityLifecycleCallbacks {
    private val TAG = "ActivityLifecycle"

    override fun onActivityCreated(activity: Activity, bundle: Bundle?) {
        ActivityStackManager.addActivityToStack(activity)
        Log.e(TAG, "${activity.javaClass.simpleName} --> onActivityCreated")
    }

    override fun onActivityStarted(activity: Activity) {
        Log.e(TAG, "${activity.javaClass.simpleName} --> onActivityStarted")
        ForegroundBackgroundHelper.onActivityStarted()
    }

    override fun onActivityResumed(activity: Activity) {
        Log.e(TAG, "${activity.javaClass.simpleName} --> onActivityResumed")
    }

    override fun onActivityPaused(activity: Activity) {
        Log.e(TAG, "${activity.javaClass.simpleName} --> onActivityPaused")
    }

    override fun onActivityStopped(activity: Activity) {
        Log.e(TAG, "${activity.javaClass.simpleName} --> onActivityStopped")
        ForegroundBackgroundHelper.onActivityStopped()
    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
        Log.e(TAG, "${activity.javaClass.simpleName} --> onActivitySaveInstanceState")
    }

    override fun onActivityDestroyed(activity: Activity) {
        ActivityStackManager.popActivityToStack(activity)
        Log.e(TAG, "${activity.javaClass.simpleName} --> onActivityDestroyed")
    }
}