package com.example.gigr.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gigr.ui.launch.InitLaunchScreen
import com.example.gigr.ui.login.InitLoginScreen
import com.example.gigr.ui.signup.InitSignUpScreen
import com.example.gigr.ui.welcome.WelcomeScreen

object AppRoutes {
    const val LAUNCH = "launch"
    const val LOGIN = "login"
    const val SIGNUP = "signup"
    const val WELCOME = "welcome"
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppRoutes.LAUNCH) {
        composable(AppRoutes.LAUNCH) {
            InitLaunchScreen(navController = navController)
        }
        composable(AppRoutes.LOGIN) {
            InitLoginScreen(navController = navController)
        }

        composable(AppRoutes.SIGNUP) {
            InitSignUpScreen(navController = navController)
        }

        composable(AppRoutes.WELCOME) {
            WelcomeScreen()
        }
    }
}