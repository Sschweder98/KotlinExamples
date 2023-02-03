fun main(args: Array<String>){
    val myBox = Box<String>()
    myBox.display("Text")

    val carBox = Box<Car>()
    carBox.display(Car())

    val newBox = NewBox<Int, Float>()
    newBox.display(34,21.5F)

    //Example
    val info = Info<String>()
    info.getLength("Some String")

    val info2 = Info<Double>()
    info2.getLength(45.9)

    val info3 = Info<ArrayList<Int>>()
    info3.getLength(arrayListOf(45,2,34,21,36,8))
}

class Box<T>{
    fun display(item: T){
        println(item)
    }
}

class Car{}

class NewBox<T, U>{

    fun display(item: T, item2: U){
        println(item)
        println(item2)
    }
}

//Example
class Info<T>{
    fun getLength(item: T){
        println(item.toString().length)
    }
}