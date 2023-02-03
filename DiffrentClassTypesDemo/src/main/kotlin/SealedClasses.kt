fun main(args: Array<String>){
    val somePlant = getPlant()

    when (somePlant){
        is Fruit -> println("Sweet fruit!")
        is Vegetable -> println("Tasty vegetable!")
    }
}

fun getPlant(): Plant = Apple()

abstract class Plant

sealed class Fruit: Plant()

sealed class Vegetable: Plant()

class Apple(): Fruit()

class Potato: Vegetable()
