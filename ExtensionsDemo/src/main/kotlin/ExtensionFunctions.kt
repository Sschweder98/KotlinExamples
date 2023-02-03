fun main(args: Array<String>){
    val name = "Michael"
    println(name.slim())
}

//Extend class String with a function, doesn't modify the actual String Class
//Useful to extend Classes you don't own or don't have access to
fun String.slim(): String{
    return this.substring(1,length - 1)
}
