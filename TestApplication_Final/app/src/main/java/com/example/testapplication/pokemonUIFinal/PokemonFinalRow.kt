package com.example.testapplication.pokemonUIFinal

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.testapplication.model.PokemonModel
import com.example.testapplication.pokemonUI.PokemonRow

@Composable
fun PokemonRowListFinal(pokemon: Collection<PokemonModel>, navController: NavController){
        LazyColumn(modifier = Modifier.background(Color.White)
        ) {
            for (p in pokemon) {
                item {
                    PokemonRowFinal(pokemon = p) {
                        navController.navigate(route = PokedexScreen.Details.name)
                        pokemonFinal = p
                    }
                }
            }
    }
}


@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun PokemonRowFinal(pokemon: PokemonModel, onRowClicked: () -> Unit){
    Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .background(color = Color.White)
            .clickable(onClick = onRowClicked)) {
        GlideImage(model = pokemon.url, contentDescription = "null",
            modifier = Modifier
               )
        Text(text = pokemon.name, fontSize = 30.sp)
    }
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun PokemonRowFinalPreview(){
    PokemonRow(pokemon = PokemonModel("Bulbasaur", "http://img.pokemondb.net/artwork/bulbasaur.jpg")
    ) { }
}