package com.example.eventura.ui.navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.eventura.ui.navigation.Home
import com.example.eventura.ui.navigation.MainGraph

fun NavGraphBuilder.mainGraph(navController: NavHostController) {
    navigation<MainGraph>(startDestination = Home) {
        composable<Home> {
//            HomeScreen(
//                onLogout = {
//                    navController.navigate(AuthGraph) {
//                        popUpTo(MainGraph) { inclusive = true }
//                    }
//                }
//            )
        }
    }
}