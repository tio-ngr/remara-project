package com.capstone.remara.ui.theme.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.capstone.remara.Navigation.Screen
import com.capstone.remara.data.DataProvider
import com.capstone.remara.data.Recipe

@Composable
fun Next(
    navHostController: NavHostController,
    id: String
) {
    val listItem = DataProvider.recipeLists
    val mapItem: Map<Int, Recipe> = listItem.associateBy { it.id }
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(16.dp, alignment = Alignment.Bottom),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = mapItem[id.toInt()]!!.resepImageId),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
        )
        Text(
            text = mapItem[id.toInt()]!!.description.toString(),
            style = TextStyle(
                fontSize = 18.sp
            )
        )
        Button(onClick = {navHostController.navigate(Screen.Gelar.navigateWithId(id = id))}, modifier = Modifier.fillMaxWidth()) {
            Text("Konfirmasi Masakan",
                Modifier.padding(vertical = 10.dp)
            )
        }
    }
}