package com.capstone.remara

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.capstone.remara.Navigation.NavGraph
import com.capstone.remara.ui.theme.ReMaRaTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReMaRaTheme {
                NavGraph(navHostController = rememberNavController())
            }
        }
    }
}

