package com.llanosmunoz.domain.constants

/**
 * Constants
 */
class Constants {
    companion object {
        val EMPTY_STRING: String = ""

        val DEFAULT_LONG: Long = 0

        val DEFAULT_INT: Int = 0

        fun preferencesName(buildType: BuildType): String = when (buildType) {
            BuildType.DEBUG -> "orange_bank_ct_debug"
            BuildType.RELEASE -> "orange_bank_ct"
        }

        fun notificationChannelId(buildType: BuildType): String = when (buildType) {
            BuildType.DEBUG -> "orange_bank_ct_debug"
            BuildType.RELEASE -> "orange_bank_ct"
        }

        const val DATE_API_FORMAT: String = "yyyy-MM-dd'T'HH:mm:ss.zzz'Z'"
    }
}

fun buildType(type: String): BuildType = when (type) {
    "debug" -> BuildType.DEBUG
    else -> BuildType.RELEASE
}

enum class BuildType {
    DEBUG, RELEASE
}