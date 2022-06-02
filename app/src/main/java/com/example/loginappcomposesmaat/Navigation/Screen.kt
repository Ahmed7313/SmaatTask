package com.example.loginappcomposesmaat.Navigation

sealed class Screen(val route : String){
    object RegisterView : Screen(route = "register_screen")
    object LoginView : Screen(route = "login_screen")
}
