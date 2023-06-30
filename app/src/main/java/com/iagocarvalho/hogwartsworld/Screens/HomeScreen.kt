package com.iagocarvalho.hogwartsworld.Screens

import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.iagocarvalho.hogwartsworld.HogwartsViewModel

@Composable
fun HogwartsScreen(viewModel: HogwartsViewModel) {

    val personagensDehogwartsItems by viewModel.hogwarts.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.getHogwartsView()
    }

    Column() {
        if (personagensDehogwartsItems.isEmpty()) {
            Text(text = "Loading...")
        } else {
            LazyColumn {
                items(personagensDehogwartsItems) { personagensDehogwartsItem ->
                    ListBruxos(
                        Image = personagensDehogwartsItem.image,
                        Bruxo = personagensDehogwartsItem.name,
                        Casa = personagensDehogwartsItem.house
                    )
                    //AsyncImage(model = personagensDehogwartsItem.image, contentDescription = "")
                    //Text(text = personagensDehogwartsItem.actor)
                }

            }

        }
    }
}
