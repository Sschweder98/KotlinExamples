import javax.print.attribute.standard.MediaSize.Other

fun main(args: Array<String>){
    val myCar = OtherCar()
    myCar.getInfoFromParent()
    println(myCar.color) //available because it's public
    println(myCar.brand ) //available because it has the internal modifier
    //engineSize -> Not available because it's protected
    //vin -> Not available because it's private

}

//Notes about the following Code
//Modifiers to change the scope of variables or functions

//private -> available inside the class
//protected -> available inside the class and inheriting classes
//internal -> available inside the package
//public -> available from everywhere

//The default is public, so if we don't use any modifier it's public

open class Car{
    public val color = "Silver"
    internal val brand = "Mercedes"
    protected val engineSize = 1.6
    private val vin = 234197807848
}

class OtherCar: Car(){
    fun getInfoFromParent(){
        println(super.color)
        println(super.brand)
        println(super.engineSize)
        //vin isn't available cause it's private
    }
}

