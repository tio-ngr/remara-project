package com.capstone.remara.ui.theme.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.capstone.remara.Navigation.Screen
import com.capstone.remara.data.DataProvider
import com.capstone.remara.data.Recipe

@Composable
fun Detail(navHostController: NavHostController, id: String) {
    val listItem = DataProvider.recipeLists
    val mapItem: Map<Int, Recipe> = listItem.associateBy { it.id }

    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier.fillMaxWidth(),
                backgroundColor = Color.White,
                contentPadding = PaddingValues(horizontal = 16.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape)
                        .clickable {
                            navHostController.navigate(Screen.Profile.route)
                        }
                ) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = null,
                        modifier = Modifier.padding(12.dp)
                    )
                }
            }
        },
        backgroundColor = Color.White // Set the background color to white
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = paddingValues
        ) {
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    Button(
                        onClick = { navHostController.navigate(Screen.Home.route) },
                        modifier = Modifier.align(Alignment.TopStart)
                    ) {
                        Text("Home")
                    }
                }
            }
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                ) {
                    Image(
                        painter = painterResource(id = mapItem[id.toInt()]!!.resepImageId),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
                    )
                }
            }
            item {
                Text(
                    text = mapItem[id.toInt()]!!.title,
                    style = TextStyle(fontSize = 25.sp),
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )
            }
            item {
                Text(
                    text = mapItem[id.toInt()]!!.kategori,
                    style = TextStyle(fontSize = 22.sp),
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )
            }
            item {
                Text(
                    text = mapItem[id.toInt()]!!.bahan,
                    style = TextStyle(fontSize = 18.sp),
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )
            }
            item {
                Button(
                    onClick = { navHostController.navigate(Screen.Next.navigateWithId(id = id)) },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        "Langkah Selanjutnya",
                        Modifier.padding(vertical = 10.dp)
                    )
                }
            }
            item {
                Text(
                    "Rekomendasi masakan serupa",
                    style = TextStyle(fontSize = 25.sp),
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                )
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    val recommendedRecipes = mapItem.values
                        .filter { it.id.toString() != id }
                        .take(3)
                    recommendedRecipes.forEach { recipe ->
                        RecipeCard(recipe = recipe, onClick = {
                            navHostController.navigate(Screen.Detail.navigateWithId(recipe.id.toString()))
                        })
                    }
                }
            }
        }
    }
}

@Composable
fun RecipeCard(recipe: Recipe?, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),
        shape = RoundedCornerShape(8.dp),
        backgroundColor = Color.White // Set the background color to white
    ) {
        if (recipe != null) {
            Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = recipe.title,
                    style = TextStyle(fontSize = 16.sp),
                    modifier = Modifier.width(IntrinsicSize.Max)
                )
            }
        } else {
            // Display a default content when the recipe is null
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Recipe Unavailable",
                    style = TextStyle(fontSize = 16.sp),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}
