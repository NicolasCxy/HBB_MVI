package com.hbb.mvi.common.config

import com.hbb.mvi.logic.model.EmptyViewModel
import com.hbb.mvi.logic.model.HomeViewModel
import com.hbb.mvi.logic.repository.HomeRepository
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object KoinConfig {
    private val emptyModule = module {
        // 参数注解使用get()获取，无需手动传入
        single { EmptyViewModel() }
    }

    private val homeModule = module{
        single { HomeRepository() }
        viewModel { HomeViewModel(get()) }
    }

    val moduleList = listOf(homeModule,emptyModule)
}