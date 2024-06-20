package com.hbb.mvi.logic.common.callbcak

import android.content.Context
import android.graphics.Rect
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.hbb.mvi.common.extension.visible
import com.hbb.mvi.utils.toast
import com.shuyu.gsyvideoplayer.GSYVideoManager
import com.shuyu.gsyvideoplayer.R
import com.shuyu.gsyvideoplayer.utils.CommonUtil
import com.shuyu.gsyvideoplayer.utils.NetworkUtils
import com.shuyu.gsyvideoplayer.video.base.GSYBaseVideoPlayer

/**
 * ViewPager列表自动播放监听类。
 */
class AutoPlayPageChangeListener(
    private val viewPager: ViewPager2,
    private var defaultPosition: Int,
    private val itemPlayId: Int
) : ViewPager2.OnPageChangeCallback() {
    /**
     * 防止在当前页面抖动，触发onPageScrollStateChanged回调。
     */
    private var isPageSelected = false

    private var isNeedShowWifiDialog = true
    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        super.onPageScrolled(position, positionOffset, positionOffsetPixels)
        if (defaultPosition == position && positionOffsetPixels == 0) {
            //进入页面后，调用setCurrentItem函数，手动触发onPageScrollStateChanged函数。
            onPageScrollStateChanged(ViewPager2.SCROLL_STATE_IDLE)
            defaultPosition = -1
        }
    }

    override fun onPageSelected(position: Int) {
        super.onPageSelected(position)
        isPageSelected = true
    }

    override fun onPageScrollStateChanged(state: Int) {
        super.onPageScrollStateChanged(state)
        if (state == ViewPager2.SCROLL_STATE_IDLE && isPageSelected) {
            playVideo()
            isPageSelected = false
        }
    }

    private fun playVideo() {
        var gsyBaseVideoPlayer: GSYBaseVideoPlayer? = null
        var needPlayer = false
        for (childIndex in 0 until viewPager.childCount) {
            val view = viewPager.getChildAt(childIndex)
            if (null != view && view is RecyclerView) {
                val layoutManager = view.layoutManager
                val childCount = layoutManager?.childCount ?: 0
                for (index in 0 until childCount) {
                    if (layoutManager!!.getChildAt(index) != null && layoutManager.getChildAt(index)
                            ?.findViewById<View?>(itemPlayId) != null
                    ) {
                        val player = layoutManager.getChildAt(index)?.findViewById<View>(itemPlayId) as GSYBaseVideoPlayer
                        val rect = Rect()
                        player.getLocalVisibleRect(rect)
                        val height = player.height
                        val isPlayerVisible = rect.top == 0 && rect.bottom == height
                        if(isPlayerVisible && player.visibility == View.VISIBLE
                            && player.currentPlayer.currentState == GSYBaseVideoPlayer.CURRENT_STATE_NORMAL
                            || player.currentPlayer.currentState == GSYBaseVideoPlayer.CURRENT_STATE_ERROR){
                            gsyBaseVideoPlayer = player
                            needPlayer = true
                        }else{
                            GSYVideoManager.releaseAllVideos()
                        }
                    }
                }
            }

        }

        if(gsyBaseVideoPlayer != null && needPlayer){
            startPlayLogic(gsyBaseVideoPlayer,gsyBaseVideoPlayer.context)
        }
    }

    private fun startPlayLogic(gsyBaseVideoPlayer: GSYBaseVideoPlayer, context: Context) {
        if (!CommonUtil.isWifiConnected(context) && isNeedShowWifiDialog) {
            showWifiDialog(gsyBaseVideoPlayer, context)
            return
        }
        gsyBaseVideoPlayer.startPlayLogic()
    }

    private fun showWifiDialog(gsyBaseVideoPlayer: GSYBaseVideoPlayer, context: Context) {
        if (!NetworkUtils.isAvailable(context)) {
            toast(R.string.no_net,duration = Toast.LENGTH_LONG)
            return
        }
        AlertDialog.Builder(context).apply {
            setMessage(context.resources.getString(R.string.tips_not_wifi))
            setPositiveButton(context.resources.getString(R.string.tips_not_wifi_confirm)) { dialog, which ->
                dialog.dismiss()
                gsyBaseVideoPlayer.startPlayLogic()
                isNeedShowWifiDialog = false
            }

            setNegativeButton(context.resources.getString(R.string.tips_not_wifi_cancel)) { dialog, which ->
                dialog.dismiss()
                isNeedShowWifiDialog = true
            }
            create()
        }.show()

    }

}