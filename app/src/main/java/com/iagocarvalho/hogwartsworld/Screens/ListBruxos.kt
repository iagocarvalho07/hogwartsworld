package com.iagocarvalho.hogwartsworld.Screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage


@Composable
fun ListBruxos(
    Image: String = "",
    Bruxo: String = "Bruxo",
    Casa: String = "Casa do bruxo",
    navController: NavController
) {
    Card(
        modifier = Modifier.padding(2.dp),
        shape = CircleShape,
        elevation = CardDefaults.cardElevation(10.dp),
        border = BorderStroke(1.dp, color = Color.DarkGray)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            Arrangement.SpaceBetween

        ) {
            AsyncImage(
                model = Image, contentDescription = "",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(Color.Gray),
                contentScale = ContentScale.Crop
            )
            Column() {
                Text(
                    text = Bruxo,
                )
                Text(text = Casa)

            }
            Button(
                onClick = { navController.navigate(route = Screens.Detalhes.route) },
                modifier = Modifier
            ) {
                Text(text = "Detalhes")

            }

        }

    }
}
