/**
 * Metrolist Project (C) 2026
 * Licensed under GPL-3.0 | See git history for contributors
 */

package com.metrolist.music.ui.screens

import androidx.compose.runtime.Immutable
import metrolist.ui.generated.resources.Res
import metrolist.ui.generated.resources.filter_library
import metrolist.ui.generated.resources.group_filled
import metrolist.ui.generated.resources.group_outlined
import metrolist.ui.generated.resources.home
import metrolist.ui.generated.resources.home_filled
import metrolist.ui.generated.resources.home_outlined
import metrolist.ui.generated.resources.library_music_filled
import metrolist.ui.generated.resources.library_music_outlined
import metrolist.ui.generated.resources.search
import metrolist.ui.generated.resources.together
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource

@Immutable
sealed class Screens(
    val title: StringResource,
    val iconInactive: DrawableResource,
    val iconActive: DrawableResource,
    val route: String,
) {
    object Home : Screens(
        title = Res.string.home,
        iconInactive = Res.drawable.home_outlined,
        iconActive = Res.drawable.home_filled,
        route = "home",
    )

    object Search : Screens(
        title = Res.string.search,
        iconInactive = Res.drawable.search,
        iconActive = Res.drawable.search,
        route = "search_input",
    )

    object ListenTogether : Screens(
        title = Res.string.together,
        iconInactive = Res.drawable.group_outlined,
        iconActive = Res.drawable.group_filled,
        route = "listen_together",
    )

    object Library : Screens(
        title = Res.string.filter_library,
        iconInactive = Res.drawable.library_music_outlined,
        iconActive = Res.drawable.library_music_filled,
        route = "library",
    )

    companion object {
        val MainScreens = listOf(Home, Search, ListenTogether, Library)
    }
}
