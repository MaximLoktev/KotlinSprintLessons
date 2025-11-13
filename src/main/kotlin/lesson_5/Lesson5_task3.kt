package lesson_5

fun main() {
    val winningNumber1 = 5
    val winningNumber2 = 33

    println("--- ЛОТЕРЕЯ ---")
    println("Угадайте два числа от 0 до 42!")

    print("Введите первое число: ")
    val userNumber1 = readln().toInt()

    print("Введите второе число: ")
    val userNumber2 = readln().toInt()

    val guessedFirst = userNumber1 == winningNumber1 || userNumber1 == winningNumber2
    val guessedSecond = userNumber2 == winningNumber1 || userNumber2 == winningNumber2
    val guessedBoth = guessedFirst && guessedSecond

    val result = when {
        guessedBoth -> "Поздравляем! Вы выиграли главный приз!"
        guessedFirst || guessedSecond -> "Вы выиграли утешительный приз!"
        else -> "Неудача!"
    }

    println(result)
    println("Выигрышные числа были: $winningNumber1 и $winningNumber2")
}