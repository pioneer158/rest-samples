package com.google.developers.wallet.rest

object Common {
    // Regular Colors
    private const val ANSI_RESET: String = "\u001B[0m"

    private const val ANSI_RED: String = "\u001B[31m"

    private const val ANSI_GREEN: String = "\u001B[32m"

    private const val ANSI_YELLOW: String = "\u001B[33m"

    private const val ANSI_BLUE: String = "\u001B[34m"

    @JvmStatic
    fun LOGI(className: String, msg: String) {
        println("$ANSI_GREEN$className : $msg$ANSI_RESET");
    }

    @JvmStatic
    fun LOGE(className: String, msg: String) {
        println("$ANSI_RED$className : $msg$ANSI_RESET");
    }

    @JvmStatic
    fun LOGD(className: String, message: String) {
        println("$ANSI_BLUE$className : $message$ANSI_RESET")
    }

    @JvmStatic
    fun LOGW(className: String, message: String) {
        println("$ANSI_YELLOW$className : $message$ANSI_RESET")
    }


}