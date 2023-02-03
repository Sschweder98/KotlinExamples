fun main(args: Array<String>){
    //Car example
    val myCar: MyCar = MyCar().apply {
        speed = 100
        color = "silver"
        drive()
    }
    println(myCar)

    //Lock and key example
    Lock().unlock(
        Key().apply {
            secretCode = "123"
            carve()
        }
    )
}

//Car example
class MyCar{
    var speed = 50
    var color = "blue"

    fun drive(){
        println("The Car now is driving on a speed of $speed")
    }
}

//Lock and key example
class Lock{
    fun unlock(key: Key){
        println("Inlocked lock with key $key")
    }
}

class Key{
    var secretCode = ""
    fun carve(){
        println("Carving the key with code $secretCode")
    }
}