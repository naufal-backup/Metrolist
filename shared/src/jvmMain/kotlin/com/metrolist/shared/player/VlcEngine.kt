package com.metrolist.shared.player

import uk.co.caprica.vlcj.player.component.AudioPlayerComponent

class VlcEngine : PlayerEngine {
    private val component = AudioPlayerComponent()
    private val player = component.mediaPlayer()

    override fun play(url: String) {
        player.media().play(url)
    }

    override fun pause() {
        player.controls().pause()
    }

    override fun resume() {
        player.controls().play()
    }

    override fun stop() {
        player.controls().stop()
    }

    override fun release() {
        player.release()
        component.release()
    }
}
