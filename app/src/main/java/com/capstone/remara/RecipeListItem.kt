package com.capstone.remara

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.capstone.remara.data.Recipe

@Composable
fun RecipeListItem(recipe: Recipe, onClick: () -> Unit) {

    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth()
            .clickable {
                onClick()
            },
        elevation = 2.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(corner = CornerSize(16.dp))

    )

    {


        Row {
            WaifuImage(recipe = recipe)
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)

            ) {
                Text(text = recipe.title, style = MaterialTheme.typography.h6)
                Text(text = "Click To See Detail Recipe", style = MaterialTheme.typography.caption)
            }
        }
    }
}

@Composable
private fun WaifuImage(recipe: Recipe) {
    Image(
        painter = painterResource(id = recipe.resepImageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(85.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}
