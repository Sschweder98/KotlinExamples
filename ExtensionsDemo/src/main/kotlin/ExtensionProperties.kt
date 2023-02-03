fun main(args: Array<String>){
    val text = "Hello, this is Sebastian"
    println(text.length)
    println(text.betterLength)

    //Example
    val number1 = 1
    val number2 = 1.0f
    println(text.getCustomName())
    println(number1.getCustomName())
    println(number2.getCustomName())

    //Other Example
    val list = arrayListOf(1,2,3,4,5,6,7,8,9,0)
    println(list.howMany())
}

//Extends the class String with a property
//The property can only be val, so it's immutable
val String.betterLength: Int
    get(){
      return this.replace(" ","").length
    }

//Example
fun String.getCustomName() = "A string of characters"
fun Int.getCustomName() = "An integer number"
fun Float.getCustomName() = "A floating point number"

//Other Example
fun ArrayList<Int>.howMany() = "The list contains $size elements"