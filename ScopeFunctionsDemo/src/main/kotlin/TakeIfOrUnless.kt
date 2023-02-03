import kotlin.random.Random

fun main(args:Array<String>){
    for(i in 1..10) {
        val number: Int = Random.nextInt(100)
        val evenOrNull: Int? = number.takeIf { it % 2 == 0 }
        val oddOrNull: Int? = number.takeUnless { it % 2 == 0 }

        println("The number is $number")
        println("The even number is $evenOrNull")
        println("The odd number is $oddOrNull")
    }
}