package com.hbb.mvi.ui.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.hbb.mvi.R
import com.hbb.mvi.databinding.ActivityLoginBinding
import com.hbb.mvi.databinding.ActivityMainBinding
import com.hbb.mvi.logic.model.EmptyViewModel
import com.hbb.mvi.ui.common.BaseActivity

class LoginActivity : BaseActivity<ActivityLoginBinding, EmptyViewModel>() {
    override val mViewModel: EmptyViewModel = EmptyViewModel()

    override fun createVB() = ActivityLoginBinding.inflate(layoutInflater)

    override fun initData() {
    }

    override fun ActivityLoginBinding.initView() {
    }

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, LoginActivity::class.java))
        }
    }
}