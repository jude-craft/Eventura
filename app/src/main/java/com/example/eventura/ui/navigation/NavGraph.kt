package com.example.eventura.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.eventura.ui.navigation.graphs.authGraph
import com.example.eventura.ui.navigation.graphs.mainGraph

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = AuthGraph
    ) {
        authGraph(navController)
        mainGraph(navController)
    }
}