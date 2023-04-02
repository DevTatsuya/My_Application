package com.example.replacement

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun setupNavGraph(
    navController: NavHostController
){
    NavHost(navController = navController, startDestination = Screen.Home.route){
        composable(route = Screen.Home.route){
            MainMenu(navController = navController)
        }
        composable(route = Screen.Game.route){
            GameScreen(navController = navController)
        }
    }
}
