import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>){
    runBlocking {
        launch(CoroutineName("myCoroutine")) {
            println("This is run from ${this.coroutineContext.get(CoroutineName.Key)}")
        }
    }
}