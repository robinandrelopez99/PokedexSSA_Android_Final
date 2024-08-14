package com.example.testapplication.pokemonUI

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
import com.example.testapplication.pokemonUIFinal.PokedexScreen

@Composable
fun PokemonRowList(pokemon: Collection<PokemonModel>, navController: NavController){
        LazyColumn(modifier = Modifier.background(Color.White)
        ) {
            for (p in pokemon) {
                item {
                    PokemonRow(pokemon = p) {
                        navController.navigate(route = PokedexScreen.Details.name)
                        pokemoN = p
                    }
                }
            }
    }
}


@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun PokemonRow(pokemon: PokemonModel, onRowClicked: () -> Unit){
    Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .background(color = Color.White)
            .clickable(onClick = onRowClicked)) {

        //TODO add a GlideImage so that we can show a picture of our pokemon

        //TODO add a Text field so that we can have the name of our pokemon
    }
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun PokemonRowPreview(){
    PokemonRow(pokemon = PokemonModel("Bulbasaur", "http://img.pokemondb.net/artwork/bulbasaur.jpg")
    ) { }
}