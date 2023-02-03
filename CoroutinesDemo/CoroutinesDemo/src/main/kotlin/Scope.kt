import kotlinx.coroutines.*

fun main(args: Array<String>){
    println("Program execution will now block")
    //runBlocking means that it blocks the main Program from executing
    runBlocking {
        launch {
            delay(1000L)
            println("Task from runBlocking")
        }

        //Program wide Scope, will run as long as application
        GlobalScope.launch{
            kotlinx.coroutines.delay(500L)
            println("Task from GlobalScope")
        }

        //Custom Scope
        coroutineScope {
            launch {
                delay(1500L)
                println("Task form coroutineScope")
            }
        }
    }
    println("Program execution will now continue")
}