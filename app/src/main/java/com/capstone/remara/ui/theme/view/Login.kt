package com.capstone.remara.ui.theme.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.capstone.remara.Navigation.Screen

@Composable
fun Login(
    navHostController: NavHostController
) {
    Column(
        Modifier
            .padding(50.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp, alignment = Alignment.Bottom),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painterResource(
            id = com.capstone.remara.R.drawable.logo),
            contentDescription = null,
            modifier = Modifier
            .size(300.dp)
        )
        Button(onClick = {navHostController.navigate(Screen.Profile.route)}, modifier = Modifier.fillMaxWidth()) {
            Text("Lets Play!", Modifier.padding(vertical = 8.dp))
        }
        Button(
            onClick = { navHostController.navigate(Screen.Home.route) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Let's Explore!", Modifier.padding(vertical = 10.dp))
        }
        Divider(
            color = Color.White.copy(alpha = 0.3f),
            thickness = 2.dp,
            modifier = Modifier.padding(top = 50.dp)
        )
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("BELAJAR MASAK ANTI RIBET")
        }
    }
}

@Composable
fun TextInput() {
    var value by remember { mutableStateOf("") }
    TextField(value = value, onValueChange = { value = it })
}
