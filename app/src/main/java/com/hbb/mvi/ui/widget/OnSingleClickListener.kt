package com.hbb.mvi.ui.widget

import android.view.View
import androidx.annotation.IntDef

/**
 * A click listener that prevents rapid, repeated clicks on a View.
 * This helps avoid accidental double-taps and provides better UX.
 *
 * @param delayTime The minimum time that must pass between clicks (in milliseconds)
 * @param listener The callback to be invoked on a valid click
 */
class OnSingleClickListener @JvmOverloads constructor(
    @param:IntDef private val delayTime: Int = DEFAULT_DELAY_TIME,
    private val listener: (View) -> Unit
) : View.OnClickListener {

    companion object {
        const val DEFAULT_DELAY_TIME = 500
    }

    @Volatile
    private var lastClickTime: Long = 0

    override fun onClick(view: View) {
        val currentTime = System.currentTimeMillis()
        if (currentTime - lastClickTime > delayTime) {
            lastClickTime = currentTime
            listener.invoke(view)
        }
    }
}