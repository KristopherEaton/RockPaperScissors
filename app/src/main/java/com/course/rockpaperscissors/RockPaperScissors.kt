package com.course.rockpaperscissors

fun main(){

    var computerChoice = ""
    var playerChoice= ""
    var playerScore = 0
    var computerscore = 0
    var runProgram= true
    println("Welcome to Paper, Rock, Scissors!")
    println("To play, enter your choice and beat the crap out of the computer! It simple and easy. if you win, your computer doesn't get fried!")

    while(runProgram){

        while(playerChoice != "Rock" || playerChoice != "Paper" || playerChoice != "Scissors" ){
            if(playerChoice == "Rock"){
                break
            }else if(playerChoice == "rock"){
                playerChoice = "Rock"
                break
            }else if(playerChoice == "Paper"){
                break
            }else if(playerChoice == "paper"){
                playerChoice = "Paper"
                break
            }else if(playerChoice == "Scissors") {
                break
            }else if(playerChoice == "scissors") {
                playerChoice = "Scissors"
                break
            }else

                println("Rock, Paper or Scissors? Enter your choice: ")
            playerChoice = readln()
        }

        println("You chose: $playerChoice")

        // Calculate computer choice
        when ((1..3).random()) {
            1 -> {
                computerChoice = "Rock"
            }

            2 -> {
                computerChoice = "Paper"
            }

            3 -> {
                computerChoice = "Scissors"
            }
        }

        println("Computer chose: $computerChoice")

        // Game results logic
        val winner = when{
            playerChoice == computerChoice -> "Tie"
            playerChoice == "Rock" &&  computerChoice == "Scissors" -> "Player"
            playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
            playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
            else -> "Computer"
        }

        if (winner == "Tie"){
            playerChoice=""
            println("The computer and you tied...boring")
        }else if(winner == "Player"){
            playerScore++
            playerChoice=""
            println("You beat that bucket of bolts fair and square")
        }else {
            computerscore++
            playerChoice=""
            println("You got your ass spanked by this Skynet sombitch")
        }

        // Break loop and/or exit program
        println("The current SCORE:   Computer = $computerscore      Player = $playerScore")
        println("")


        if (computerscore >= 3){
            println("")
            println("The computer won! You suck!")
            println("")
            println("Continue playing? Y or N")
            var continuePlayingLoss = readln()
            if (continuePlayingLoss == "N"){
                runProgram = false
            }else if(continuePlayingLoss == "n"){
                runProgram = false
            }else playerChoice = ""
        }
        if (playerScore>=3){
            println("")
            println("The beat that cyber bully! You have what it takes to survive in the robot apocalypse!")
            println("")
            println("Continue playing? Y or N")
            when (readln()) {
                "N" -> {
                    runProgram = false
                }
                "n" -> {
                    runProgram = false
                }
                else -> playerChoice = ""
            }
        }


    }


}