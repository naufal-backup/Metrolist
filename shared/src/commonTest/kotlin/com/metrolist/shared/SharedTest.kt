package com.metrolist.shared

import kotlin.test.Test
import kotlin.test.assertTrue

class SharedTest {
    @Test
    fun greetingMentionsMetrolist() {
        assertTrue(sharedGreeting().contains("Metrolist"))
    }
}
