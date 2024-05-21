package com.hbb.mvi.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.hbb.mvi.R
import com.luck.picture.lib.style.BottomNavBarStyle
import com.luck.picture.lib.style.PictureSelectorStyle
import com.luck.picture.lib.style.TitleBarStyle

class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        initStyle()
    }

    lateinit var selectorStyle: PictureSelectorStyle

    private fun initStyle() {
        // 主体风格
        selectorStyle = PictureSelectorStyle();

        // 头部TitleBar 风格
        val numberTitleBarStyle = TitleBarStyle()
        numberTitleBarStyle.titleBackgroundColor =
            ContextCompat.getColor(baseContext, R.color.ps_color_black1)
        numberTitleBarStyle.isHideCancelButton = true
        numberTitleBarStyle.isAlbumTitleRelativeLeft = true

        // 底部NavBar 风格
        val numberBottomNavBarStyle = BottomNavBarStyle()
        numberBottomNavBarStyle.bottomNarBarBackgroundColor =
            ContextCompat.getColor(baseContext, R.color.ps_color_black1)

        selectorStyle.titleBarStyle = numberTitleBarStyle
        selectorStyle.bottomBarStyle = numberBottomNavBarStyle

    }

    fun selectImg(view: View) {
        Toast.makeText(this, "开始选择!", Toast.LENGTH_SHORT).show()
        startActivity(Intent(this, MainActivity::class.java))
//        PictureSelector.create(this)
//            .openGallery(SelectMimeType.ofImage())
//            .setMaxSelectNum(1)
//            .isDisplayCamera(false)
//            .setSelectorUIStyle(selectorStyle)
//            .setImageEngine(GlideEngine.createGlideEngine())
//            .forResult(object : OnResultCallbackListener<LocalMedia?> {
//                override fun onResult(result: ArrayList<LocalMedia?>) {
//                    val availablePath = result[0]?.availablePath
//                    result[0]?.apply {
//
//
//                    }
//                    Log.i("imageTest", "onResult: $availablePath")
//
//
//                }
//
//                override fun onCancel() {
//                    Log.i("imageTest", "onCancel")
//                }
//            })
    }


}