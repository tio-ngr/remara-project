package com.capstone.remara.Navigation


const val ARG_A = "KEY_A"

sealed class Screen(
    val route : String
) {
    object Login : Screen("login")
    object ROOT : Screen(route = "root_screen")
    object Home : Screen(route = "home_screen")
    object Detail : Screen(route = "detail_screen/{$ARG_A}") {
        fun navigateWithId(Id: String): String {
            return "detail_screen/$Id"
        }
    }
    object Profile : Screen(route = "profile")
    object Gelar : Screen("gelar_screen/{$ARG_A}") {
        fun navigateWithId(id: String): String {
            return "gelar_screen/$id"
        }
    }
    object TidakLulus : Screen("tidaklulus_screen/{$ARG_A}") {
        fun navigateWithId(id: String): String {
            return "tidaklulus_screen/$id"
        }
    }
    object Next : Screen("next_screen/{$ARG_A}") {
        fun navigateWithId(id: String): String {
            return "next_screen/$id"
        }
    }
}

