package com.example.gigr.ui.launch

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.gigr.R
import com.example.gigr.ui.AppButton
import com.example.gigr.ui.navigation.AppRoutes

@Composable
fun InitLaunchScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
         Image(
             painter = painterResource(id = R.drawable.launchbg),
             contentDescription = null,
             modifier = Modifier.fillMaxSize(),
             contentScale = ContentScale.Crop
         )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(40.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AppButton(
                text = "Login",
                onClick = { navController.navigate(AppRoutes.LOGIN) },
                containerColor = Color.Green
            )
            Spacer(modifier = Modifier.height(8.dp))
            AppButton(
                text = "Sign Up",
                onClick = { navController.navigate(AppRoutes.SIGNUP)},
                containerColor = Color.Blue
            )
        }
    }
}

