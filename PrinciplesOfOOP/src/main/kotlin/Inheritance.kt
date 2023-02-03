fun main(args: Array<String>){
    val carol = Daughter("french")
    carol.say("Hello")
    val me = Son()
    me.printName()
}

open class Mother(nativeTongue: String){
    open val hairColor = "brown"
    val eyeColor = "blue"

    open fun say(message: String){
        println("Mother says $message")
    }
}

class Daughter(nativeTongue: String) : Mother(nativeTongue){
    override val hairColor = "blonde"

    override fun say(message: String) {
        println("Daughter says $message")
        println("Daughter has $hairColor hair")
        super.say(message) //Calls the method of the Parent Class
        println("Mother has ${super.hairColor} hair")
    }
}

open class Father(){
    open val firstName = "John"
    val lastName = "Smith"

    open fun printName(){
        println("My name is $firstName $lastName")
    }
}

class Son: Father(){
    override val firstName = "Michael"

    override fun printName() {
        super.printName()
        println("My Fathers name is ${super.firstName} ${super.lastName}")
    }
}