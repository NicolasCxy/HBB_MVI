package com.hbb.mvi.ui.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hbb.mvi.R
import com.hbb.mvi.databinding.ActivityDetailsWebBinding
import com.hbb.mvi.databinding.ActivityMainBinding
import com.hbb.mvi.logic.model.EmptyViewModel
import com.hbb.mvi.ui.common.BaseActivity
import com.hbb.mvi.ui.widget.LollipopFixedWebView
import com.just.agentweb.AgentWeb

class DetailsWebActivity : BaseActivity<ActivityDetailsWebBinding, EmptyViewModel>() {
    override val mViewModel: EmptyViewModel = EmptyViewModel()

    lateinit var mAgentWeb: AgentWeb
    override fun createVB() = ActivityDetailsWebBinding.inflate(layoutInflater)

    override fun initData() {
       mAgentWeb = AgentWeb.with(this)
            .setAgentWebParent(binding.webContent, LinearLayout.LayoutParams(-1, -1))
            .useDefaultIndicator()
            .setWebView(LollipopFixedWebView(this))
            .createAgentWeb()
            .ready()
            .go(url)
    }

    override fun ActivityDetailsWebBinding.initView() {

    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        return if (mAgentWeb.handleKeyEvent(keyCode, event)) {
            true
        } else super.onKeyDown(keyCode, event)
    }


    override fun onPause() {
        mAgentWeb.webLifeCycle.onPause()
        super.onPause()

    }

    override fun onResume() {
        mAgentWeb.webLifeCycle.onResume()
        super.onResume()
    }

    override fun onDestroy() {
        mAgentWeb.webLifeCycle.onDestroy()
        super.onDestroy()
    }

    companion object {
        var url: String = ""

        //统一启动入口
        fun start(context: Context, webUrl: String) {
            url = webUrl
            context.startActivity(Intent(context, DetailsWebActivity::class.java))
        }
    }
}