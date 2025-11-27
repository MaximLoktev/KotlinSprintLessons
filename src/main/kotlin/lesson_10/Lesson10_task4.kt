package lesson_10

fun main() {
    var playerWins = 0
    var totalRounds = 0

    println("\nИГРА В КОСТИ")

    do {
        totalRounds++
        println("\n--- Раунд $totalRounds ---")

        val humanResult = rollOfDice()
        printResultRoll("Человек", humanResult)

        val robotResult = rollOfDice()
        printResultRoll("Робот", robotResult)

        if (isPlayerWinsRound(humanResult, robotResult)) {
            playerWins++
        }

        print("\nХотите бросить кости еще раз? Введите Да или Нет: ")
        val answer = readln()

    } while (answer.equals("Да", ignoreCase = true))

    printGameResults(totalRounds, playerWins)
}

fun rollOfDice(): Int = (1..6).random()

fun printResultRoll(player: String, result: Int) =
    println("$player бросил кубик и выпало $result")

fun isPlayerWinsRound(humanResult: Int, robotResult: Int): Boolean {
    println(
        when {
            humanResult > robotResult -> "Победило человечество"
            robotResult > humanResult -> "Победила машина"
            else -> "Победила дружба"
        }
    )
    return humanResult > robotResult
}

fun printGameResults(totalRounds: Int, playerWins: Int) {
    println("\n--- ИТОГИ ---")
    println("Сыграно раундов: $totalRounds")
    println("Ваши победы: $playerWins")
}