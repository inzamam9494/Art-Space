package com.example.artspace

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.artspace.screens.OneScreenUI
import com.example.artspace.screens.ThankyouScreenUI
import com.example.artspace.screens.ThreeScreenUI
import com.example.artspace.screens.TwoScreenUI
import com.example.artspace.screens.WelcomeScreenUI

sealed class NavigationScreen (val route: String){
    object Welcome : NavigationScreen("Welcome")
    object Screen1 : NavigationScreen("Screen1")
    object Screen2 : NavigationScreen("Screen2")
    object Screen3 : NavigationScreen("Screen3")
    object ThankYou : NavigationScreen("ThankYou")
}

@Composable
fun NavigationBar(
    navController: NavHostController
) {
    NavHost(navController = navController,
        startDestination = NavigationScreen.Welcome.route)
    {
        composable(NavigationScreen.Welcome.route){WelcomeScreenUI(navController)}
        composable(NavigationScreen.Screen1.route){OneScreenUI(navController)}
        composable(NavigationScreen.Screen2.route){TwoScreenUI(navController)}
        composable(NavigationScreen.Screen3.route){ThreeScreenUI(navController)}
        composable(NavigationScreen.ThankYou.route){ThankyouScreenUI(navController)}
    }
}