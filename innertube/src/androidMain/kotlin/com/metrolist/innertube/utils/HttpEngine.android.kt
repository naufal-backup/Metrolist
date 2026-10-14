package com.metrolist.innertube.utils

import io.ktor.client.HttpClientConfig
import io.ktor.client.engine.HttpClientEngineFactory
import io.ktor.client.engine.okhttp.OkHttp
import java.io.File
import java.net.Proxy
import java.util.concurrent.TimeUnit

actual val httpEngineFactory: HttpClientEngineFactory<*> = OkHttp

actual fun HttpClientConfig<*>.installEngineConfig(proxy: Proxy?, proxyAuth: String?) {
    engine {
        config {
            connectionPool(okhttp3.ConnectionPool(10, 5, TimeUnit.MINUTES))
            connectTimeout(30, TimeUnit.SECONDS)
            readTimeout(60, TimeUnit.SECONDS)
            writeTimeout(60, TimeUnit.SECONDS)
            protocols(listOf(okhttp3.Protocol.HTTP_2, okhttp3.Protocol.HTTP_1_1))
            retryOnConnectionFailure(true)
            cache(okhttp3.Cache(File(System.getProperty("java.io.tmpdir"), "http_cache"), 50L * 1024L * 1024L))
            proxy?.let(::proxy)
            proxyAuth?.let { auth ->
                proxyAuthenticator { _, response ->
                    response.request
                        .newBuilder()
                        .header("Proxy-Authorization", auth)
                        .build()
                }
            }
        }
    }
}
