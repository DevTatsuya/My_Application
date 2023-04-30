package com.example.replacement

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun GameScreen(navController: NavController){
    var clicks: MutableState<Int> = remember { mutableStateOf(1) }
   var upgrade1: Int = 0
    var upgrade2: Int = 0
    var score : MutableState<Int> = remember { mutableStateOf(0)}
    Column() {
        Row() {
            Text("Candies: ${score.value}", fontSize = 55.sp)
        }
        Row() {
            Column(modifier = Modifier.padding(8.dp)) {
                Button(
                    onClick = { if(score.value >= 10){
                        score.value = score.value - 10
                        clicks.value= clicks.value+1}}
                ) {
                    Text(text = "Cost:10 Candies\n+1 Candies/Click")
                }
            }

            Column(modifier = Modifier.padding(8.dp)) {
                Button(
                    onClick = { if(score.value >= 100){
                        score.value = score.value - 100
                        clicks.value = clicks.value + 10}}
                ) {
                    Text(text = "Cost:100 Candies\n+10 Candies/Click")
                }
            }
        }
        Row() {
            Image(painter = painterResource(id = R.drawable.gamecandy), contentDescription = null,
                modifier = Modifier
                    .width(1000.dp)
                    .height(1000.dp)
                    .clickable {

                        score.value = score.value + clicks.value
                    }
            )
        }

    }
    Row(modifier = Modifier.offset(115.dp,560.dp)) {
        Button(
            onClick = {
                if (score.value >= 1) {
                    score.value = score.value - 1
                    clicks.value = clicks.value + 10000
                }
            }
        ) {
            Text(text = "Cost:1 Candies\n+10000 Candies/Click")
        }
    }

}
