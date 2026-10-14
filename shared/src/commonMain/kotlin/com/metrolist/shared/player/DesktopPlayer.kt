package com.metrolist.shared.player

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DesktopPlayer(
    private val engine: PlayerEngine,
) {
    private val _isPlaying = MutableStateFlow(false)
    val isPlaying: StateFlow<Boolean> = _isPlaying

    fun play(url: String) {
        engine.play(url)
        _isPlaying.value = true
    }

    fun pause() {
        engine.pause()
        _isPlaying.value = false
    }

    fun resume() {
        engine.resume()
        _isPlaying.value = true
    }

    fun stop() {
        engine.stop()
        _isPlaying.value = false
    }

    fun release() {
        engine.release()
        _isPlaying.value = false
    }
}
