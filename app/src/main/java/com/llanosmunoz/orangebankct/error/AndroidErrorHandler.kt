package com.llanosmunoz.orangebankct.error

import android.content.Context
import com.llanosmunoz.orangebankct.R

/**
 * AndroidErrorHandler.
 */
class AndroidErrorHandler(val context: Context) : ErrorHandler {
    override fun convert(e: Exception): String =
            when (e) {
                else -> context.getString(R.string.default_error)
            }

}