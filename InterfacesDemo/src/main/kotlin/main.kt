fun main(args: Array<String>){
    //Browser example
    val standardBrowser: Browser = getBrowser()
    standardBrowser.goToStartingPage()
    //Restaurant example
    val restaurant1: Restaurant = FastFoodRestaurant()
    val restaurant2: Restaurant = ChineseRestaurant()
    val restaurant3: Restaurant = ItalianRestaurant()
    restaurant1.getRestauranInfo()
    restaurant2.getRestauranInfo()
    restaurant3.getRestauranInfo()
    //Factory example for restaurant classes
    val factory = RestaurantFactory()
    val restaurant4 = factory.provideRestaurant("italian")
    val restaurant5 = factory.provideRestaurant("chinese")
    val restaurant6 = factory.provideRestaurant("fastfood")
    restaurant4.getRestauranInfo()
    restaurant5.getRestauranInfo()
    restaurant6.getRestauranInfo()

}

//Browser example
fun getBrowser(): Browser{
    return Firefox();
}

interface Browser{
    var startingPage: String
    var currentURL: String

    fun openURL(url: String)

    fun goToStartingPage(){
        currentURL = startingPage
    }
}

class Firefox: Browser{
    override var startingPage: String = "www.firefox.com"
    override var currentURL: String = startingPage

    override fun openURL(url: String) {
        currentURL = url
    }
}

class Chrome: Browser{
    override var startingPage: String = "www.google.de"
    override var currentURL: String = startingPage

    override fun openURL(url: String) {
        currentURL = url
    }
}

//Restaurant example
interface Restaurant{
    val name: String
    val menu: String
    val foodDelivery: Boolean
    val cardPayment:Boolean

    fun getRestauranInfo(){
        println("\nThis Restaurant has is named $name")
        println("This Restaurant has the following menu : $menu")
        println("Has this restaurant a delivery service? : $foodDelivery")
        println("Can you pay with your debit Card here? : $cardPayment")
    }
}

class FastFoodRestaurant: Restaurant {
    override val name: String = "McDonalds"
    override val menu: String = "Burger, Fries, Wraps, Nuggets"
    override val foodDelivery: Boolean = true
    override val cardPayment: Boolean = true
}

class ChineseRestaurant: Restaurant {
    override val name: String = "Asia Wok"
    override val menu: String = "Noodels, Rice, Curry"
    override val foodDelivery: Boolean = true
    override val cardPayment: Boolean = false
}

class ItalianRestaurant: Restaurant {
    override val name: String = "Italian Classics"
    override val menu: String = "Pizza, Spaghetti, Salad"
    override val foodDelivery: Boolean = false
    override val cardPayment: Boolean = false
}

//Factory example for restaurant classes
class RestaurantFactory{
    fun provideRestaurant(type: String): Restaurant{
        when (type.lowercase()){
            "fastfood" -> return FastFoodRestaurant()
            "chinese" -> return ChineseRestaurant()
            "italian" -> return ItalianRestaurant()
            else ->{
                println("Only FastFood, Chinese and Italian are available")
                return FastFoodRestaurant()
            }
        }
    }
}
