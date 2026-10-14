package com.metrolist.shared

import com.metrolist.shared.player.DesktopPlayer
import com.metrolist.shared.player.PlayerEngine
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

private class FakeEngine : PlayerEngine {
    val calls = mutableListOf<String>()

    override fun play(url: String) {
        calls += "play:$url"
    }

    override fun pause() {
        calls += "pause"
    }

    override fun resume() {
        calls += "resume"
    }

    override fun stop() {
        calls += "stop"
    }

    override fun release() {
        calls += "release"
    }
}

class PlayerTest {
    @Test
    fun playPauseResumeStopDriveEngineAndState() {
        val engine = FakeEngine()
        val player = DesktopPlayer(engine)

        assertFalse(player.isPlaying.value)
        player.play("https://example.test/song")
        assertTrue(player.isPlaying.value)
        player.pause()
        assertFalse(player.isPlaying.value)
        player.resume()
        assertTrue(player.isPlaying.value)
        player.stop()
        assertFalse(player.isPlaying.value)

        assertEquals(
            listOf("play:https://example.test/song", "pause", "resume", "stop"),
            engine.calls,
        )
    }
}
