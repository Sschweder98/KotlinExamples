fun main (args: Array<String>){
    Book.printMe()

    //Example
    String.getClassType()
}

class Book{
    companion object{

    }
}

fun Book.Companion.printMe(){
    println("Book has been printed")
}

//Example
fun String.Companion.getClassType(){
    println("This is a String class")
}