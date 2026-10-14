package com.metrolist.innertube.utils

import io.ktor.client.engine.HttpClientEngineFactory

expect val httpEngineFactory: HttpClientEngineFactory<*>
