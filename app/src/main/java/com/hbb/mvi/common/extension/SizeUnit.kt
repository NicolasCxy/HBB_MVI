package com.hbb.mvi.common.extension

import android.content.Context
import androidx.fragment.app.Fragment
import com.hbb.mvi.common.BaseApplication

/**
 * @Author: QuYunShuo
 * @Time: 2020/9/17
 * @Class: SizeUnitKtx
 * @Remark: 尺寸单位换算相关扩展属性
 */

/**
 * dp 转 px
 */
fun Context.dp2px(dpValue: Float): Int {
    val scale = resources.displayMetrics.density
    return (dpValue * scale + 0.5f).toInt()
}

/**
 * px 转 dp
 */
fun Context.px2dp(pxValue: Float): Int {
    val scale = resources.displayMetrics.density
    return (pxValue / scale + 0.5f).toInt()
}

/**
 * sp 转 px
 */
fun Context.sp2px(spValue: Float): Int {
    val scale = resources.displayMetrics.scaledDensity
    return (spValue * scale + 0.5f).toInt()
}

/**
 * px 转 sp
 */
fun Context.px2sp(pxValue: Float): Int {
    val scale = resources.displayMetrics.scaledDensity
    return (pxValue / scale + 0.5f).toInt()
}

/**
 * dp 转 px
 */
fun Fragment.dp2px(dpValue: Float): Int {
    val scale = resources.displayMetrics.density
    return (dpValue * scale + 0.5f).toInt()
}

/**
 * px 转 dp
 */
fun Fragment.px2dp(pxValue: Float): Int {
    val scale = resources.displayMetrics.density
    return (pxValue / scale + 0.5f).toInt()
}

/**
 * sp 转 px
 */
fun Fragment.sp2px(spValue: Float): Int {
    val scale = resources.displayMetrics.scaledDensity
    return (spValue * scale + 0.5f).toInt()
}

/**
 * px 转 sp
 */
fun Fragment.px2sp(pxValue: Float): Int {
    val scale = resources.displayMetrics.scaledDensity
    return (pxValue / scale + 0.5f).toInt()
}


/**
 * dp 转 px
 */
fun dp2px(dpValue: Float): Int {
    val scale = BaseApplication.context.resources.displayMetrics.density
    return (dpValue * scale + 0.5f).toInt()
}

/**
 * px 转 dp
 */
fun px2dp(pxValue: Float): Int {
    val scale = BaseApplication.context.resources.displayMetrics.density
    return (pxValue / scale + 0.5f).toInt()
}

/**
 * sp 转 px
 */
fun sp2px(spValue: Float): Int {
    val scale = BaseApplication.context.resources.displayMetrics.scaledDensity
    return (spValue * scale + 0.5f).toInt()
}

/**
 * px 转 sp
 */
fun px2sp(pxValue: Float): Int {
    val scale = BaseApplication.context.resources.displayMetrics.scaledDensity
    return (pxValue / scale + 0.5f).toInt()
}