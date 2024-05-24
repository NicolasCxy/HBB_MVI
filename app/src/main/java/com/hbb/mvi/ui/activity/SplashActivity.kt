package com.hbb.mvi.ui.activity

import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import androidx.lifecycle.lifecycleScope
import com.hbb.mvi.databinding.ActivitySplashBinding
import com.hbb.mvi.logic.model.EmptyViewModel
import com.hbb.mvi.ui.common.BaseActivity
import com.hbb.mvi.utils.toast
import com.hjq.permissions.OnPermissionCallback
import com.hjq.permissions.Permission
import com.hjq.permissions.XXPermissions
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.koin.android.ext.android.inject

class SplashActivity : BaseActivity<ActivitySplashBinding,EmptyViewModel>() {

    private val splashDuration = 3 * 1000L

    private val alphaAnimation by lazy {
        AlphaAnimation(0.5f, 1.0f).apply {
            duration = splashDuration
            fillAfter = true
        }
    }

    private val scaleAnimation by lazy {
        ScaleAnimation(
            1.0f,
            1.05f,
            1.0f,
            1.05f,
            Animation.RELATIVE_TO_SELF,
            0.5f,
            Animation.RELATIVE_TO_SELF,
            0.5f
        ).apply {
            duration = splashDuration
            fillAfter = true
        }

    }

    override val mViewModel: EmptyViewModel by inject()

    override fun createVB() = ActivitySplashBinding.inflate(layoutInflater)

    override fun initData() {
        requestALLPermission()
    }

    override fun ActivitySplashBinding.initView() {

    }

    private fun setUpView() {
        mBinding.ivSlogan.startAnimation(alphaAnimation)
        mBinding.ivSplashPicture.startAnimation(scaleAnimation)
        lifecycleScope.launch {
            delay(splashDuration)
            MainActivity.start(this@SplashActivity)
            finish()
        }
    }


    private fun requestALLPermission() {
        XXPermissions.with(this)
            .permission(Permission.MANAGE_EXTERNAL_STORAGE)
            .permission(Permission.CAMERA)
            .request(object : OnPermissionCallback {
                override fun onGranted(permissions: MutableList<String>, allGranted: Boolean) {
                    if (!allGranted) {
                        toast("获取部分权限成功，但部分权限未正常授予!")
                        return
                    }
                    toast("获取权限成功!")
                    setUpView()
                }

                override fun onDenied(permissions: MutableList<String>, doNotAskAgain: Boolean) {
                    if (doNotAskAgain) {
                        toast("被永久拒绝授权，请手动授予权限")
                        XXPermissions.startPermissionActivity(this@SplashActivity, permissions)
                    } else {
                        toast("获取权限失败!")
                    }
                }
            })
    }



    companion object {
        var isFirstEntryApp: Boolean = true
    }


}