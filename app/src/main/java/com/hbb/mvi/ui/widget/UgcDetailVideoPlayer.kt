package com.hbb.mvi.ui.widget

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer
import com.hbb.mvi.R
import com.hbb.mvi.common.extension.gone
import com.hbb.mvi.common.extension.visible
import com.shuyu.gsyvideoplayer.video.base.GSYVideoView

class UgcDetailVideoPlayer : StandardGSYVideoPlayer {

    //用于隐藏进度条以及相关按钮
    var initFirstLoad = false

    constructor(context: Context) : super(context)

    constructor(context: Context, fullFlag: Boolean?) : super(context, fullFlag)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)


    override fun getLayoutId() = R.layout.layout_ugc_detail_video_player

    override fun updateStartImage() {
        if (mStartButton is ImageView) {
            val imageView = mStartButton as ImageView
            when (mCurrentState) {
                GSYVideoView.CURRENT_STATE_PLAYING -> imageView.setImageResource(R.drawable.ic_pause_white_24dp)
                GSYVideoView.CURRENT_STATE_ERROR -> imageView.setImageResource(R.drawable.ic_play_white_24dp)
                GSYVideoView.CURRENT_STATE_AUTO_COMPLETE -> imageView.setImageResource(R.drawable.ic_refresh_white_24dp)
                else -> imageView.setImageResource(R.drawable.ic_play_white_24dp)
            }

        } else {
            super.updateStartImage()
        }
    }

    //正常-空闲
    override fun changeUiToNormal() {
        super.changeUiToNormal()
        initFirstLoad = true
    }

    //准备中
    override fun changeUiToPreparingShow() {
        super.changeUiToPreparingShow()
        mBottomContainer.gone()
    }


    //播放中
    override fun changeUiToPlayingShow() {
        super.changeUiToPlayingShow()
        if (initFirstLoad) mBottomContainer.gone()
        initFirstLoad = false
    }

    //开始缓冲
    override fun changeUiToPlayingBufferingShow() {
        super.changeUiToPlayingBufferingShow()
        if (initFirstLoad) {
            mStartButton.gone()
            initFirstLoad = false
        } else {
            mStartButton.visible()
        }
    }


    override fun changeUiToPauseShow() {
        super.changeUiToPauseShow()
    }
    //自动播放结束
    override fun changeUiToCompleteShow() {
        super.changeUiToCompleteShow()
        mBottomContainer.gone()
    }

    //错误状态
    override fun changeUiToError() {
        super.changeUiToError()
    }





}