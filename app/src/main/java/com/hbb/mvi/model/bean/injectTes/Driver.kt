package com.hbb.mvi.model.bean.injectTes

import android.content.Context
import dagger.hilt.android.qualifiers.ActivityContext
import javax.inject.Inject


class Driver @Inject constructor(@ActivityContext val context: Context) {
    val name:String = "cxy"
}