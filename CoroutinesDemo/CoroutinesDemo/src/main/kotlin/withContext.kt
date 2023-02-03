import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main(args: Array<String>){
    //Used to switch between Dispatchers
    //For Example to update UI in Android (Needs "Main" Dispatcher)
    runBlocking {
        launch(Dispatchers.Default) {
            println("First context: $coroutineContext")
            withContext(Dispatchers.IO){
                println("Second context: $coroutineContext")
            }
            println("Third context: $coroutineContext")
        }
    }
}