package com.metrolist.innertube.utils

import io.ktor.client.HttpClientConfig
import io.ktor.client.engine.HttpClientEngineFactory
import io.ktor.client.engine.cio.CIO
import java.net.Proxy

actual val httpEngineFactory: HttpClientEngineFactory<*> = CIO

// shortcut: no engine-level tuning on JVM yet, timeouts already covered by HttpTimeout above; revisit when adding proxy support
actual fun HttpClientConfig<*>.installEngineConfig(proxy: Proxy?, proxyAuth: String?) = Unit
