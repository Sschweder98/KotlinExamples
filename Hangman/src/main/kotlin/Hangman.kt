import kotlin.random.Random

val words = listOf("Baum", "Auto", "Bus", "Zug", "Matratze", "Händler", "Zahnbürste", "Smartphone", "Liebe", "Schwert", "Bahnhof", "Raub", "Laptop",
    "Hochhaus", "Wohnung", "Pflanze", "Schnee", "Sonne", "Mond", "Erde", "Baumarkt", "Supermarkt")
var word = ""
val guesses = arrayListOf<Char>()
var remainingGuesses = 6
var mistakes = 0

fun main(args: Array<String>){
    setupGame()
}

fun setupGame(){
    val wordIndex = Random.nextInt(words.size)
    word = words[wordIndex].uppercase()
    for (i in word.indices)
        guesses.add('_')

    var gameOver = false

    while(!gameOver){
        printGameStatus()
        println("Bitte einen Buchstaben eingeben:")
        val input = readLine()?:""

        if (input.isEmpty()){
            println("Falsche Eingabe!")
        }
        else{
            var letter = input[0].uppercaseChar()
            if (word.contains(letter)) {
                for (i in word.indices) {
                    if (word[i] == letter)
                        guesses[i] = letter
                }
                if (!guesses.contains('_')) {
                    printGameStatus()
                    println("Du hast gewonnen!")
                    gameOver = true
                }
            }else{
                println("Das Wort enthällt leider nicht den Buchstaben: $letter")
                remainingGuesses--
                mistakes++
                if (mistakes == 6){
                    printGameStatus()
                    println("Du hast verloren! Das Wort war $word")
                    gameOver = true
                }
            }
        }
    }
}

fun printGameStatus(){
    println()
    printCharacter()
    println()
    print("Wort: ")
    for (element in guesses)
        print("$element ")
    println()
    println("Du hast noch $remainingGuesses versuch/e übrig")
}

fun printCharacter(){
    when (mistakes){
        0->{
            println(" |------|-")
            println(" |      | ")
            println(" |        ")
            println(" |        ")
            println(" |        ")
            println(" |        ")
            println("/|\\       ")
        }
        1->{
            println(" |------|-")
            println(" |      | ")
            println(" |      0 ")
            println(" |        ")
            println(" |        ")
            println(" |        ")
            println("/|\\       ")
        }
        2->{
            println(" |------|-")
            println(" |      | ")
            println(" |      0 ")
            println(" |      | ")
            println(" |      | ")
            println(" |        ")
            println("/|\\       ")
        }
        3->{
            println(" |------|-")
            println(" |      | ")
            println(" |      0 ")
            println(" |     /| ")
            println(" |      | ")
            println(" |        ")
            println("/|\\       ")
        }
        4->{
            println(" |------|-")
            println(" |      | ")
            println(" |      0 ")
            println(" |     /|\\")
            println(" |      | ")
            println(" |        ")
            println("/|\\       ")
        }
        5->{
            println(" |------|-")
            println(" |      | ")
            println(" |      0 ")
            println(" |     /|\\")
            println(" |      | ")
            println(" |     /  ")
            println("/|\\       ")
        }
        6->{
            println(" |------|-")
            println(" |      | ")
            println(" |      0 ")
            println(" |     /|\\")
            println(" |      | ")
            println(" |     / \\")
            println("/|\\       ")
        }
    }
}