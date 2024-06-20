package com.hbb.mvi.logic.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.hbb.mvi.common.Const
import com.hbb.mvi.logic.bean.CommendInfo
import com.hbb.mvi.ui.activity.UgcDetailActivity
import com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer
import de.hdodenhof.circleimageview.CircleImageView
import com.hbb.mvi.R
import com.hbb.mvi.common.extension.getString
import com.hbb.mvi.common.extension.gone
import com.hbb.mvi.common.extension.inflate
import com.hbb.mvi.common.extension.invisibleAlphaAnimation
import com.hbb.mvi.common.extension.load
import com.hbb.mvi.common.extension.setOnClickListener
import com.hbb.mvi.common.extension.visible
import com.hbb.mvi.common.extension.visibleAlphaAnimation
import com.hbb.mvi.ui.activity.LoginActivity
import com.hbb.mvi.utils.toast
import com.luck.picture.lib.photoview.PhotoView
import com.shuyu.gsyvideoplayer.listener.GSYSampleCallBack

class UgcDetailAdapter(
    val activity: UgcDetailActivity,
    var dataList: List<CommendInfo.ItemListBeanX>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TAG = "UgcDetailAdapter"
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            CommendAdapter.FOLLOW_CARD_TYPE -> FollowCardViewHolder(
                R.layout.item_ugc_detail.inflate(
                    parent
                )
            )

            else -> EmptyViewHolder(View(parent.context).apply {
                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
            })
        }
    }

    override fun getItemCount() = dataList.size

    override fun getItemViewType(position: Int): Int {
        val item = dataList[position]
        return when (item.type) {
            CommendAdapter.STR_COMMUNITY_COLUMNS_CARD -> {
                if (item.data.dataType == CommendAdapter.STR_FOLLOW_CARD_DATA_TYPE) CommendAdapter.FOLLOW_CARD_TYPE
                else Const.ItemViewType.UNKNOWN
            }

            else -> Const.ItemViewType.UNKNOWN
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is FollowCardViewHolder -> {
                val item = dataList[position]
                holder.run {
                    videoPlayer.gone()
                    viewPagerPhotos.gone()
                    flHeader.visible()
                    llUgcInfo.visible()
                    ivPullDown.setOnClickListener { activity.finish() }
                    ivAvatar.load(item.data.content.data.owner.avatar)
                    if (item.data?.content?.data?.owner?.isExpert!!) ivAvatarStar.visible() else ivAvatarStar.gone()
                    tvNickName.text = item.data.content.data.owner.nickname
                    tvDescription.text = item.data.content.data.description
                    if (item.data.content.data.description.isBlank()) tvDescription.gone() else tvDescription.visible()
                    tvTagName.text = item.data.content.data.tags?.first()?.name
                    if (item.data.content.data.tags.isNullOrEmpty()) tvTagName.gone() else tvTagName.visible()
                    tvCollectionCount.text =
                        item.data.content.data.consumption.collectionCount.toString()
                    tvReplyCount.text = item.data.content.data.consumption.replyCount.toString()
                    setOnClickListener(
                        tvPrivateLetter,
                        tvFollow,
                        ivCollectionCount,
                        tvCollectionCount,
                        ivReply,
                        tvReplyCount,
                        ivFavorites,
                        tvFavorites,
                        ivShare
                    ) {
                        when (this) {
                            tvPrivateLetter, tvFollow, ivCollectionCount, tvCollectionCount, ivFavorites, tvFavorites -> LoginActivity.start(
                                activity
                            )

//                            ivShare -> showDialogShare(activity, getShareContent(item))
                            ivReply, tvReplyCount -> toast(R.string.currently_not_supported)
                        }
                    }
                    itemView.setOnClickListener { switchHeaderAndUgcInfoVisibility() }
                }
                when (item.data.content.type) {

                    CommendAdapter.STR_VIDEO_TYPE -> {
                        holder.videoPlayer.visible()
                        holder.videoPlayer.run {
                            val data = item.data.content.data
                            val cover = ImageView(activity)
                            cover.scaleType = ImageView.ScaleType.CENTER_CROP
                            cover.load(data.cover.detail)
                            cover.parent?.run { removeView(cover) }
                            thumbImageView = cover
                            setThumbPlay(true)
                            setIsTouchWiget(false)
                            isLooping = true
                            playTag = TAG
                            playPosition = position
                            setVideoAllCallBack(object : GSYSampleCallBack() {
                                override fun onClickBlank(url: String?, vararg objects: Any?) {
                                    super.onClickBlank(url, *objects)
                                    holder.switchHeaderAndUgcInfoVisibility()
                                }
                            })
                            setUp(data.playUrl, false, null)
                        }
                    }

                    CommendAdapter.STR_UGC_PICTURE_TYPE -> {
                        holder.viewPagerPhotos.visible()
                        item.data.content.data.urls?.run {
                            holder.viewPagerPhotos.orientation = ViewPager2.ORIENTATION_HORIZONTAL
                            holder.viewPagerPhotos.offscreenPageLimit = 1
                            holder.viewPagerPhotos.adapter =
                                PhotosAdapter(item.data.content.data.urls, holder)
                            if (item.data.content.data.urls.size > 1) {
                                holder.tvPhotoCount.visible()
                                holder.tvPhotoCount.text = String.format(
                                    getString(R.string.photo_count),
                                    1,
                                    item.data.content.data.urls.size
                                )
                            } else {
                                holder.tvPhotoCount.gone()
                            }
                            holder.viewPagerPhotos.registerOnPageChangeCallback(object :
                                ViewPager2.OnPageChangeCallback() {
                                override fun onPageSelected(position: Int) {
                                    super.onPageSelected(position)
                                    holder.tvPhotoCount.text = String.format(
                                        getString(R.string.photo_count),
                                        position + 1,
                                        item.data.content.data.urls.size
                                    )
                                }
                            })
                        }
                    }

                    else -> {

                    }
                }
            }

            else -> {
                holder.itemView.gone()
                toast("${TAG}:${Const.Toast.BIND_VIEWHOLDER_TYPE_WARN}\n${holder}")
            }
        }

    }

    /**
     * 未知类型，占位进行容错处理。
     */
    class EmptyViewHolder(view: View) : RecyclerView.ViewHolder(view)

    class FollowCardViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val videoPlayer = view.findViewById<GSYVideoPlayer>(R.id.videoPlayer)
        val viewPagerPhotos = view.findViewById<ViewPager2>(R.id.viewPagerPhotos)
        val ivPullDown = view.findViewById<ImageView>(R.id.ivPullDown)
        val tvPhotoCount = view.findViewById<TextView>(R.id.tvPhotoCount)
        val ivAvatar = view.findViewById<ImageView>(R.id.ivAvatar)
        val ivAvatarStar = view.findViewById<CircleImageView>(R.id.ivAvatarStar)
        val tvNickName = view.findViewById<TextView>(R.id.tvNickName)
        val tvPrivateLetter = view.findViewById<TextView>(R.id.tvPrivateLetter)
        val tvFollow = view.findViewById<TextView>(R.id.tvFollow)
        val tvDescription = view.findViewById<TextView>(R.id.tvDescription)
        val tvTagName = view.findViewById<TextView>(R.id.tvTagName)
        val ivCollectionCount = view.findViewById<ImageView>(R.id.ivCollectionCount)
        val tvCollectionCount = view.findViewById<TextView>(R.id.tvCollectionCount)
        val ivReply = view.findViewById<ImageView>(R.id.ivReply)
        val tvReplyCount = view.findViewById<TextView>(R.id.tvReplyCount)
        val ivFavorites = view.findViewById<ImageView>(R.id.ivFavorites)
        val tvFavorites = view.findViewById<TextView>(R.id.tvFavorites)
        val ivShare = view.findViewById<ImageView>(R.id.ivShare)
        val flHeader = view.findViewById<FrameLayout>(R.id.flHeader)
        val llUgcInfo = view.findViewById<LinearLayout>(R.id.llUgcInfo)

        fun switchHeaderAndUgcInfoVisibility() {
            if (ivPullDown.visibility == View.VISIBLE) {
                ivPullDown.invisibleAlphaAnimation()
                llUgcInfo.invisibleAlphaAnimation()
            } else {
                ivPullDown.visibleAlphaAnimation()
                llUgcInfo.visibleAlphaAnimation()
            }
        }
    }

    class PhotosAdapter(val dataList: List<String>, val ugcHolder: FollowCardViewHolder) : RecyclerView.Adapter<PhotosAdapter.ViewHolder>() {

        class ViewHolder(view: PhotoView) : RecyclerView.ViewHolder(view) {
            val photoView = view
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val photoView = PhotoView(parent.context)
            photoView.layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
            return ViewHolder(photoView)
        }

        override fun getItemCount() = dataList.size

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.photoView.load(dataList[position])
            holder.photoView.setOnClickListener { ugcHolder.switchHeaderAndUgcInfoVisibility() }
        }
    }


}