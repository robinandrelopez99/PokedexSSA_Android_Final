package com.example.testapplication.pokemonUIFinal

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
fun PokemonDetailsScreenFinal(pokemon: PokemonModel){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)) {
        Text(text = pokemon.name, fontSize = 30.sp)
        Spacer(modifier = Modifier.height(15.dp))
        GlideImage(model = pokemon.url, contentDescription = null)
        Spacer(modifier = Modifier.height(15.dp))
        Text("Attack: over 9000!", fontSize = 15.sp)
        Spacer(modifier = Modifier.height(5.dp))
        Text("Defense: 97", fontSize = 15.sp)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PokemonDetailsScreenFinalPreview(){
    PokemonDetailsScreenFinal(PokemonModel("Bulbasaur", "https://img.pokemondb.net/artwork/bulbasaur.jpg"))
}

