package com.alilopez.kt_demohilt.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alilopez.demo.features.jsonplaceholder.presentation.screens.PostsScreen
import com.alilopez.kt_demohilt.features.rickandmorty.presentation.screens.RickAndMortyScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "posts_route"
    ) {
        composable("posts_route") {
            PostsScreen(
                onNavigateToRick = { navController.navigate("rick_route") }
            )
        }
        composable("rick_route") {
            RickAndMortyScreen(
                onBack = { navController.popBackStack() }
            )
        }
    }
}
