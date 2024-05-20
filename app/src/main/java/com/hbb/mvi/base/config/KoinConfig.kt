package com.hbb.mvi.base.config

import com.hbb.mvi.model.mv.EmptyViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object KoinConfig {
    val viewModelModule = module {
        // 参数注解使用get()获取，无需手动传入
        viewModel { EmptyViewModel() }
    }
}