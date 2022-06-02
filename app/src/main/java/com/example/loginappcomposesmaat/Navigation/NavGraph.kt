package com.example.loginappcomposesmaat.Navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.loginappcomposesmaat.views.loginFullView
import com.example.loginappcomposesmaat.views.registerView

@Composable
fun SetupNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screen.RegisterView.route)
    {
        composable(route = Screen.RegisterView.route){
            registerView(modifier = Modifier.fillMaxSize())
        }
        composable(route = Screen.LoginView.route){
            loginFullView(modifier = Modifier.fillMaxSize())
        }
    }
}