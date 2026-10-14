package com.metrolist.shared.di

import com.metrolist.innertube.InnerTube
import com.metrolist.shared.player.DesktopPlayer
import com.metrolist.shared.player.createPlayerEngine
import org.koin.dsl.module

val sharedModule =
    module {
        single { InnerTube() }
        single { DesktopPlayer(createPlayerEngine()) }
    }
