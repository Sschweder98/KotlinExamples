fun main(args: Array<String>){
    //Class with multiple interfaces
    val device = Convertible()
    device.showInfo()
}

interface Tablet{
    val hasTouchscreen: Boolean
    val hasGooglePlayStore: Boolean
    val os: String

    fun runApps(){
        println("Running apps like Youtube, Netlifx etc.")
    }
}

interface Laptop{
    val cpu: String
    val ram: Int
    val diskSpace: Int
    val os: String

    fun runPrograms(){
        println("Running programs like IntelliJ IDEA!")
    }
}

class Convertible: Tablet, Laptop{
    override val hasTouchscreen: Boolean = true
    override val hasGooglePlayStore: Boolean = false
    override val cpu: String = "I5 1235U"
    override val ram: Int = 16
    override val diskSpace: Int = 512
    override val os: String = "Windows 11"

    fun showInfo(){
        println("Has Touchscreen: $hasTouchscreen")
        println("Has GooglePlay: $hasGooglePlayStore")
        println("CPU: $cpu")
        println("RAM: $ram GB")
        println("Disk: $diskSpace GB")
        println("Operating System: $os")
    }
}