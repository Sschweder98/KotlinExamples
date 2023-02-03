fun main(args: Array<String>){
    val value = "Testing my strings"

    //The "is" keyword is useful to check if a variable has a certain type
    if(value is String)
        println("The variable is a String")

    if(value !is String)
        println("The variable is not a String")

    //The "as" keyword is used to specify a type
    val myCar = getCar()
    if(myCar is BMW)
        (myCar as BMW).drive()
}

open class Car{}

class BMW: Car(){
    fun drive(){
        println("Driving my BMW")
    }
}

fun getCar(): Car = BMW()