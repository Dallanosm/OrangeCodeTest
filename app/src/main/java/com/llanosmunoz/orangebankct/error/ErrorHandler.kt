package com.llanosmunoz.orangebankct.error

/**
 * ErrorHandler.
 */
interface ErrorHandler {
    fun convert(e: Exception): String
}