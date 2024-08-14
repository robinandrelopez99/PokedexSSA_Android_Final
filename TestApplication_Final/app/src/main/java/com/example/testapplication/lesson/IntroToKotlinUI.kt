package com.example.testapplication.lesson

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun KotlinUI(){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.background(Color.Yellow).fillMaxSize()) {

        Canvas(modifier = Modifier.size(100.dp), onDraw = {
            drawCircle(color = Color.Red)
        })

        Spacer(modifier = Modifier.height(15.dp))

        Text(text = "Pikachu", fontSize = 50.sp)
        Text(text = " I Choose You!", fontSize = 25.sp)

        Spacer(modifier = Modifier.height(15.dp))

        Canvas(modifier = Modifier.size(100.dp), onDraw = {
            drawCircle(color = Color.Red)
        })
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun KotlinUIPreview(){
    KotlinUI()
}