package com.metrolist.shared

import com.metrolist.innertube.InnerTube
import com.metrolist.shared.di.sharedModule
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import kotlin.test.Test
import kotlin.test.assertSame

class DiTest {
    @Test
    fun sharedModuleResolvesInnerTubeAsSingleton() {
        val koin = startKoin { modules(sharedModule) }.koin
        try {
            assertSame(koin.get<InnerTube>(), koin.get<InnerTube>())
        } finally {
            stopKoin()
        }
    }
}
