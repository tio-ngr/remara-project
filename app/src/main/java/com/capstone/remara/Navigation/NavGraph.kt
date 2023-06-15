package com.capstone.remara.Navigation

import Home
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.capstone.remara.ui.theme.view.*


@Composable
fun NavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        route = Screen.ROOT.route,
        startDestination = Screen.Login.route
    ) {
        composable(
            route = Screen.Login.route
        ){
            Login(navHostController)
        }
        composable(
            route = Screen.Home.route
        ) {
            Home(navHostController)

        }
        composable(
            route = Screen.Profile.route
        ) {
            Profile(navHostController)

        }
        composable(
            arguments = listOf(
                navArgument(ARG_A){
                    type = NavType.StringType
                }
            ) ,
            route = Screen.Gelar.route
        ) {
            val getA=it.arguments?.getString(ARG_A)
            Gelar(navHostController, getA!!)
        }

    composable(
            arguments = listOf(
                navArgument(ARG_A){
                    type = NavType.StringType
                }
            ) ,
            route = Screen.Detail.route
        ) {
            val getA=it.arguments?.getString(ARG_A)
            Detail(navHostController, getA!!)
        }

        composable(
            arguments = listOf(
                navArgument(ARG_A){
                    type = NavType.StringType
                }
            ) ,
            route = Screen.Next.route
        ) {
            val getA=it.arguments?.getString(ARG_A)
            Next(navHostController, getA!!)
        }
        composable(
            arguments = listOf(
                navArgument(ARG_A){
                    type = NavType.StringType
                }
            ) ,
            route = Screen.TidakLulus.route
        ) {
            val getA=it.arguments?.getString(ARG_A)
            TidakLulus(navHostController, getA!!)
        }
    }
}

