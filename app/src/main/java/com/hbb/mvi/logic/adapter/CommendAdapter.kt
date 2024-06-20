package com.hbb.mvi.logic.adapter

import android.content.Context
import android.graphics.Rect
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.chad.library.adapter4.BaseMultiItemAdapter
import com.hbb.mvi.databinding.RvItemCommunityColumnsCardFollowBinding
import com.hbb.mvi.databinding.RvItemCommunityScrollcardBannerBinding
import com.hbb.mvi.databinding.RvItemCommunityScrollcardCollectionBinding
import com.hbb.mvi.logic.bean.CommendInfo
import com.hbb.mvi.ui.fragemnt.community.CommendFragment
import com.hbb.mvi.R
import com.hbb.mvi.common.extension.dp2px
import com.hbb.mvi.common.extension.getDimension
import com.hbb.mvi.common.extension.getString
import com.hbb.mvi.common.extension.gone
import com.hbb.mvi.common.extension.invisible
import com.hbb.mvi.common.extension.load
import com.hbb.mvi.common.extension.logW
import com.hbb.mvi.common.extension.setDrawable
import com.hbb.mvi.common.extension.visible
import com.hbb.mvi.ui.activity.UgcDetailActivity
import com.hbb.mvi.utils.toast

/**
 * 社区意见列表Adapter
 */
class CommendAdapter(val fragment: CommendFragment) :
    BaseMultiItemAdapter<CommendInfo.ItemListBeanX>() {

    // 头部item
    class HeadItemVH(val mBinding: RvItemCommunityScrollcardCollectionBinding) :
        RecyclerView.ViewHolder(mBinding.root)

    // 第二层banner的item
    class BannerItemVH(val mBinding: RvItemCommunityScrollcardBannerBinding) :
        RecyclerView.ViewHolder(mBinding.root)

    class ItemVH(val mBinding: RvItemCommunityColumnsCardFollowBinding) :
        RecyclerView.ViewHolder(mBinding.root)

    init {
        addItemType(HORIZONTAL_SCROLLCARD_ITEM_COLLECTION_TYPE,
            object : OnMultiItemAdapterListener<CommendInfo.ItemListBeanX, HeadItemVH> {
                override fun onBind(
                    holder: HeadItemVH,
                    position: Int,
                    item: CommendInfo.ItemListBeanX?
                ) {
                    val headRecyclerView = holder.mBinding.recyclerView
                    (holder.itemView.layoutParams as StaggeredGridLayoutManager.LayoutParams).isFullSpan =
                        true
                    headRecyclerView.layoutManager = LinearLayoutManager(fragment.activity).apply {
                        orientation = LinearLayoutManager.HORIZONTAL
                    }
                    if (headRecyclerView.itemDecorationCount == 0) {
                        headRecyclerView.addItemDecoration(
                            SquareCardOfCommunityContentItemDecoration(fragment)
                        )
                    }
                    headRecyclerView.adapter =
                        SquareCardOfCommunityContentAdapter(fragment, item?.data?.itemList)
                }

                override fun onCreate(
                    context: Context,
                    parent: ViewGroup,
                    viewType: Int
                ): HeadItemVH {
                    val viewBinding = RvItemCommunityScrollcardCollectionBinding.inflate(
                        LayoutInflater.from(context),
                        parent,
                        false
                    )
                    return HeadItemVH(viewBinding)
                }

            }).addItemType(HORIZONTAL_SCROLLCARD_TYPE,
            object : OnMultiItemAdapterListener<CommendInfo.ItemListBeanX, BannerItemVH> {
                override fun onBind(
                    holder: BannerItemVH, position: Int,
                    item: CommendInfo.ItemListBeanX?
                ) {
                    val bannerViewPager = holder.mBinding.bannerViewPager
                    (holder.itemView.layoutParams as StaggeredGridLayoutManager.LayoutParams).isFullSpan =
                        true
                    bannerViewPager.run {
                        setCanLoop(false)
                        setRoundCorner(dp2px(4f))
                        setRevealWidth(0, getDimension(R.dimen.listSpaceSize))
                        if (item?.data?.itemList?.size == 1) setPageMargin(0) else setPageMargin(
                            dp2px(
                                4f
                            )
                        )
                        setIndicatorVisibility(View.GONE)
                        removeDefaultPageTransformer()
                        setAdapter(CommonBannerAdapter())
                        setOnPageClickListener { _, position -> toast("选中条目: $position") }
                        create(getDefaultBannerData())
                    }
                }

                override fun onCreate(
                    context: Context,
                    parent: ViewGroup,
                    viewType: Int
                ): BannerItemVH {
                    val viewBinding = RvItemCommunityScrollcardBannerBinding.inflate(
                        LayoutInflater.from(context),
                        parent,
                        false
                    )
                    return BannerItemVH(viewBinding)
                }

            }).addItemType(FOLLOW_CARD_TYPE,
            object : OnMultiItemAdapterListener<CommendInfo.ItemListBeanX, ItemVH> {
                override fun onBind(
                    holder: ItemVH, position: Int, item: CommendInfo.ItemListBeanX?
                ) {

                    item?.data?.content?.data?.let { data ->
                        holder.mBinding.tvChoiceness.gone()
                        holder.mBinding.ivPlay.gone()
                        holder.mBinding.ivLayers.gone()

                        if (data.library == DAILY_LIBRARY_TYPE) holder.mBinding.tvChoiceness.visible()

                        if ((item.data.header.iconType ?: "".trim()) == "round") {
                            holder.mBinding.ivAvatar.invisible()
                            holder.mBinding.ivRoundAvatar.visible()
                            holder.mBinding.ivRoundAvatar.load(data.owner.avatar)
                        } else {
                            holder.mBinding.ivRoundAvatar.gone()
                            holder.mBinding.ivAvatar.visible()
                            holder.mBinding.ivAvatar.load(data.owner.avatar)
                        }

                        holder.mBinding.ivBgPicture.run {
                            val imageHeight = calculateImageHeight(data.width, data.height)
                            layoutParams.width = fragment.maxImageWidth
                            layoutParams.height = imageHeight
                            this.load(item.data.content.data.cover.feed, 4f)
                        }
                        holder.mBinding.tvCollectionCount.text =
                            data.consumption?.collectionCount.toString()
                        val drawable = ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_favorite_border_black_20dp
                        )
                        holder.mBinding.tvCollectionCount.setDrawable(drawable, 17f, 17f, 2)
                        holder.mBinding.tvDescription.text = data.description
                        holder.mBinding.tvNickName.text = data.owner?.nickname

                        when (item.data.content.type) {
                            STR_VIDEO_TYPE -> {
                                holder.mBinding.ivPlay.visible()
                                holder.itemView.setOnClickListener {
//                                    val items = snapshot().filter { it!!.type == STR_COMMUNITY_COLUMNS_CARD && it.data.dataType == STR_FOLLOW_CARD_DATA_TYPE }
//                                    UgcDetailActivity.start(fragment.activity, items.map { it!! }, item)
                                    val items =
                                        items.filter { it.type == STR_COMMUNITY_COLUMNS_CARD && it.data.dataType == STR_FOLLOW_CARD_DATA_TYPE }
                                    UgcDetailActivity.start(fragment.activity,items,item)
                                }
                            }

                            STR_UGC_PICTURE_TYPE -> {
                                if (!item.data.content.data.urls.isNullOrEmpty() && item.data.content.data.urls.size > 1) holder.mBinding.ivLayers.visible()
                                holder.itemView.setOnClickListener {
                                    val items =
                                        items.filter { it.type == STR_COMMUNITY_COLUMNS_CARD && it.data.dataType == STR_FOLLOW_CARD_DATA_TYPE }
                                    UgcDetailActivity.start(fragment.activity,items,item)
                                }
                            }
                        }
                        ""
                    }
                }

                override fun onCreate(context: Context, parent: ViewGroup, viewType: Int): ItemVH {
                    val viewBinding = RvItemCommunityColumnsCardFollowBinding.inflate(
                        LayoutInflater.from(context),
                        parent,
                        false
                    )
                    return ItemVH(viewBinding)
                }

            }).onItemViewType { position, list -> // 根据数据，返回对应的 ItemViewType
            val item = list[position]
            return@onItemViewType when (item.type) {
                STR_HORIZONTAL_SCROLLCARD_TYPE -> {
                    when (item.data.dataType) {
                        STR_ITEM_COLLECTION_DATA_TYPE -> HORIZONTAL_SCROLLCARD_ITEM_COLLECTION_TYPE
                        STR_HORIZONTAL_SCROLLCARD_DATA_TYPE -> HORIZONTAL_SCROLLCARD_TYPE
                        else -> -1
                    }
                }

                STR_COMMUNITY_COLUMNS_CARD -> {
                    if (item.data.dataType == STR_FOLLOW_CARD_DATA_TYPE) FOLLOW_CARD_TYPE
                    else -1
                }

                else -> -1
            }
        }
    }

    /**
     * 根据屏幕比例计算图片高
     *
     * @param originalWidth   服务器图片原始尺寸：宽
     * @param originalHeight  服务器图片原始尺寸：高
     * @return 根据比例缩放后的图片高
     */
    private fun calculateImageHeight(originalWidth: Int, originalHeight: Int): Int {
        //服务器数据异常处理
        if (originalWidth == 0 || originalHeight == 0) {
            logW(TAG, getString(R.string.image_size_error))
            return fragment.maxImageWidth
        }
        return fragment.maxImageWidth * originalHeight / originalWidth
    }


    class SquareCardOfCommunityContentAdapter(
        val fragment: CommendFragment,
        val dataList: MutableList<CommendInfo.ItemListBeanX.DataBeanX.ItemListBean>?
    ) :
        RecyclerView.Adapter<SquareCardOfCommunityContentAdapter.ViewHolder>() {

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val ivBgPicture: ImageView = view.findViewById(R.id.ivBgPicture)
            val tvTitle: TextView = view.findViewById(R.id.tvTitle)
            val tvSubTitle: TextView = view.findViewById(R.id.tvSubTitle)
        }

        override fun getItemCount() = dataList?.size!!

        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): SquareCardOfCommunityContentAdapter.ViewHolder {
            return ViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.item_community_horizontal_scroll_card_itemcollection_item_type,
                    parent,
                    false
                )
            )
        }

        override fun onBindViewHolder(
            holder: SquareCardOfCommunityContentAdapter.ViewHolder,
            position: Int
        ) {
            val item = dataList?.get(position)
            item?.run {
                holder.ivBgPicture.layoutParams.width = fragment.maxImageWidth
                holder.ivBgPicture.load("https://img1.baidu.com/it/u=281680629,2649210616&fm=253&fmt=auto&app=138&f=JPEG?w=747&h=500")
                holder.tvTitle.text = data.title
                holder.tvSubTitle.text = data.subTitle
                holder.itemView.setOnClickListener { toast(R.string.currently_not_supported) }
            }
        }
    }


    class SquareCardOfCommunityContentItemDecoration(val fragment: CommendFragment) :
        RecyclerView.ItemDecoration() {

        override fun getItemOffsets(
            outRect: Rect,
            view: View,
            parent: RecyclerView,
            state: RecyclerView.State
        ) {
            val position = parent.getChildAdapterPosition(view) // item position
            val count = parent.adapter?.itemCount?.minus(1) //item count

            when (position) {
                0 -> {
                    /*outRect.left = fragment.bothSideSpace*/
                    outRect.right = fragment.middleSpace
                }

                count -> {
                    outRect.left = fragment.middleSpace
                    /*outRect.right = fragment.bothSideSpace*/
                }

                else -> {
                    outRect.left = fragment.middleSpace
                    outRect.right = fragment.middleSpace
                }
            }
        }
    }

//    class BannerAdapter : BaseBannerAdapter<CommendInfo.ItemListBeanX.DataBeanX.ItemListBean>() {
//
//        class ViewHolder(val view: View) : BaseViewHolder<CommendInfo.ItemListBeanX.DataBeanX.ItemListBean>(view) {
//
//            override fun bindData(item: CommendInfo.ItemListBeanX.DataBeanX.ItemListBean, position: Int, pageSize: Int) {
//                val ivPicture = findView<ImageView>(R.id.ivPicture)
//                val tvLabel = findView<TextView>(R.id.tvLabel)
//                if (item.data.label?.text.isNullOrEmpty()) tvLabel.invisible() else tvLabel.visible()
//                tvLabel.text = item.data.label?.text ?: ""
//                ivPicture.load(item.data.image, 4f)
//            }
//        }
//
//        override fun bindData(
//            holder: BaseViewHolder<CommendInfo.ItemListBeanX.DataBeanX.ItemListBean>?,
//            data: CommendInfo.ItemListBeanX.DataBeanX.ItemListBean?,
//            position: Int,
//            pageSize: Int
//        ) {
//            TODO("Not yet implemented")
//        }
//
//        override fun getLayoutId(viewType: Int): Int {
//
//        }
//    }


    private fun getDefaultBannerData(): List<Int> {
        R.dimen.lagerTextSize
        return listOf(
            R.drawable.banner1,
            R.drawable.banner2,
            R.drawable.banner3,
            R.drawable.banner4
        )
    }

    /**
     * 社区整个垂直列表的间隙
     */
    class ItemDecoration(val fragment: CommendFragment) : RecyclerView.ItemDecoration() {

        override fun getItemOffsets(
            outRect: Rect,
            view: View,
            parent: RecyclerView,
            state: RecyclerView.State
        ) {
            val spanIndex = (view.layoutParams as StaggeredGridLayoutManager.LayoutParams).spanIndex

            outRect.top = fragment.bothSideSpace

            when (spanIndex) {
                0 -> {
                    outRect.left = fragment.bothSideSpace
                    outRect.right = fragment.middleSpace
                }

                else -> {
                    outRect.left = fragment.middleSpace
                    outRect.right = fragment.bothSideSpace
                }
            }
        }
    }

    companion object {
        const val TAG = "CommendAdapter"

        const val STR_HORIZONTAL_SCROLLCARD_TYPE = "horizontalScrollCard"
        const val STR_COMMUNITY_COLUMNS_CARD = "communityColumnsCard"

        const val STR_HORIZONTAL_SCROLLCARD_DATA_TYPE = "HorizontalScrollCard"
        const val STR_ITEM_COLLECTION_DATA_TYPE = "ItemCollection"
        const val STR_FOLLOW_CARD_DATA_TYPE = "FollowCard"

        const val STR_VIDEO_TYPE = "video"
        const val STR_UGC_PICTURE_TYPE = "ugcPicture"
        const val DAILY_LIBRARY_TYPE = "DAILY"

        const val HORIZONTAL_SCROLLCARD_ITEM_COLLECTION_TYPE =
            1   //type:horizontalScrollCard -> dataType:ItemCollection
        const val HORIZONTAL_SCROLLCARD_TYPE =
            2                   //type:horizontalScrollCard -> dataType:HorizontalScrollCard
        const val FOLLOW_CARD_TYPE =
            3                             //type:communityColumnsCard -> dataType:FollowCard

//        fun eee(){
//            DiffUtil.ItemCallback
//        }
    }
}