package com.metrolist.shared.di

import com.metrolist.innertube.InnerTube
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val sharedModule =
    module {
        singleOf(::InnerTube)
    }
