fun main(args: Array<String>){
    val animals = listOf("cat", "dog", "rabbit", "pigeon", "turtle")

    //"Let" with "it" as internal object name
    animals.map {it.length}
        .filter { it > 3 }
        .let {
            println(it)
            println("Size of the list is ${it.size}")
        }

    //"Let" with custom name for the internal object
    animals.map {it.length}
        .filter { it > 3 }
        .let {filteredList ->
            println(filteredList)
            println("Size of the list is ${filteredList.size}")
        }

    //Shorter version of "Let" that can only call one function
    animals.map {it.length}
        .filter { it > 3 }
        .let(::println)

    //"Let" example with nullable variable -> Only executed when variable isn't null
    var name: String? = "Dennis"
    name?.let {
        println("The name is $it")
    }

}