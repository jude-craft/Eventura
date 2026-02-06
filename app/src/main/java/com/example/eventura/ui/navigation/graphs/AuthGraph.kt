package com.example.eventura.ui.navigation.graphs

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.eventura.ui.navigation.AuthGraph
import com.example.eventura.ui.navigation.Login
import com.example.eventura.ui.navigation.Welcome
import com.example.eventura.ui.screens.LoginScreen
import com.example.eventura.ui.screens.WelcomeScreen

fun NavGraphBuilder.authGraph(navController: NavController){
    navigation<AuthGraph>(startDestination = Welcome) {
        composable<Welcome> {
            WelcomeScreen(
                // onLoginClick = { navController.navigate(Login) },
                // onSignUpClick = { navController.navigate(SignUp) }
            )
        }
        composable<Login> {
            LoginScreen(
//                onLoginSuccess = {
//                    navController.navigate(MainGraph) {
//                        popUpTo(AuthGraph) { inclusive = true }
//                    }
//                }
            )
        }

    }
}