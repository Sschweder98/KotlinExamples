fun main(args: Array<String>){
    val myFirstUser = User("Test Person","T.Person@test.com","1234")
    val mySecondUser = User("Test Person","T.Person@test.com","1234")

    println(myFirstUser)

    //You can compare the values of data class objects
    //-> Normal classes would return false in this case
    println("Does myFirstUser equal mySecondUser? : ${myFirstUser == mySecondUser}")

    //You can use toString() to return the values inside a data class object
    //-> Normal classes would return the id of the instance (like User@a6cd3e4)
    println(myFirstUser)

    //You can use the copy() function to copy a data class object
    val myThirdUser = myFirstUser.copy(email="TestPerson@test.com")
    println(myThirdUser)

    //Example
    val customers = arrayListOf<Customer>()
    customers.add(Customer("Alexander",1234567890, "no email"))
    customers.add(Customer("Benjamin",1234567890, "no email"))
    customers.add(Customer("Mia",1234567890, "no email"))
    customers.add(customers[0].copy(name="Lisa"))
    customers.forEach(::println)
}

data class User(
    val name: String,
    val email: String,
    val password: String
)

//Example
data class Customer(
    val name: String,
    val telephone: Int,
    val email: String
)