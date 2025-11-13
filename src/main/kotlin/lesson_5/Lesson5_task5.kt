package lesson_5

const val COUNT = 3
const val START_RANGE = 0
const val END_RANGE = 42

fun main() {
    val winningNumbers = List(COUNT) { (START_RANGE..END_RANGE).random() }

    println("--- УЛУЧШЕННАЯ ЛОТЕРЕЯ ---")
    println("Угадайте три разных числа от 0 до 42!")

    val userNumbers = mutableListOf<Int>()

    for (i in 1..COUNT) {
        print("Введите число #$i: ")
        val input = readln().toInt()

        userNumbers.add(input)
    }

    val matchedNumbers = userNumbers.intersect(winningNumbers)
    val matchCount = matchedNumbers.size

    val result = when (matchCount) {
        3 -> "ДЖЕКПОТ! Вы угадали все три числа!"
        2 -> "Отлично! Вы угадали два числа и получаете крупный приз!"
        1 -> "Хорошо! Вы угадали одно число и получаете утешительный приз!"
        0 -> "Неудача! Вы не угадали ни одного числа."
        else -> "Что-то новенькое!"
    }

    println("-----------------------------------")
    println(result)

    println("\nДетали игры:")
    println("Ваши числа: ${userNumbers.sorted().joinToString(", ")}")
    println("Выигрышные числа: ${winningNumbers.sorted().joinToString(", ")}")
}