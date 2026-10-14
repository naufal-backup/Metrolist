package com.metrolist.innertube.utils

actual fun logD(message: String) = println("D: $message")

actual fun logW(message: String) = println("W: $message")

actual fun logE(throwable: Throwable, message: String) = println("E: $message: $throwable")
