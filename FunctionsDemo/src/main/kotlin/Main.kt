import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(args: Array<String>) {
    //standard function
    sayHello()

    //function with parameters/arguments
    saySomething("Hello")

    //function with multiple parameter
    var people = listOf("Sebastian", "Franziska", "Alex", "Patrick")
    var message = "Hello, how was your day"
    sayMessageToPeople(message, people)

    //function with a default value for its parameter
    saySomethingWithDefault()
    saySomethingWithDefault("Hello Sebastian")

    //function that returns a value
    var time = getTime()
    saySomething(time)

    var circlearea = calculateCircleArea(10)
    var circlearea2 = calculateCircleAreaShort(15)
    println(circlearea)
    println(circlearea2)

    //function overloading
    var number = multiply(5)
    println(number)
    number = multiply(5,5)
    println(number)

    var person = "Sebastian"
    sayHelloTo(person)
    var persons = listOf("Sebastian", "Franziska", "Alex", "Patrick")
    sayHelloTo(persons)

    //Vararg
    sayHelloWithVararg("Sebastian", "Franziska", "Alex", "Alina")

    //Local functions
    sayHelloWithLocalFunction()

    //Lambdas and higher level functions
    //Lamdas -> Anonymous functions
    //Higher level functions -> Functions that take a lambda function as a parameter/argument
    val names = arrayListOf("Sebastian", "Franziska", "Alex", "Clarissa")
    val myLambda = {name:String -> println("Hello there $name")}
    sayHello2(names, myLambda)
    sayHello2(names) {name:String -> println("Hello dear $name")}

    //Common higher order functions
    //forEach
    var clients = listOf("Anna", "Alina", "Annabelle")
    clients.forEach { println("Hello $it")}

    //filter
    clients.filter{it.length < 5}
        .forEach {println("Hello $it")}

    //map
    var sizes = clients.map {it.length }
    println(sizes)

    //sortedBy
    println(clients.sortedBy { it.length })

    //maxBy/minBy
    println(clients.maxBy{it.length})
    println(clients.minBy{it.length})

    //find
    println(clients.find { it.length == 4 })

    //Example: map
    var numbers = listOf(1,5,22,58,63,44,89,142)
    var changedNumbers = numbers.map {
        if (it % 2 == 0)
            it / 2
        else
            it * 2
    }
    println(changedNumbers)
}

//standard function
fun sayHello(){
    println("Hello")
}

//function with parameters/arguments
fun saySomething(message: String){
    println(message)
}

//function with multiple parameter
fun sayMessageToPeople(message:String, people: Collection<String>){
    for (person in people){
        println("$message $person?")
    }
}

//function with a default value for its parameter
fun saySomethingWithDefault(message: String = "Hello"){
    println(message)
}

//function that returns a value
fun getTime(): String {
    val current = LocalDateTime.now()
    return current.format(DateTimeFormatter.ofPattern("HH:mm"))
}

fun calculateCircleArea(radius: Int): Double{
    val pi = 3.1415
    return pi * radius * radius
}

fun calculateCircleAreaShort(radius: Int) = 3.1415 * radius

//function overloading
fun multiply(number: Int): Int{
    return (number * 2)
}

fun multiply(number: Int, multiplier: Int): Int{
    return (number * multiplier)
}

fun sayHelloTo(person: String){
    println("Hello $person")
}

fun sayHelloTo(persons: Collection<String>){
    for (person in persons){
        sayHelloTo(person)
    }
}

//Vararg
fun sayHelloWithVararg(vararg names: String){
    for (name in names){
        println("Hello $name")
    }
}

//Local functions -> Not often required, functions shouldn't be as big to require this
fun sayHelloWithLocalFunction(){
    fun sayHello(message: String){
        println(message)
    }
    var messsage = "hello"
    sayHello(messsage)
}

//Lambdas and higher level functions
fun sayHello2(names: ArrayList<String>, doSomething: (String) -> Unit){
    for (name in names){
        doSomething(name)
    }
}



