package com.hbb.mvi.ui.activity

import android.content.Intent
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.hbb.mvi.databinding.ActivityUgcDetailBinding
import com.hbb.mvi.logic.model.EmptyViewModel
import com.hbb.mvi.ui.common.BaseActivity
import com.hbb.mvi.R
import com.hbb.mvi.logic.adapter.UgcDetailAdapter
import com.hbb.mvi.logic.bean.CommendInfo
import com.hbb.mvi.logic.common.callbcak.AutoPlayPageChangeListener
import com.hbb.mvi.utils.IntentDataHolderUtil
import com.hbb.mvi.utils.toast
import com.shuyu.gsyvideoplayer.GSYVideoManager

class UgcDetailActivity : BaseActivity<ActivityUgcDetailBinding, EmptyViewModel>() {

    override val mViewModel: EmptyViewModel = EmptyViewModel()

    var dataList: List<CommendInfo.ItemListBeanX>? = null

    var itemPosition: Int = -1

    private var onPageChangeCallback: ViewPager2.OnPageChangeCallback? = null

    private lateinit var adapter: UgcDetailAdapter

    override fun createVB() = ActivityUgcDetailBinding.inflate(layoutInflater)
    override fun initData() {}

    override fun ActivityUgcDetailBinding.initView() {
        if (checkArguments()) {
            setStatusBarBackground(R.color.black)
            if (dataList == null) {
                itemPosition = getCurrentItemPosition()
                dataList = IntentDataHolderUtil.getData<List<CommendInfo.ItemListBeanX>>(EXTRA_RECOMMEND_ITEM_LIST_JSON)
            }
            if(dataList == null){
                toast(R.string.jump_page_unknown_error)
                finish()
            }else{
                adapter =  UgcDetailAdapter(this@UgcDetailActivity,dataList!!)
                viewPager.adapter = adapter
                viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
                viewPager.offscreenPageLimit = 1
                onPageChangeCallback = AutoPlayPageChangeListener(binding.viewPager, itemPosition, R.id.videoPlayer)
                viewPager.registerOnPageChangeCallback(onPageChangeCallback!!)
                viewPager.setCurrentItem(itemPosition,false)
            }

        }
    }

    override fun onResume() {
        super.onResume()
        GSYVideoManager.onResume()
    }

    override fun onPause() {
        super.onPause()
        GSYVideoManager.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        GSYVideoManager.releaseAllVideos()
    }

    fun checkArguments() = if (IntentDataHolderUtil.getData<List<CommendInfo.ItemListBeanX>>(
            EXTRA_RECOMMEND_ITEM_LIST_JSON
        ).isNullOrEmpty()
        || IntentDataHolderUtil.getData<CommendInfo.ItemListBeanX>(EXTRA_RECOMMEND_ITEM_JSON) == null
    ) {
        toast(R.string.jump_page_unknown_error)
        false
    } else {
        true
    }

    private fun getCurrentItemPosition(): Int {
        val list = IntentDataHolderUtil.getData<List<CommendInfo.ItemListBeanX>>(
            EXTRA_RECOMMEND_ITEM_LIST_JSON
        )
        val currentItem =
            IntentDataHolderUtil.getData<CommendInfo.ItemListBeanX>(EXTRA_RECOMMEND_ITEM_JSON)

        list?.forEachIndexed { index, item ->
            if (currentItem == item) {
                itemPosition = index
                return@forEachIndexed
            }
        }
        return itemPosition
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(0, R.anim.anl_push_bottom_out)
    }


    companion object {

        const val EXTRA_RECOMMEND_ITEM_LIST_JSON = "recommend_item_list"
        const val EXTRA_RECOMMEND_ITEM_JSON = "recommend_item"
        fun start(
            context: FragmentActivity?,
            dataList: List<CommendInfo.ItemListBeanX>,
            currentItem: CommendInfo.ItemListBeanX
        ) {

            IntentDataHolderUtil.setData(EXTRA_RECOMMEND_ITEM_LIST_JSON, dataList)
            IntentDataHolderUtil.setData(EXTRA_RECOMMEND_ITEM_JSON, currentItem)

            val starter = Intent(context, UgcDetailActivity::class.java)
            context?.startActivity(starter)
            context?.overridePendingTransition(R.anim.anl_push_bottom_in, R.anim.anl_push_up_out)
        }
    }


}