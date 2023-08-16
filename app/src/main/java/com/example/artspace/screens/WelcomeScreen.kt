package com.example.artspace.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.artspace.NavigationScreen
import com.example.artspace.ui.theme.ArtSpaceTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WelcomeScreenUI(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Art Space")
                },
                navigationIcon = {
                    Image(
                        imageVector = Icons.Default.Home,
                        contentDescription = "",
                        modifier = Modifier.padding(10.dp)
                    )
                },
                actions = {
                    Image(
                        imageVector = Icons.Outlined.AccountCircle,
                        contentDescription = "",
                        modifier = Modifier.padding(10.dp)
                    )
                }
            )
        }
    ) { padding ->
        Column(modifier = Modifier.padding(padding)) {}
        Scaffold(
            floatingActionButton = {
                Button(onClick = { navController.navigate(NavigationScreen.Screen1.route) }) {
                    Text(text = "Next")
                }
            }
        ) {
            Column(modifier = Modifier.padding(it)) {}
        }

    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Welcome to Art Space",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.padding(5.dp))

        Text(
            text = "Amazing Art Works",
            style = MaterialTheme.typography.titleMedium
        )
    }

}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    ArtSpaceTheme {
        WelcomeScreenUI(rememberNavController())
    }
}