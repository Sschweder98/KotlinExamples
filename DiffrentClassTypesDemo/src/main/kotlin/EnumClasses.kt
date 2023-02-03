fun main(args: Array<String>){
    //Color example
    decide(Color.RED)
    decide(Color.GREEN)
    decide(Color.BLUE)
    decide(Color.YELLOW)
    decide(Color.PURPLE)

    //CarBrand example
    println("Number ${CarBrand.AUDI.ordinal + 1} is ${CarBrand.AUDI.name.lowercase().capitalize()}, ist grounded in ${CarBrand.AUDI.yearGrounded}")
}

fun decide(color: Color){
    when(color){
        Color.RED -> println("Red like a ferrari")
        Color.GREEN -> println("Green like the forest")
        Color.BLUE -> println("Blue like the ocean")
        Color.YELLOW -> println("Yellow like a banana")
        Color.PURPLE -> println("Purple like ...")
    }
}

//Color example
enum class Color{
    RED,
    GREEN,
    BLUE,
    YELLOW,
    PURPLE
}

//CarBrand example
enum class CarBrand(val yearGrounded: Int){
    MERCEDES(1916),
    BWM(1925),
    AUDI(1932),
    VOLKSWAGEN(1920)
}