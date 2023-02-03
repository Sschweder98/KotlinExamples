fun main(args: Array<String>) {

    //List -> Immutable ordered collection
    var colors = listOf("red", "green", "blue", "green")
    var colors2 = listOf<String>() //Empty List

    println(colors[0])
    println(colors.size)

    //ArrayList -> Mutable ordered collection
    var colors3 = arrayListOf("red", "green")

    //Add something to the ArrayList
    colors3.add("gray")
    println(colors3)

    //Create an empty ArrayList
    var colors4 = arrayListOf<String>()

    //Create a second ArrayList and add the Items of it to our first ArrayList
    var moreColors = arrayListOf("yellow","orange")
    colors3.addAll(moreColors)
    println(colors3)

    //Check if an ArrayList contains all elements of another ArrayList
    println(colors3.containsAll(moreColors))

    //Remove an Item
    colors3.remove("green")
    println(colors3)

    //Remove all items that are in another ArrayList
    colors3.removeAll(moreColors)
    println(colors3)

    //Remove item at a specific index
    colors3.removeAt(1)
    println(colors3)

    //Change an item of a specific index
    colors3[0] = "white"
    println(colors3)
    colors3.set(0, "green")
    println(colors3)

    //Add some more items again to show more functions
    colors3.addAll(moreColors)
    colors3.add("pruple")

    //Show the index of an item
    println(colors3.indexOf("pruple"))

    //Create a SubList (Like SubString)
    var specificColors = colors3.subList(0,2)
    println(specificColors)

    //Clear a list
    colors3.clear()

    //Check of list has items
    println(colors.isEmpty())

    //Set -> Immutable unordered collection
    var numbers = setOf(5,1,2,3,4,4)
    println(numbers)

    //Create an empty Set
    var numbers2 = setOf<Int>()

    //Hashset -> Mutable unordered collection
    var numbers3 = hashSetOf(2,3,6,5,8)
    println(numbers3)

    //Add/Remove
    numbers3.add(10)
    numbers3.remove(8)
    println(numbers3)

    //AddAll/RemoveAll
    var tmpNumbers = hashSetOf(1,9)
    numbers3.addAll(tmpNumbers)
    println(numbers3)
    numbers3.removeAll(tmpNumbers)
    println(numbers3)

    //Size/Contains/ContainsAll/isEmpty
    println(numbers3.size)
    println(numbers3.contains(2))
    println(numbers3.containsAll(tmpNumbers))
    println(numbers3.isEmpty())

    //retainAll -> all numbers that are available in both sets
    numbers3.retainAll(setOf(3,6,5,12,13))
    println(numbers3)

    //Clear
    numbers3.clear()

    //Map -> Immutable "Dictionary"
    var count = mapOf(Pair("one", 1), Pair("two", 2), Pair("three", 3), Pair("four", 4))
    println(count)

    //empty Map
    var count2 = mapOf<String, Int>()

    //get item
    println(count.get("two"))
    println(count["two"])

    //Get all Keys/Values as seperate set/list
    var keys = count.keys //set -> unordered/no duplicates
    var values = count.values //custom type collection -> unordered/with duplicates
    println(keys)
    println(values)

    //Size
    println(count.size)

    //ContainsKey/ContainsValue
    println(count.containsKey("two"))
    println(count.containsValue(2))

    //HashMap -> Mutable "Dictionary"
    var count3 = hashMapOf(Pair("one", 1), Pair("two", 2), Pair("three", 3), Pair("four", 4))
    print(count3)

    //Empty HashMap
    var count4 = hashMapOf<String, Int>()

    //Put(Add)/PutAll
    count3.put("five", 5)
    count3["six"] = 6
    count3.putAll(hashMapOf(Pair("seven", 7), Pair("eight", 8)))
    println(count3)

    //Remove/Replace
    count3.remove("six")
    println(count3)
    count3.replace("five",6)
    println(count3)
    count3.replace("five",5)
    println(count3)

    //Clear
    count3.clear()

    //Check if empty
    println(count3.isEmpty())

}