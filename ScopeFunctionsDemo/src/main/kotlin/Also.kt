fun main(args: Array<String>){
    AnotherCar().apply {
        speed = 80
        color = "green"
        drive()
    }.also { 
        println("The car has the color ${it.color}")
    }
}

class AnotherCar{
    var speed = 50
    var color = "blue"

    fun drive(){
        println("The Car now is driving on a speed of $speed")
    }
}