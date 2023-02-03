import kotlin.random.Random

fun main(args: Array<String>){
    //Lazy variables are only initialized when needed
    //Useful to save memory with big variables/objects
    val someLargeVariable: String by lazy {
        "Some large value"
    }

    if(Random.nextInt() % 2 == 0)
        println(someLargeVariable)

    //Example
    val list by lazy { generateList() }
    println("Should the list be generated? yes/no")
    val input = readLine()?:""
    if (input=="yes")
        println(list)

}

fun generateList(): List<Int>{
    val integers = arrayListOf<Int>()
    for (i in 1..1000){
        integers.add(Random.nextInt(10000))
    }
    return integers
}