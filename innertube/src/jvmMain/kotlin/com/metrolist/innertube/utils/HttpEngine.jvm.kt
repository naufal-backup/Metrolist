package com.metrolist.innertube.utils

import io.ktor.client.engine.HttpClientEngineFactory
import io.ktor.client.engine.cio.CIO

actual val httpEngineFactory: HttpClientEngineFactory<*> = CIO
