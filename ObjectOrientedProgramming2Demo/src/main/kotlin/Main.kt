fun main(args: Array<String>){
    //runConstructorExamples()
    // runGetSetExamples()
    //runThisKeywordExamples()
    //runInitBlockExamples()
    runCompanionObjectExamples()
}

fun runConstructorExamples(){
    //Short form of a constructor
    val car = Car("BMW", 220)
    //Long forms of a constructor
    val car1 = Car2()
    val car2 = Car2("BMW")
    val car3 = Car2(220)
    val car4 = Car2("BMW", 220)
    //User Account Example
    val user1 = UserAccount()
    val user2 = UserAccount("Olaf")
    val user3 = UserAccount("Sebastian", 60)
}

fun runGetSetExamples(){
    val car = newCar()
    car.speed = 50
    car.speed = 100
    car.speed = 150
    car.speed = 200
    car.speed = 250
    val account = BankAccount();
    account.creditAmount = 1000
    account.creditAmount = 1500
    account.creditAmount = 1300
    account.creditAmount = 2000
}

fun runThisKeywordExamples(){
    val note = PostItNote()
    note.setNewMessage("Hello!")
    val table = Table()
    table.setDimensions(80,200,100)
    println("The height is: ${table.height}")
    println("The length is: ${table.length}")
    println("The depth is: ${table.depth}")
}

fun runInitBlockExamples(){
 val car = Car3()
}

fun runCompanionObjectExamples(){
    println(Car4.provideDrivingInstructions())
    val course = KotlinCourse()
    course.getCourseInfo()
    KotlinCourse.getCourseMetaInfo()
}

//Short form of a constructor
class Car(var model: String, var speed: Int){

}

//Long forms of a constructor
class Car2{
    var model: String? = null
    var topSpeed = 100

    constructor(){
        model = "BMW"
        topSpeed = 220
    }

    constructor(_model: String){
        model = _model
        topSpeed = 220
    }

    constructor(_topSpeed: Int){
        model = "BMW"
        topSpeed = _topSpeed
    }

    constructor(_model: String, _topSpeed: Int){
        model = _model
        topSpeed = _topSpeed
    }
}

//User Account example
class UserAccount{
    var userName = "User name"
    var balance = 0
    var tshirtPrice = 20

    constructor(){
        userName = "Generic user"
        balance = 1
        canAfford()
    }

    constructor(newUSerName: String){
        userName = newUSerName
        balance = 2
        canAfford()
    }

    constructor(newUSerName: String, newBalance: Int){
        userName = newUSerName
        balance = newBalance
        canAfford()
    }

    fun canAfford(){
        if (balance > tshirtPrice)
            println("$userName can afford ${balance / tshirtPrice} tshirts")
        else
            println("$userName cant afford any tshirts")
    }
}

//Get and Set examples
class newCar(){
    var name: String = "normal Car"
    var speed: Int = 0
        get() = field //You could also return something different from the variable value like 50
        set(value){
            field = value
            when (value){
                in (0..50) -> name = "very slow car"
                in (51..100) -> name = "slow car"
                in (101..150) -> name = "normal car"
                in (151..200) -> name = "fast car"
                else -> name = "very fast car"
            }
            println("The $name has a speed of $speed KM/H")
        }
}

class BankAccount{
    var creditRating = 500
    var creditAmount: Int = 0
        get() = field
        set(value){
            if (value > creditAmount)
                creditRating++
            else
                creditRating--
            field = value
            println("Your credit is $creditAmount and your rating is at $creditRating")
        }
}

//"this" Keyword examples
class PostItNote{
    var message: String = "Empty"

    fun setNewMessage(message: String){
        this.message = message
        println(this.message)
    }
}

class Table{
    var height = 0
    var length = 0
    var depth = 0

    fun setDimensions(height: Int, length: Int, depth: Int){
        this.height = height
        this.length = length
        this.depth = depth
    }
}

//"init" Block examples
class Car3{
    var brand = "Mercedes"
    var topSpeed = 230

    init {
        println("This Car is from $brand and has a top speed of $topSpeed KM/H ")
    }
}

//Companion object examples
class Car4{
    companion object{
        fun provideDrivingInstructions() : String{
            return "Drive Safe!"
        }
    }
}

class KotlinCourse{
    fun getCourseInfo(){
        println("Kotlin is based on Java")
    }

    companion object{
        fun getCourseMetaInfo(){
            print("Learning Kotlin isn't that hard")
        }
    }
}