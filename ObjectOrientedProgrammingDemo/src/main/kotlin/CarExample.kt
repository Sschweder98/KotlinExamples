fun main(args: Array<String>){
    //runCarExample()
    //runMathExample()
    //runJetpackExample()
    //runCalculatorExample()
    //runSingletonExample()
    //inheritanceDogExample()
    inheritanceLaptopExample()
}

fun runCarExample(){
    val myCar = Car()
    val yourCar = Car()

    myCar.model = "Mercedes"
    yourCar.model = "Toyota"

    myCar.start()
    myCar.drive(50)

    yourCar.start()
    yourCar.drive(75)
}

fun runMathExample(){
    val math = Math()
    var num = math.add(1,1)
    println(num)
    num = math.sub(6,2)
    println(num)
    num = math.mul(2,3)
    println(num)
    num  = math.div(16,2)
    println(num)
}

fun runJetpackExample(){
    val jetpack = Jetpack()
    jetpack.burn(10)
    println("The height of the User is ${jetpack.userHeight}")
    jetpack.stop(2)
    println("The height of the User is ${jetpack.userHeight}")
    jetpack.burn(5)
    println("The height of the User is ${jetpack.userHeight}")
    jetpack.stop(8)
    println("The height of the User is ${jetpack.userHeight}")
}

fun runCalculatorExample(){
    val calc = Calculator();
    calc.add(10.0)
    calc.subtract(5.0)
    calc.multiply(4.0)
    calc.divide(2.0)
    calc.reset()
}

fun runSingletonExample(){
    if(DatabaseAccess.connected)
        DatabaseAccess.disconnect()
    else
        DatabaseAccess.connect()
}

fun inheritanceDogExample(){
    val myDog = Corgi()
    myDog.size = 60
    println("My Dog has a size of ${myDog.size} cm")
    myDog.play()
    myDog.bark();
}

fun inheritanceLaptopExample() {
    val laptop = Laptop()
    val apple = AppleLaptop()
    apple.screenSize = 13
    apple.processorModel = "Apple M1"
    apple.diskSpace = 512
    apple.ram = 16

    laptop.showInfo()
    apple.showInfo()
}

//Basics
class Car{
    var model: String? = null
    var topSpeed = 100

    fun start(){
        println("Starting the $model")
    }

    fun drive(speed: Int){
        println("Driving at a speed of $speed")
    }
}

class Math{
    fun add(a: Int, b: Int) = a + b
    fun sub(a: Int, b: Int) = a - b
    fun mul(a: Int, b: Int) = a * b
    fun div(a: Int, b: Int) = a / b
}

class Jetpack{
    var userHeight = 0

    fun burn(seconds: Int){
        println("Burning for $seconds seconds")
        userHeight += seconds
    }

    fun stop(seconds: Int){
        println("Stopping for $seconds seconds")
        userHeight -= seconds * 3
        if (userHeight < 0)
            userHeight = 0
    }
}

class Calculator{
    var totalValue = 0.0

    fun add(number: Double){
        println("Add $number to $totalValue...")
        totalValue += number
        println("The result is $totalValue")
    }

    fun subtract(number: Double){
        println("Subtract $number from $totalValue...")
        totalValue -= number
        println("The result is $totalValue")
    }

    fun multiply(number: Double){
        println("Take $totalValue times $number...")
        totalValue *= number
        println("The result is $totalValue")
    }

    fun divide(number: Double){
        println("Divide $totalValue by $number...")
        totalValue /= number
        println("The result is $totalValue")
    }

    fun reset(){
        totalValue = 0.0
        print("Calculator has been reset")
    }
}

//Singleton -> One instance of a class
object DatabaseAccess{
    var connected = false

    fun connect(){
        connected = true
        println("You are now connected to the database")
    }
    fun disconnect(){
        connected = false
        println("You are not connected to the database anymore")
    }
}

//Inheritance

//Dog Example
open class Dog{
    var size = 0

    fun bark(){
        println("Bark!")
    }
    fun play(){
        println("Play!")
    }
}

class Corgi: Dog(){
}

//Laptop Example
 open class Laptop{
    var screenSize = 15
    var processorModel = "Intel Core i5"
    var diskSpace = 256
    var ram = 8

    fun showInfo(){
        println("This Laptop features a $screenSize inch screen, a $processorModel CPU, $ram GB of RAM and $diskSpace GB of storage")
    }
 }

class AppleLaptop: Laptop(){

}