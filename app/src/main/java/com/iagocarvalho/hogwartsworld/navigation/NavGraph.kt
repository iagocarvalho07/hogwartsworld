package com.iagocarvalho.hogwartsworld.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.iagocarvalho.hogwartsworld.HogwartsViewModel
import com.iagocarvalho.hogwartsworld.Screens.HogwartsScreen
import com.iagocarvalho.hogwartsworld.Screens.Screens
import com.iagocarvalho.hogwartsworld.Screens.TodosOsDetalhesScreen

@Composable
fun SetupNavGraph(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = Screens.Home.route) {
        composable(
            route = Screens.Home.route
        ) {
            HogwartsScreen(viewModel = HogwartsViewModel(), navHostController)
        }
        composable(
            route = Screens.Detalhes.route) {
            TodosOsDetalhesScreen(navController = navHostController)
        }
    }
}