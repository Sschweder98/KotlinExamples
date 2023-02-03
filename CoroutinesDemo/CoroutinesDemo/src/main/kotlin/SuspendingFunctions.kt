import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

var functionsCalls = 0

fun main(args: Array<String>){
    GlobalScope.launch { completeMessage() }
    GlobalScope.launch { improveMessage() }
    print("Hello ")
    Thread.sleep(2000L)
    println("There have been $functionsCalls calls so far")
}

suspend fun completeMessage(){
    delay(500L)
    println("World")
    functionsCalls++
}

suspend fun improveMessage(){
    delay(1000L)
    println("Suspend functions are cool")
    functionsCalls++
}