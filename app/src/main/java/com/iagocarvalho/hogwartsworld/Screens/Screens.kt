package com.iagocarvalho.hogwartsworld.Screens

sealed class Screens(val route: String){
    object Home: Screens(route = "home_screen")
    object Detalhes: Screens(route = "detalhes_screen")
}
