package com.example.artspace.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.artspace.NavigationScreen
import com.example.artspace.R
import com.example.artspace.ui.theme.ArtSpaceTheme

@Composable
fun ThreeScreenUI(navController: NavHostController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            Box(
                modifier = Modifier
                    .height(500.dp)
                    .width(400.dp)
                    .padding(10.dp)
                    .shadow(elevation = 7.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.three),
                    contentDescription = "one",
                    modifier = Modifier.size(300.dp)
                )
            }
        }

        Spacer(modifier = Modifier.padding(20.dp))

        Row(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .padding(20.dp)
        ) {
            Column {
                Text(
                    text = "Popular Pokemon Game",
                    style = MaterialTheme.typography.headlineMedium
                )
                Row {
                    Text(
                        text = "Sword and Shield Art",
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.padding(4.dp))
                    Text(text = "(2019)")
                }
            }

        }

        Spacer(modifier = Modifier.padding(20.dp))

        Row(modifier = Modifier.padding(12.dp)) {
            Button(onClick = { navController.navigate(NavigationScreen.Screen2.route) }) {
                Text(text = "Previous")
            }

            Spacer(modifier = Modifier.weight(0.1f))

            Button(onClick = { navController.navigate(NavigationScreen.ThankYou.route) }) {
                Text(text = "Next")
            }
        }
    }
}

@Preview
@Composable
fun ThreeScreenPreview() {
    ArtSpaceTheme {
        ThreeScreenUI(rememberNavController())
    }
}