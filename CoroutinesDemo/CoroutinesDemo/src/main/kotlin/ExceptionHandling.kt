import kotlinx.coroutines.*

fun main(args: Array<String>){
    runBlocking {
        //With "launch"
        val myHandler = CoroutineExceptionHandler{coroutineContext, throwable ->
            println("Exception handled: ${throwable.localizedMessage}")
        }

        val job = GlobalScope.launch(myHandler) {
            println("Throwing exception from job")
            throw IndexOutOfBoundsException("exception in coroutine")
        }
        job.join()

        //With "async"
        val deffered = GlobalScope.async {
            println("Throwing exception from async")
            throw ArithmeticException("exception in async")
        }
        try {
            deffered.await()
        } catch (e: ArithmeticException){
            println("Caught arithmetic exception")
        }
    }


}