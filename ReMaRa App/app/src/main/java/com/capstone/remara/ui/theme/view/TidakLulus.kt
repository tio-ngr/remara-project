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
fun TidakLulus(
    navHostController: NavHostController,
    id : String

) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(16.dp, alignment = Alignment.Bottom),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(painterResource(id = R.drawable.tidaklulus), contentDescription = null)
        Text(text = "Maaf Kamu Masih Belum Lulus di Tantangan Ini", style = MaterialTheme.typography.h6)
        Text(text = "Fina si Koki Pantang Menyerah!", style = MaterialTheme.typography.h6)
        Button(onClick = {navHostController.navigate(Screen.Home.route)}, modifier = Modifier.fillMaxWidth()) {
            Text(
                "Latih Lagi Kemampuan Masak Mu!",
                Modifier.padding(vertical = 10.dp)
            )
        }
    }
}
