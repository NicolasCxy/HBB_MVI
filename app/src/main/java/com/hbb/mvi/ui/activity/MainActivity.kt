package com.hbb.mvi.ui.activity

import android.content.Context
import android.content.Intent
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.hbb.mvi.common.event.RefreshEvent
import com.hbb.mvi.common.extension.setOnClickListener
import com.hbb.mvi.databinding.ActivityMainBinding
import com.hbb.mvi.ui.common.BaseActivity
import com.hbb.mvi.ui.fragemnt.CommunityFragment
import com.hbb.mvi.ui.fragemnt.HomePageFragment
import com.hbb.mvi.ui.fragemnt.MineFragment
import com.hbb.mvi.ui.fragemnt.NotificationFragment
import com.hbb.mvi.utils.toast
import org.greenrobot.eventbus.EventBus
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.hbb.mvi.R
import com.hbb.mvi.logic.model.EmptyViewModel


class MainActivity : BaseActivity<ActivityMainBinding, EmptyViewModel>() {

    private val TAG = "MainActivity"

    override val mViewModel: EmptyViewModel by viewModel()

    private var backPressTime = 0L

    override fun createVB() = ActivityMainBinding.inflate(layoutInflater)

    private var homePageFragment: HomePageFragment? = null

    private var communityFragment: CommunityFragment? = null

    private var notificationFragment: NotificationFragment? = null

    private var mineFragment: MineFragment? = null

    private val fragmentManager: FragmentManager by lazy { supportFragmentManager }



    override fun ActivityMainBinding.initView() {
        setOnClickListener(
            binding.navigationBar.btnHomePage, binding.navigationBar.btnCommunity, binding.navigationBar.btnNotification, binding.navigationBar.ivRelease,
            binding.navigationBar.btnMine
        ) {
            when (this) {
                binding.navigationBar.btnHomePage -> {
                    setTabSelection(0)
                    notificationUiRefresh(0)
                }
                binding.navigationBar.btnCommunity -> {
                    setTabSelection(1)
                    notificationUiRefresh(1)
                }
                binding.navigationBar.btnNotification -> {
                    setTabSelection(2)
                    notificationUiRefresh(2)
                }
                binding.navigationBar.ivRelease -> {
//                    LoginActivity.start(this@MainActivity)
                    toast("开发中，请稍等...")
                }
                binding.navigationBar.btnMine -> {
                    setTabSelection(3)
                    notificationUiRefresh(3)
                }
            }
        }
    }

    override fun initData() {
        setTabSelection(0)
    }

    /**
     * Ui变化以及fragment切换调用
     */
    private fun setTabSelection(index: Int) {
        clearAllSelected()
        fragmentManager.beginTransaction().apply {
            hideFragments(this)
            when (index) {
                0 -> {
                    binding.navigationBar.ivHomePage.isSelected = true
                    binding.navigationBar.tvHomePage.isSelected = true

                    if (homePageFragment == null) {
                        homePageFragment = HomePageFragment.newInstance()
                        add(R.id.mainActivityFragContainer, homePageFragment!!)
                    } else {
                        show(homePageFragment!!)
                    }
                }
                1 -> {
                    binding.navigationBar.ivCommunity.isSelected = true
                    binding.navigationBar.tvCommunity.isSelected = true
                    if (communityFragment == null) {
                        communityFragment = CommunityFragment.newInstance()
                        add(R.id.mainActivityFragContainer, communityFragment!!)
                    } else {
                        show(communityFragment!!)
                    }
                }
                2 -> {
                    binding.navigationBar.ivNotification.isSelected = true
                    binding.navigationBar.tvNotification.isSelected = true
                    if (notificationFragment == null) {
                        notificationFragment = NotificationFragment.newInstance()
                        add(R.id.mainActivityFragContainer, notificationFragment!!)
                    } else {
                        show(notificationFragment!!)
                    }
                }
                3 -> {
                    binding.navigationBar.ivMine.isSelected = true
                    binding.navigationBar.tvMine.isSelected = true
                    if (mineFragment == null) {
                        mineFragment = MineFragment.newInstance()
                        add(R.id.mainActivityFragContainer, mineFragment!!)
                    } else {
                        show(mineFragment!!)
                    }
                }
                else -> {
                    binding.navigationBar.ivHomePage.isSelected = true
                    binding.navigationBar.tvHomePage.isSelected = true
                    if (homePageFragment == null) {
                        homePageFragment = HomePageFragment.newInstance()
                        add(R.id.mainActivityFragContainer, homePageFragment!!)
                    } else {
                        show(homePageFragment!!)
                    }
                }
            }
        }.commitAllowingStateLoss()
    }

    private fun hideFragments(transaction: FragmentTransaction) {
        transaction.run {
            if (homePageFragment != null) hide(homePageFragment!!)
            if (communityFragment != null) hide(communityFragment!!)
            if (notificationFragment != null) hide(notificationFragment!!)
            if (mineFragment != null) hide(mineFragment!!)
        }
    }

    private fun clearAllSelected() {
        binding.navigationBar.ivHomePage.isSelected = false
        binding.navigationBar.tvHomePage.isSelected = false
        binding.navigationBar.ivCommunity.isSelected = false
        binding.navigationBar.tvCommunity.isSelected = false
        binding.navigationBar.ivNotification.isSelected = false
        binding.navigationBar.tvNotification.isSelected = false
        binding.navigationBar.ivMine.isSelected = false
        binding.navigationBar.tvMine.isSelected = false
    }


    private fun notificationUiRefresh(selectionIndex: Int) {
        when (selectionIndex) {
            0 -> {
                if (binding.navigationBar.ivHomePage.isSelected) EventBus.getDefault().post(RefreshEvent(HomePageFragment::class.java))
            }
            1 -> {
                if (binding.navigationBar.ivCommunity.isSelected) EventBus.getDefault().post(RefreshEvent(CommunityFragment::class.java))
            }
            2 -> {
                if (binding.navigationBar.ivNotification.isSelected) EventBus.getDefault().post(RefreshEvent(NotificationFragment::class.java))
            }
            3 -> {
                if (binding.navigationBar.ivMine.isSelected) EventBus.getDefault().post(RefreshEvent(MineFragment::class.java))
            }
        }
    }


    companion object {
        //统一启动入口
        fun start(context: Context) {
            context.startActivity(Intent(context, MainActivity::class.java))
        }
    }

    override fun onBackPressed() {
        if(supportFragmentManager.backStackEntryCount> 0){
            supportFragmentManager.popBackStack()
        }else{
            val now = System.currentTimeMillis()
            if (now - backPressTime > 2000) {
                toast(String.format(getString(R.string.press_again_to_exit), getString(R.string.app_name) ))
                backPressTime = now
            } else {
                super.onBackPressed()
            }
        }
    }


}