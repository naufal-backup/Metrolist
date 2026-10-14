package com.metrolist.shared.player

interface PlayerEngine {
    fun play(url: String)

    fun pause()

    fun resume()

    fun stop()

    fun release()
}
