fun main(args: Array<String>){
    //Car example
    val myCar = Car()
    myCar.startCar()

    //Computer example
    val computer = Computer()
    computer.bootUp()
}

//Car example
class Car{
    private val engine = Engine();
    var speed = 0

    fun startCar(){
        engine.startEngine()
    }

    fun drive(){
        println("Driving at speed $speed")
    }

    private inner class Engine{
        var rpm = 0

        fun startEngine(){
            rpm = 1000
            println("Engine is running at $rpm rpm")
            this@Car.speed = 10
            this@Car.drive()
        }
    }
}

//Computer example
class Computer{
    fun bootUp(){
        println("Booting up computer")
        val os = OperatingSystem()
        os.startOS()
        println("Computer is ready")
    }

    inner class OperatingSystem{
        fun startOS(){
            println("OS started")
        }
    }

}