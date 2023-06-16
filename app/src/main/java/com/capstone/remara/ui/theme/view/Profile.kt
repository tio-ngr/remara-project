package com.capstone.remara.ui.theme.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.capstone.remara.Navigation.Screen
import com.capstone.remara.R

@Composable
fun Profile (
    navHostController: NavHostController
) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(16.dp, alignment = Alignment.Bottom),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painterResource(id = R.drawable.fina), contentDescription = null)
        Text(text = "Fina si Koki Kecil", style = MaterialTheme.typography.h6)
        Text(text = "Level 1", style = MaterialTheme.typography.h6)
        Button(
            onClick = {
                navHostController.navigate("${Screen.Home.route}/telur")
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Lets Explore!", Modifier.padding(vertical = 10.dp))
        }
    }
}
