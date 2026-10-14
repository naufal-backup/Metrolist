/**
 * Metrolist Project (C) 2026
 * Licensed under GPL-3.0 | See git history for contributors
 */

package com.metrolist.music.di

import com.metrolist.music.viewmodels.BrowseViewModel
import com.metrolist.shared.di.sharedModule
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val androidAppModule =
    module {
        includes(sharedModule)
        viewModel { BrowseViewModel(get()) }
    }
