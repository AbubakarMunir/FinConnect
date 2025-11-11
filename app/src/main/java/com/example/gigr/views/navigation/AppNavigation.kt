package com.example.gigr.views.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gigr.views.launch.InitLaunchScreen
import com.example.gigr.views.login.InitLoginScreen

object AppRoutes {
    const val LAUNCH = "launch"
    const val LOGIN = "login"
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
    }
}
