fun main(args: Array<String>){
    val newCar = NewCar().run {
        speed = 100
        drive()
        println("The new Car is driving!")
        this
    }
    println(newCar)

    run {
        val newCar2 = NewCar()
        newCar2.speed = 80
        newCar2.drive()
    }
}

class NewCar{
    var speed = 50

    fun drive(){
        println("The Car now is driving on a speed of $speed")
    }
}