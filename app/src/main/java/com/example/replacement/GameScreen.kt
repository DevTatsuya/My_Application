package com.example.replacement

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
var Score: Int=0
@Composable
fun GameScreen(navController: NavController){
    Text("Score: $Score", fontSize = 55.sp)
   Image(painter = painterResource(id = R.drawable.gamecandy), contentDescription = null,
   modifier = Modifier
       .width(1000.dp)
       .height(1000.dp)
       .clickable {
           Score++
       }
   )
}