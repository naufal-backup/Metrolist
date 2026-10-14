package com.metrolist.innertube.utils

import io.ktor.client.HttpClientConfig
import io.ktor.client.engine.HttpClientEngineFactory
import java.net.Proxy

expect val httpEngineFactory: HttpClientEngineFactory<*>

expect fun HttpClientConfig<*>.installEngineConfig(proxy: Proxy?, proxyAuth: String?)
