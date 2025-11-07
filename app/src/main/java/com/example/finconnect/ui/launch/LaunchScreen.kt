package com.example.finconnect.ui.launch

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.finconnect.R
import com.example.finconnect.ui.common.AppButton
import com.example.finconnect.ui.theme.FinConnectTheme

@Composable
fun InitLaunchScreen() {
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
                onClick = { /*  */ },
                containerColor = Color.Green
            )
            Spacer(modifier = Modifier.height(8.dp))
            AppButton(
                text = "Sign Up",
                onClick = { /*  */ },
                containerColor = Color.Blue
            )
        }
    }
}

