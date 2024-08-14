package com.example.testapplication.model

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.File
import java.lang.reflect.Type


data class PokemonModel(val name: String, val url: String) {companion object}

fun main() {
    val filePath = "/Users/a290018610/AndroidStudioProjects/TestApplication/app/src/main/res/pokemonData.json"
    val file = File(filePath)

    val jsonString = file.readText()

    val collectionType: Type = object : TypeToken<Collection<PokemonModel>>(){}.type
    val enums: Collection<PokemonModel> = Gson().fromJson(jsonString, collectionType)
    println(enums)
}

class PokemonAPI{
    fun getPokemon(): Collection<PokemonModel> {
        val list: Collection<PokemonModel> = ArrayList(
            listOf(
                PokemonModel(name="Bulbasaur", url="https://img.pokemondb.net/artwork/bulbasaur.jpg"),
                PokemonModel(name="Ivysaur", url="https://img.pokemondb.net/artwork/ivysaur.jpg"),
                PokemonModel(name="Venusaur", url="http://img.pokemondb.net/artwork/venusaur.jpg"),
                PokemonModel(name="Charmander", url="http://img.pokemondb.net/artwork/charmander.jpg"),
                PokemonModel(name="Charmeleon", url="http://img.pokemondb.net/artwork/charmeleon.jpg"),
                PokemonModel(name="Charizard", url="http://img.pokemondb.net/artwork/charizard.jpg"),
                PokemonModel(name="Squirtle", url="http://img.pokemondb.net/artwork/squirtle.jpg"),
                PokemonModel(name="Wartortle", url="http://img.pokemondb.net/artwork/wartortle.jpg"),
                PokemonModel(name="Blastoise", url="http://img.pokemondb.net/artwork/blastoise.jpg"),
                PokemonModel(name="Caterpie", url="http://img.pokemondb.net/artwork/caterpie.jpg"),
                PokemonModel(name="Metapod", url="http://img.pokemondb.net/artwork/metapod.jpg"),
                PokemonModel(name="Butterfree", url="http://img.pokemondb.net/artwork/butterfree.jpg"),
                PokemonModel(name="Weedle", url="http://img.pokemondb.net/artwork/weedle.jpg"),
                PokemonModel(name="Kakuna", url="http://img.pokemondb.net/artwork/kakuna.jpg"),
                PokemonModel(name="Beedrill", url="http://img.pokemondb.net/artwork/beedrill.jpg"),
                PokemonModel(name="Pidgey", url="http://img.pokemondb.net/artwork/pidgey.jpg"),
                PokemonModel(name="Pidgeotto", url="http://img.pokemondb.net/artwork/pidgeotto.jpg"),
                PokemonModel(name="Pidgeot", url="http://img.pokemondb.net/artwork/pidgeot.jpg"),
                PokemonModel(name="Rattata", url="http://img.pokemondb.net/artwork/rattata.jpg"),
                PokemonModel(name="Clefable", url="http://img.pokemondb.net/artwork/clefable.jpg"),
                PokemonModel(name="Vulpix", url="http://img.pokemondb.net/artwork/vulpix.jpg"),
                PokemonModel(name="Ninetales", url="http://img.pokemondb.net/artwork/ninetales.jpg"),
                PokemonModel(name="Jigglypuff", url="http://img.pokemondb.net/artwork/jigglypuff.jpg"),
                PokemonModel(name="Wigglytuff", url="http://img.pokemondb.net/artwork/wigglytuff.jpg"),
                PokemonModel(name="Zubat", url="http://img.pokemondb.net/artwork/zubat.jpg"),
                PokemonModel(name="Golbat", url="http://img.pokemondb.net/artwork/golbat.jpg"),
                PokemonModel(name="Oddish", url="http://img.pokemondb.net/artwork/oddish.jpg"),
                PokemonModel(name="Gloom", url="http://img.pokemondb.net/artwork/gloom.jpg"),
                PokemonModel(name="Vileplume", url="http://img.pokemondb.net/artwork/vileplume.jpg"),
                PokemonModel(name="Moltres", url="http://img.pokemondb.net/artwork/moltres.jpg"),
                PokemonModel(name="Dratini", url="http://img.pokemondb.net/artwork/dratini.jpg"),
                PokemonModel(name="Dragonair", url="http://img.pokemondb.net/artwork/dragonair.jpg"),
                PokemonModel(name="Dragonite", url="http://img.pokemondb.net/artwork/dragonite.jpg"),
                PokemonModel(name="Mewtwo", url="http://img.pokemondb.net/artwork/mewtwo.jpg"),
                PokemonModel(name="Mew", url="http://img.pokemondb.net/artwork/mew.jpg")
            )
        )
        return list
    }
}
