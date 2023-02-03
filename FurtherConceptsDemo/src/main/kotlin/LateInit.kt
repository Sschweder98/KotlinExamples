fun main(args: Array<String>){
    //With lateInit we can create non-nullable variables that are not initialized
    //We give something like a promise to initialize them later on
    lateinit var networkService: String
    networkService = getNetworkService()
    println(networkService)

    //Example
    val myCountry = Country().apply { setName("Sweden") }
    println(myCountry.getName())
}

fun getNetworkService() = "Network Service"

//Example
class Country{
    private lateinit var name: String

    fun setName(name: String){
        this.name = name
    }

    fun getName() = name
}