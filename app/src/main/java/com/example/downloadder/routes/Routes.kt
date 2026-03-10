package com.example.downloadder.routes

import kotlinx.serialization.Serializable

@Serializable
sealed class Routes {
    @Serializable
    data object SplashRoute : Routes()

    @Serializable
    data object HomeScreenRoute : Routes()
}