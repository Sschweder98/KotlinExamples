import kotlin.random.Random

var board = arrayListOf<ArrayList<String>>()

fun main(args: Array<String>){
    for (i in 0..2){
        val row = arrayListOf<String>()
        for (j in 0..2){
            row.add("")
        }
        board.add(row)
    }

    printBoard()

    var continueGame = true

    while(continueGame){
        println("Bitte Position angeben z.B. 1,1")
        var input = readLine()?:""
        var x = 0
        var y = 0
        try{
            val positions = input.split(",")
            x = positions[0].trim().toInt()
            y = positions[1].trim().toInt()
            var skipRound = false
            if(board[x-1][y-1] != ""){
                println("Dieses Feld ist bereits besetzt, wähle ein anderes Feld!")
                var skipRound = true
            }else{
                board[x-1][y-1] = "X"
                printBoard()
            }

            if (!skipRound){
                val playerWon = checkWinner(true)
                if (playerWon){
                    println("Du hast gewonnen!")
                    continueGame = false
                }

                val boardfFull = checkBoardFull()
                if (!playerWon && boardfFull){
                    println("Unentschieden!")
                    continueGame = false
                }

                if (continueGame){
                    placeComputerMove()
                    printBoard()
                    val computerWon = checkWinner(false)
                    if (computerWon){
                        println("Der Computer hat gewonnen!")
                        continueGame = false
                    }

                }

            }

        } catch (e: Exception){
            println("Falsche eingabe, bitte erneut versuchen!")
        }
    }
}

fun printBoard(){
    println("-------------")
    for (i in 0..2){
        for (j in 0..2){
            when (board[i][j]){
                "X" -> print("| X ")
                "O" -> print("| O ")
                else -> print("|   ")
            }
        }
        println("|")
        println("-------------")
    }
}

fun checkWinner(player: Boolean): Boolean{
    var won = false
    val checkSymbol = if (player) "X" else "O"
    for (i in 0..2){
        //Horizontal wins
        if(board[i][0] == checkSymbol &&
            board[i][1] == checkSymbol &&
            board[i][2] == checkSymbol){
            won = true
            break
        }

        //Vertical wins
        if(board[0][i] == checkSymbol &&
            board[1][i] == checkSymbol &&
            board[2][i] == checkSymbol){
            won = true
            break
        }
    }
    //Diagonal wins
    if(board[0][0] == checkSymbol &&
        board[1][1] == checkSymbol &&
        board[2][2] == checkSymbol){
        won = true
    }

    if(board[2][0] == checkSymbol &&
        board[1][1] == checkSymbol &&
        board[0][2] == checkSymbol){
        won = true
    }

    return won
}

fun checkBoardFull(): Boolean{
    var boardFull = true

    for (i in 0..2){
        for (j in 0..2){
            if (board[i][j] == "")
                boardFull = false
            break
        }
    }

    return boardFull
}

fun placeComputerMove(){
    var i = 0
    var j = 0
    do {
        i = Random.nextInt(3)
        j = Random.nextInt(3)
    } while(board[i][j] != "")
    board[i][j] = "O"
}