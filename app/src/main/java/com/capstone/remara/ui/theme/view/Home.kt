import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.capstone.remara.Navigation.Screen
import com.capstone.remara.RecipeListItem
import com.capstone.remara.data.DataProvider
import com.capstone.remara.ui.theme.view.SearchView

@Composable
fun Home(
    navHostController: NavHostController
) {
    val stateSearch = remember { mutableStateOf(TextFieldValue()) }
    val selectedIngredients = remember { mutableStateListOf<String>() }
    Scaffold(
        topBar = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Box(
                    modifier = Modifier
                        .size(70.dp)
                        .clip(CircleShape)
                        .padding(horizontal = 16.dp)
                ) { Icon(imageVector = Icons.Default.Person, contentDescription = null, modifier = Modifier.clickable {
                    navHostController.navigate(Screen.Profile.route)
                }
                )
                }
            }
        },
        backgroundColor = Color.White // Set the background color to white
    ) { paddingValues ->
        val recipes = remember { DataProvider.recipeLists }

        Column(modifier = Modifier.padding(paddingValues)) {
            SearchView(stateSearch)

            // Group of buttons
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                content = {
                    Button(
                        onClick = { toggleIngredient("Ayam", selectedIngredients) },
                        modifier = Modifier
                            .padding(8.dp)
                            .background(
                                color = if (selectedIngredients.contains("Ayam")) Color.White else Color.Transparent
                            )
                    ) {
                        Text("Ayam", color = if (selectedIngredients.contains("Ayam")) Color.White else Color.Black)
                    }
                    Button(
                        onClick = { toggleIngredient("Telur", selectedIngredients) },
                        modifier = Modifier
                            .padding(8.dp)
                            .background(
                                color = if (selectedIngredients.contains("Telur")) Color.White else Color.Transparent
                            )
                    ) {
                        Text("Telur", color = if (selectedIngredients.contains("Telur")) Color.White else Color.Black)
                    }
                    Button(
                        onClick = { toggleIngredient("Tempe", selectedIngredients) },
                        modifier = Modifier
                            .padding(8.dp)
                            .background(
                                color = if (selectedIngredients.contains("Tempe")) Color.White else Color.Transparent
                            )
                    ) {
                        Text("Tempe", color = if (selectedIngredients.contains("Tempe")) Color.White else Color.Black)
                    }
                    // Add more buttons as needed
                }
            )

            // Filtered list based on selected ingredients
            val filteredRecipes = if (selectedIngredients.isNotEmpty()) {
                recipes.filter { recipe ->
                    recipe.bahan.containsAny(selectedIngredients)
                }
            } else {
                recipes
            }

            LazyColumn(
                modifier = Modifier.weight(1f),
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
            ) {
                items(
                    items = filteredRecipes,
                    itemContent = {
                        RecipeListItem(Recipe = it) {
                            navHostController.navigate(Screen.Detail.navigateWithId(it.id.toString()))
                        }
                    }
                )
            }
        }
    }
}

fun toggleIngredient(ingredient: String, selectedIngredients: MutableList<String>) {
    if (selectedIngredients.contains(ingredient)) {
        selectedIngredients.remove(ingredient)
    } else {
        selectedIngredients.add(ingredient)
    }
}

// Extension function to check if a string contains any of the selected ingredients
fun String.containsAny(ingredients: List<String>): Boolean {
    val lowerCaseIngredients = ingredients.map { it.lowercase() }
    val lowerCaseText = this.lowercase()
    return lowerCaseIngredients.any { lowerCaseText.contains(it) }
}
