package com.iagocarvalho.hogwartsworld.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.iagocarvalho.hogwartsworld.HogwartsViewModel

@Composable
fun HogwartsScreen(viewModel: HogwartsViewModel, navController: NavController) {

    val personagensDehogwartsItems by viewModel.hogwarts.collectAsState(emptyList())

    LaunchedEffect(Unit) {
        viewModel.getHogwartsView()
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        if (personagensDehogwartsItems.isNullOrEmpty()) {
            CircularProgressIndicator()
        } else {
            LazyColumn {
                items(personagensDehogwartsItems?: emptyList(), key = { personagensDehogwartsItem -> personagensDehogwartsItem.id})
                { personagensDehogwartsItem ->
                    ListBruxos(
                        Image = personagensDehogwartsItem.image,
                        Bruxo = personagensDehogwartsItem.name,
                        Casa = personagensDehogwartsItem.house,
                        navController = navController
                    )
                    //AsyncImage(model = personagensDehogwartsItem.image, contentDescription = "")
                    //Text(text = personagensDehogwartsItem.actor)
                }
            }
        }
    }
}
