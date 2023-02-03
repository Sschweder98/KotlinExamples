fun main(args: Array<String>){
    with(Car()){
        speed = 80
        drive()
        println("The Car is driving!")
    }

    val person = Person()
    with(person){
        name = "Sebastian"
        age = 24
        location = "Stuttgart"
        getInfo()
    }
}

class Car{
    var speed = 50

    fun drive(){
        println("The Car now is driving on a speed of $speed")
    }
}

class Person{
    var name = ""
    var age = 0
    var location = ""

    fun getInfo(){
        println("The person $name is $age years old and lives in $location")
    }
}