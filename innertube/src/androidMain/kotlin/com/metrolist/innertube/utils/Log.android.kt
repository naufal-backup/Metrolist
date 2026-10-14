package com.metrolist.innertube.utils

import timber.log.Timber

actual fun logD(message: String) = Timber.d(message)

actual fun logW(message: String) = Timber.w(message)

actual fun logE(throwable: Throwable, message: String) = Timber.e(throwable, message)
