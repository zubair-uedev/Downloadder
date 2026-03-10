package com.example.downloadder.navigation

import TextRepeatScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.downloadder.presentation.splashscreen.SplashScreen
import com.example.downloadder.routes.Routes

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.SplashRoute) {
        composable<Routes.SplashRoute> {
            SplashScreen(goMainScrren = {
                navController.navigate(Routes.HomeScreenRoute)
            })
        }
        composable<Routes.HomeScreenRoute> {
            TextRepeatScreen()
        }

    }
}