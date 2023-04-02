package com.example.replacement

sealed class Screen(val route: String) {
    object Home: Screen(route = "main_menu")
    object Game: Screen(route = "game_screen")
}