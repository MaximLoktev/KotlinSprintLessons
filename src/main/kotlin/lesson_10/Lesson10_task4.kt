package lesson_10

fun main() {
    var playerWins = 0
    var totalRounds = 0

    println("\nИГРА В КОСТИ")

    do {
        totalRounds++
        println("\n--- Раунд $totalRounds ---")

        if (isPlayerWinsRound()) { playerWins++ }

        print("\nХотите бросить кости еще раз? Введите Да или Нет: ")
        val answer = readln()

    } while (answer.equals("Да", ignoreCase = true))

    println("\n--- ИТОГИ ---")
    println("Сыграно раундов: $totalRounds")
    println("Ваши победы: $playerWins")
}

fun isPlayerWinsRound(): Boolean {
    val humanResult = rollOfDice()
    println("Человек бросил кубик и выпало $humanResult")

    val robotResult = rollOfDice()
    println("Робот бросил кубик и выпало $robotResult")

    println(
        when {
            humanResult > robotResult -> "Победило человечество"
            robotResult > humanResult -> "Победила машина"
            else -> "Победила дружба"
        }
    )
    return humanResult > robotResult
}

fun rollOfDice(): Int = (1..6).random()