package com.metrolist.shared

import com.metrolist.innertube.InnerTube
import kotlin.test.Test
import kotlin.test.assertNotNull

class WiringTest {
    @Test
    fun innertubeClientBuildsOnJvm() {
        assertNotNull(InnerTube())
    }
}
