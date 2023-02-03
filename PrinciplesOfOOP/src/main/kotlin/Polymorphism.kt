fun main(args: Array<String>){
    //Method-Overriding
    val mom = Mom()
    val daughter = MomsDaughter()

    mom.sayHello()
    daughter.sayHello()

    //Method-Overloading
    val otherMom = AnotherMother()
    otherMom.sayhello()
    otherMom.sayhello("how are you?")
    otherMom.sayhello("how are you?", "Peter")

    //Method-Overloading Example
    Translator.translate()
    Translator.translate("Hallo")
    Translator.translate("Hallo", "spanish")
}

//Method-Overriding
open class Mom{
    open fun sayHello(){
        print("The mom says hello!")
    }
}

class MomsDaughter: Mom(){
    override fun sayHello(){
        print("The daughter says hello!")
    }
}

//Method-Overloading
class AnotherMother{
    fun sayhello(){
        println("Hello!")
    }

    fun sayhello(message: String){
        println("Hello, $message")
    }

    fun sayhello(message: String, name: String){
        println("Hello $name, $message")
    }

}

//Method-Overloading Example
class Translator{
    companion object{
        fun translate(){
            println("Please enter what you need to be translated")
        }

        fun translate(text: String){
            println("Translating $text to english...")
        }

        fun translate(text: String, language: String){
            when (language){
                "english" -> println("Translating $text to english...")
                "spanish" -> println("Translating $text to spanish...")
                "german" -> println("Translating $text to german...")
            }
        }
    }
}

