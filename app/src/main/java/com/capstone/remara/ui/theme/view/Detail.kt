package com.capstone.remara.ui.theme.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.capstone.remara.Navigation.Screen
import com.capstone.remara.data.DataProvider
import com.capstone.remara.data.Recipe
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request

@Composable
fun DetailViewModel(title: String) {
    val recipeDetailState = viewModel<RecipeDetailViewModel>()
    val recipeDetail = recipeDetailState.recipeDetail

    LaunchedEffect(title) {
        recipeDetailState.getRecipeDetail(title)
    }

    // Handle the state and UI based on the recipe detail
    // For example, you can use recipeDetail.title, recipeDetail.image, etc.
}

@Composable
fun Detail(
    navHostController: NavHostController,
    id: String
) {
    val listItem = DataProvider.recipeLists
    val mapItem: Map<Int, Recipe> = listItem.associateBy { it.id }

    DetailViewModel(mapItem[id.toInt()]!!.title)

    Column( modifier = Modifier
        .padding(16.dp)
        .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(16.dp, alignment = Alignment.Bottom),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .align(Alignment.Start)
                .padding(bottom = 16.dp)
        ) {
            Button(
                onClick = { navHostController.navigate(Screen.Home.route) },
                modifier = Modifier.wrapContentWidth()
            ) {
                Text("Home")
            }
        }
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
            text = mapItem[id.toInt()]!!.title,
            style = TextStyle(
                fontSize = 25.sp
            )
        )
        Text(
            text = mapItem[id.toInt()]!!.kategori,
            style = TextStyle(
                fontSize = 22.sp
            )
        )
        Text(
            text = mapItem[id.toInt()]!!.bahan,
            style = TextStyle(
                fontSize = 18.sp
            )
        )
        Button(onClick = {navHostController.navigate(Screen.Next.navigateWithId(id = id))}, modifier = Modifier.fillMaxWidth()) {
            Text("Langkah Selanjutnya",
                Modifier.padding(vertical = 10.dp)
            )
        }
        Text(
            text = "Rekomendasi untuk masakan serupa",
            style = TextStyle(
                fontSize = 25.sp
            )
        )
        // Display recommended similar recipes in Card views
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ) {
            CardViewForRecommendedRecipes(navHostController, mapItem[id.toInt()]!!.title)
        }
    }
}

@Composable
fun RecipeCard(recipe: Recipe, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(bottom = 8.dp),
        elevation = 4.dp,
        shape = RoundedCornerShape(8.dp),
        backgroundColor = Color.White
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = recipe.title,
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(
                text = recipe.kategori,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontStyle = FontStyle.Italic
                )
            )
        }
    }
}

@Composable
fun CardViewForRecommendedRecipes(navHostController: NavHostController, title: String) {
    val recommendedRecipesState = remember { mutableStateOf(emptyList<Recipe>()) }

    LaunchedEffect(title) {
        // Make a network call or perform any necessary operations to fetch recommended recipes using the title
        val recommendedRecipes = fetchRecommendedRecipes(title)
        recommendedRecipesState.value = recommendedRecipes
    }

    // Display the recommended recipes in Card views
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(recommendedRecipesState.value) { recipe ->
            RecipeCard(recipe = recipe) {
                // Handle click on recommended recipe card
                navHostController.navigate(Screen.Detail.navigateWithId(recipe.title))
            }
        }
    }
}