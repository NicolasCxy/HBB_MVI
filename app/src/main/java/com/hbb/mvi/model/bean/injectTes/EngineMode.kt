package com.hbb.mvi.model.bean.injectTes

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Qualifier


@Module
@InstallIn(ActivityComponent::class)
abstract class EngineMode {

    @BindGasEngine
    @Binds
    abstract fun bindGasEngine(gasEngine: GasEngine):Engine

    @BindElectricEngine
    @Binds
    abstract fun bindElectricEngine(electricEngine: ElectricEngine):Engine

}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BindGasEngine

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BindElectricEngine

