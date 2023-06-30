package com.iagocarvalho.hogwartsworld.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage


@Composable
fun TodosOsDetalhesScreen(
    actor: String = "Daniel",
    ancestry: String = "nao sei",
    dateOfBirth: String = " 30/20/1455",
    eyeColour: String = "Castalhos",
    gender: String = "Masculino",
    hairColour: String = "preto",
    house: String = "corvinal",
    id: String = "asd",
    image: String = "",
    name: String = "harry",
    patronus: String = "corvo",
    species: String = "humano",
    yearOfBirth: Int = 1,
    navController: NavController
) {
    Card() {
        Column() {
            AsyncImage(
                model = image, contentDescription = "",
                modifier = Modifier
                    .size(400.dp)
                    .background(Color.Gray),
            )
            Text(text = actor)
            Text(text = name)
            Text(text = ancestry)
            Text(text = dateOfBirth)
            Text(text = yearOfBirth.toString())
            Text(text = eyeColour)
            Text(text = hairColour)
            Text(text = gender)
            Text(text = house)
            Text(text = patronus)
            Text(text = species)
            IconButton(onClick = { navController.navigateUp() }) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Voltar")
            }
        }
    }
}