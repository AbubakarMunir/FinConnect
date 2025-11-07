package com.example.finconnect.ui.launch

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import com.example.finconnect.R
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
            ActionButton(
                text = "Login",
                color = Color.Green,
                onClick = { /* TODO: Navigate to Login */ }
            )
            Spacer(modifier = Modifier.height(8.dp))
            ActionButton(
                text = "Sign Up",
                color = Color.Blue,
                onClick = { /* TODO: Navigate to Sign Up */ }
            )
        }
    }
}

@Composable
private fun ActionButton(
    text: String,
    color: Color,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(containerColor = color)
    ) {
        Text(text = text, color = Color.White)
    }
}
