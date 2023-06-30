package com.iagocarvalho.hogwartsworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.iagocarvalho.hogwartsworld.navigation.SetupNavGraph
import com.iagocarvalho.hogwartsworld.ui.theme.HogwartsWorldTheme

class MainActivity : ComponentActivity() {
    private val viewModel: HogwartsViewModel by viewModels()
    lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HogwartsWorldTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    navController = rememberNavController()
                    SetupNavGraph(navHostController = navController)




                   // Column() {
                    //    HogwartsScreen(viewModel = viewModel)
                   // }
                }
            }
        }
    }
}

