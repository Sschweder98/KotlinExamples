fun main(args: Array<String>){
    //Abstraction means that functions or variables that two classes have in common are stored in a third abstract class
    //The abstract modifier insures that no instances of that class can be created
    val train = Train()
    train.startEngine()
    train.stopEngine()
    val plane = Plane()
    plane.startEngine()
    plane.stopEngine()
}

abstract class Vehicle{
    val brand = ""
    val model = ""
    val engineSize = 0.0

    abstract fun startEngine()

    fun stopEngine(){
        println("The engine is stopped")
    }
}

class Train: Vehicle(){
    override fun startEngine() {
        println("The train engine is running")
    }
}

class Plane: Vehicle(){
    override fun startEngine() {
        println("The plane engine is running")
    }
}