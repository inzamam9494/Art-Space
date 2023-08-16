package com.example.artspace.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.artspace.NavigationScreen
import com.example.artspace.ui.theme.ArtSpaceTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThankyouScreenUI(navController: NavHostController) {
    Scaffold(
        floatingActionButton = {
            Button(onClick = { navController.navigate(NavigationScreen.Screen3.route) }) {
                Text(text = "Previous")
            }
        }
    ) {
        Column(modifier = Modifier.padding(it)
            .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Thank You !",
                style = MaterialTheme.typography.displayLarge)
        }
    }
}

@Preview
@Composable
fun ThankYouScreenPreview() {
    ArtSpaceTheme {
        ThankyouScreenUI(rememberNavController())
    }
}