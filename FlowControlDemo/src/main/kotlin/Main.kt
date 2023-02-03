fun main(args: Array<String>) {

    //if/else Statement
    var time = 8

    if (time < 5 || time > 20) {
        println("It's Night")
    }
    else{
        println("It's Day")
    }

    //Example: Based on input
    println("Whats the Time?")
    var input = readLine()?:"12"
    time = input.toInt()

    if (time < 5 || time > 20) {
        println("It's Night")
    }
    else{
        println("It's Day")
    }

    //Nested if statements
    var animalsInZoo = listOf("Tiger", "Zebra", "Alligator")
    if (animalsInZoo.contains("Tiger")) {
        if (animalsInZoo.contains("Giraffe")) {
            println("The Zoo has Tigers and Giraffes")
        } else {
            println("The Zoo only has Tigers but no Giraffes")
        }
    }else{
        println("The Zoo has no Tigers and also no Giraffes")
    }

    //Some other example with input and else if
    println("Do you have the car keys? (yes/no)")
    input = readLine()?:"no"
    var hasKeys = false

    if (input == "yes") {
        hasKeys = true
    }
    else if(input == "no") {
        hasKeys = false
    }
    else{
        hasKeys = false
    }

    if (hasKeys) {
        println("You can start the car!")
    }
    else{
        println("You must get the Keys to start your car")
    }

    //Compact form of if statements
    println("Input a number")
    input = readLine()?: "0"

    if (input.toInt() % 2 == 0)
        println("The number is even")
    else
        println("The number isn't even")

    //If statement in one line
    if (input.toInt() % 5 == 0) println("The number is a multiple of 5") else println("The number is not a multiple of 5")

    //If statement that returns a value
    var isMultipleOfTen = if (input.toInt() % 10 == 0) "The number is a multiple of 10" else "The number is not a multiple of 10"
    println(isMultipleOfTen)

    //arithmetic expressions inside if statement
    if(2 + 4 +6 + 8 == 20)
        println("expression equals 20")
    else
        println("expression don't equals 20")

    //"in" Keyword -> alternative to "collection.contains"
    if (3 in setOf(1,2,3,4))
        println("3 is in the set")

    if ("cat" in listOf("cat", "dog", "horse"))
        println("cat is in the list")

    if ("cat" !in listOf("penguin", "dog", "horse"))
        println("cat is not in the list")

    if (3 in 1..12)
        println("3 is in the range")

    if (3 !in 4..12)
        println("3 is not in the Range!")

    //Boolean returning functions
    var vendors = arrayListOf<String>()

    if (vendors.isEmpty())
        println("There are no vendors yet")

    if (vendors.add("Philips"))
        println("Successfully added Siemens to the list of vendors")

    //When Statement
    var animal = "cat"
    var action = ""

    when (animal){
        "cat", "dog" -> {
            action = "pet it"
        }
        "snake" -> {
            action = "dont let it bite you"
        }
        "spider" -> {
            action = "Take a glas or something to bring it outside"
        }
    }

    //compact when statement
    var number = 1234
    when (number % 2){
        0 -> println("Number is even")
        1 -> println("Number is odd")
    }

    //nested when statements
    number = 10
    when (number%2){
        0 -> {
            when (number%5){
                0 -> {
                    println("Number is a multiple of 2 and also of 5")
                }
            }
        }

        1->{
            println("Number is odd")
        }
    }

    //when statement that returns a value
    animal = "dog"
    action = when (animal){
            "cat", "dog" -> "pet it"
            "snake" -> "dont let it bite you"
            "spider" -> "Take a glas or something to bring it outside"
            else -> "Look for it on the internet"
        }

    //Example with ranges and string functions
    var name = "Michael"
    when (name.length){
        in 0..5 -> println("Your name is pretty short")
        in 6..10 -> println("Your name has an normal length")
        else -> println("You have an long name")
    }

    //For loops
    var animals = arrayListOf("cat", "dog", "horse", "mouse", "monkey")
    for (animal in animals){
        println("I like " + animal + "s")
    }

    //with range
    for (i in 1..12){
        when (i){
            1 -> println("Januar")
            2 -> println("Februar")
            3 -> println("März")
            4 -> println("April")
            5 -> println("Mai")
            6 -> println("Juni")
            7 -> println("Juli")
            8 -> println("August")
            9 -> println("September")
            10 -> println("Oktober")
            11 -> println("November")
            12 -> println("Dezember")
        }
    }

    //range -> descending
    for (i in 12 downTo 1){
        when (i){
            1 -> println("Januar")
            2 -> println("Februar")
            3 -> println("März")
            4 -> println("April")
            5 -> println("Mai")
            6 -> println("Juni")
            7 -> println("Juli")
            8 -> println("August")
            9 -> println("September")
            10 -> println("Oktober")
            11 -> println("November")
            12 -> println("Dezember")
        }
    }

    //range -> steps

    for (i in 1..12 step 3){
        when (i){
            1 -> println("Januar")
            2 -> println("Februar")
            3 -> println("März")
            4 -> println("April")
            5 -> println("Mai")
            6 -> println("Juni")
            7 -> println("Juli")
            8 -> println("August")
            9 -> println("September")
            10 -> println("Oktober")
            11 -> println("November")
            12 -> println("Dezember")
        }
    }

    //nested for loops
    for (i in 2000..2022){
        println(i.toString() + ":")
        for (i in 1..12){
            when (i){
                1 -> println("Januar")
                2 -> println("Februar")
                3 -> println("März")
                4 -> println("April")
                5 -> println("Mai")
                6 -> println("Juni")
                7 -> println("Juli")
                8 -> println("August")
                9 -> println("September")
                10 -> println("Oktober")
                11 -> println("November")
                12 -> println("Dezember")
            }
        }
    }

    //While loop
    var i = 0
    while (i < 10){
        println(i)
        i++
    }

    var loggedIn = false
    while (!loggedIn){
        println("Please enter password")
        input = readLine()?:""
        when (input){
            "1234" ->{
                loggedIn = true
                println("You are now logged in :)")
            }
            else -> println("Password is wrong :/")
        }
    }

    //do while
    i = 0
    do {
        println(i)
        i++
    } while (i < 10)

    //nested while loops
    i = 0
    var i2 = 0
    while (i < 10){
        while (i2 < 10){
            println(i * i2)
            i2++
        }
        i++
        i2 = 0
    }

    //Example: choose username
    var userNameChoosen = false
    var userNames = hashSetOf("Sebastian", "Alex", "Leon", "Patrick")
    while (!userNameChoosen){
        println("Please choose an username")
        input = readLine()?:""
        if (input == "") {
            println("Your input was empty!")
        }
        else if (input in userNames) {
            println("Your username is not available")
        }
        else{
            userNames.add(input)
            userNameChoosen = true
            println("Successfully added your user: $input")
        }
    }

    //break/continue (For loop as example, works also with while loop)
    var names = hashSetOf<String>()
    for (i in 1..10){
        println("Enter name: $i")
        input = readLine()?:""

        if (input == "") {
            println("Your input was empty")
            continue
        }

        if (input == "Voldemort"){
            println("You are not allowed to say this name")
            break
        }

        names.add(input)
    }

    

}
