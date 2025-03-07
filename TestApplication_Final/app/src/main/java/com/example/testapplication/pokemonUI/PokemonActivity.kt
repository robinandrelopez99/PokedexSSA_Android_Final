package com.example.testapplication.pokemonUI

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.testapplication.model.PokemonAPI
import com.example.testapplication.model.PokemonModel
import com.example.testapplication.ui.theme.TestApplicationTheme

class PokemonActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //KotlinUI()
                    val navController: NavHostController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = PokedexScreen.Start.name,
                        modifier = Modifier.padding()
                    ){
                        composable(route = PokedexScreen.Start.name){
                            //TODO  what should we call here to so that we can see the list of pokemon?
                        }
                        composable(route = PokedexScreen.Details.name){
                            //TODO what should we call here so we can see the details for each pokemon?
                        }
                    }
                }
            }
        }
    }
}

enum class PokedexScreen {
    Start,
    Details
}

var pokemoN: PokemonModel = PokemonModel("","")

@Preview(showBackground = true)
@Composable
fun StartPagePreview() {
    TestApplicationTheme {
        PokemonRowList(pokemon = PokemonAPI().getPokemon(), navController = rememberNavController())
    }
}