package com.example.gigr.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gigr.ui.launch.InitLaunchScreen
import com.example.gigr.ui.login.InitLoginScreen
import com.example.gigr.ui.signup.InitSignUpScreen

object AppRoutes {
    const val LAUNCH = "launch"
    const val LOGIN = "login"
    const val SIGNUP = "signup"
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppRoutes.LAUNCH) {
        composable(AppRoutes.LAUNCH) {
            InitLaunchScreen(navController = navController)
        }
        composable(AppRoutes.LOGIN) {
            InitLoginScreen()
        }

        composable(AppRoutes.SIGNUP) {
            InitSignUpScreen(navController = navController)
        }
    }
}