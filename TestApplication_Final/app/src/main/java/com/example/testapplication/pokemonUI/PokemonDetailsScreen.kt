package com.example.testapplication.pokemonUI

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.testapplication.model.PokemonModel

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun PokemonDetailsScreen(pokemon: PokemonModel){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)) {
        //TODO add text here so we know the name of our pokemon
        Spacer(modifier = Modifier.height(15.dp))
        //TODO add a GlideImage here so we have the image of the pokemon
        Spacer(modifier = Modifier.height(15.dp))
        //TODO add text here so we have an attack description
        Spacer(modifier = Modifier.height(5.dp))
        //TODO add text so that we have a defense description
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PokemonDetailsScreenPreview(){
    PokemonDetailsScreen(PokemonModel("Bulbasaur", "https://img.pokemondb.net/artwork/bulbasaur.jpg"))
}

