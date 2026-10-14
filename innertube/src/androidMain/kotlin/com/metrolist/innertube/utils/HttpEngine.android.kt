package com.metrolist.innertube.utils

import io.ktor.client.engine.HttpClientEngineFactory
import io.ktor.client.engine.okhttp.OkHttp

actual val httpEngineFactory: HttpClientEngineFactory<*> = OkHttp
