package com.alilopez.kt_demohilt.core.navigation

import kotlinx.serialization.Serializable

sealed class Screen {
    @Serializable
    data object Posts : Screen()

    @Serializable
    data object RickAndMorty : Screen()
}
