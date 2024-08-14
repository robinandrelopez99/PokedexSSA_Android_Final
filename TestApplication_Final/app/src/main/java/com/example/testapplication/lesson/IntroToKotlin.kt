package com.example.testapplication.lesson

class IntroToKotlin {

    /***
    Basic Types
     Int, Booleans, Characters, Strings, Arrays
     */

    var hello: String = "Hello"
    var number: Int = 5
    var truth: Boolean = true
    var arr: ArrayList<Int> = arrayListOf(1,2,3,4)


    // Functions && Interpolation
    fun catchPokemon(pokemon: String): String{
        return "You have captured $pokemon"
    }


    // For Loop
    fun showLoops(): Int{
        for (i in 0..10){
            return i
        }
        return 0
    }
}