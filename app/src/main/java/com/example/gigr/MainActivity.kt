package com.example.gigr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.gigr.ui.navigation.AppNavigation
import com.example.gigr.ui.theme.FinConnectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FinConnectTheme {
                AppNavigation()
            }
        }
    }
}
