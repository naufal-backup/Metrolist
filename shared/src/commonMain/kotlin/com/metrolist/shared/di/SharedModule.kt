package com.metrolist.shared.di

import com.metrolist.innertube.InnerTube
import org.koin.dsl.module

val sharedModule =
    module {
        single { InnerTube() }
    }
