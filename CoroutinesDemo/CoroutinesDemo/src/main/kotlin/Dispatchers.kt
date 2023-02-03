import kotlinx.coroutines.*

fun main(args: Array<String>){
    //Dispatchers
    //Main -> Used when updating the UI
    //Default -> Used for CPU intensive work
    //IO -> Used for network communication or storage operations
    //Unconfined -> Starts the coroutine in the inherited dispatcher that called it
    //newSingleThreadContext("MyThread") -> Forces creation of a new thread

    runBlocking{
        //Only available on Android
        // launch(Dispatchers.Main) {
        //    println("Main Dispatcher. Thread: ${Thread.currentThread().name}")
        //}

        launch(Dispatchers.Unconfined) {
            println("Unconfined. Thread: ${Thread.currentThread().name}")
            delay(100L)
            println("Unconfined - 2. Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) {
            println("Default Dispatcher. Thread: ${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO) {
            println("IO Dispatcher. Thread: ${Thread.currentThread().name}")
        }
        
        launch(newSingleThreadContext("MyThread")) {
            println("newSingleThreadContext. Thread: ${Thread.currentThread().name}")
        }
    }
}