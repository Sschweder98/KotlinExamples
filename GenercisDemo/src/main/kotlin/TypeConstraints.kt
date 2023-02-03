fun main(args: Array<String>){
    val chef = Chef<Apple>()
    chef.cook(Apple())

    val chef2 = Chef<Banana>()
    chef2.cook(Banana())

    //Example
    val printer1 = Printer<Set<String>>()
    printer1.iterate(hashSetOf("Sebastian", "Alex", "Michael", "Patrick"))

    val printer2 = Printer<List<String>>()
    printer2.iterate(listOf("Markus","Benjamin","Daniel"))
}

abstract class Fruit{
    abstract fun peel()
}

class Apple: Fruit(){
    override  fun peel(){
        println("Peeling the apple")
    }
}

class Banana: Fruit(){
    override  fun peel(){
        println("Peeling the banana")
    }
}

class Chef<T: Fruit>{
    fun cook(item: T){
        item.peel()
    }
}

//Example
class Printer<T: Collection<String>>{
    fun iterate(collection: T){
        collection.forEach { println(it.toString()) }
    }
}