package com.llanosmunoz.domain.constants

/**
 * Constants
 */
class Constants {
    companion object {
        val EMPTY_STRING: String = ""

        val DEFAULT_LONG: Long = 0

        val DEFAULT_INT: Int = 0

        val DEFAULT_DOUBLE: Double = 0.0

        fun preferencesName(buildType: BuildType): String = when (buildType) {
            BuildType.DEBUG -> "orange_bank_ct_debug"
            BuildType.RELEASE -> "orange_bank_ct"
        }

        fun notificationChannelId(buildType: BuildType): String = when (buildType) {
            BuildType.DEBUG -> "orange_bank_ct_debug"
            BuildType.RELEASE -> "orange_bank_ct"
        }

        const val DATE_API_FORMAT: String = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
        const val DATE_VIEW_FORMAT: String = "dd-MM-yyyy HH:mm:ss"
    }
}

fun buildType(type: String): BuildType = when (type) {
    "debug" -> BuildType.DEBUG
    else -> BuildType.RELEASE
}

enum class BuildType {
    DEBUG, RELEASE
}