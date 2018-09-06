package com.llanosmunoz.data.extensions

import android.util.Log
import java.text.SimpleDateFormat
import java.util.*

/**
 * AndroidExtensions
 */

/**
 * Any
 * */
fun Any.info(text: String) {
    Log.i(this::class.java.simpleName, text)
}

fun Any.error(text: String) {
    Log.e(this::class.java.simpleName, text)
}

fun Any.error(text: String, exception: Exception) {
    Log.e(this::class.java.simpleName, text, exception)
}

fun Any.warn(text: String) {
    Log.w(this::class.java.simpleName, text)
}

fun Any.warn(text: String, exception: Exception) {
    Log.w(this::class.java.simpleName, text, exception)
}

fun Any.debug(text: String) {
    Log.d(this::class.java.simpleName, text)
}

fun Any.debug(text: String, exception: Exception) {
    Log.d(this::class.java.simpleName, text, exception)
}


/**
 * Date
 * */
fun String.toDate(format: String): Date? {
    return try {
        SimpleDateFormat(format).parse(this)
    } catch (e: Exception) {
        null
    }
}