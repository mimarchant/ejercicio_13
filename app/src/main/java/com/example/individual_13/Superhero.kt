package com.example.individual_13

data class Superhero(val superhero:String, val publisher:String, val realName:String, var photo:String)

fun main() {
    val superheroes = mutableListOf<Superhero>()


    var input: String
    while (true) {
        println("Enter the superhero's name or '0' to finish:")
        input = readLine() ?: ""
        if (input == "0") break

        val superheroName = input

        println("Enter the publisher's name:")
        val publisherName = readLine() ?: ""

        println("Enter the real name of the superhero:")
        val realName = readLine() ?: ""

        println("Enter the name of the photo:")
        val photoName = readLine() ?: ""

        superheroes.add(Superhero(superheroName, publisherName, realName, photoName))
    }

    // Al final imprimimos los datos
    for (superhero in superheroes) {
        println("Superhero: ${superhero.superhero}")
        println("Publisher: ${superhero.publisher}")
        println("Real Name: ${superhero.realName}")
        println("Photo: ${superhero.photo}")
        println("----------------------------")
    }
}


