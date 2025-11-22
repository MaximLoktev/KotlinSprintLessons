package lesson_6

private const val ATTEMPTS = 5
private const val START_RANGE = 1
private const val END_RANGE = 9

fun main() {
    val secretNumber = (START_RANGE..END_RANGE).random()

    println("--- Мини Игра ---")
    println("Угадайте число от 1 до 9. У вас 5 попыток!")

    var attempts = ATTEMPTS

    while (attempts > 0) {
        print("Введите ваше число: ")
        val guess = readln().toInt()

        if (guess == secretNumber) {
            println("Это была великолепная игра!")
            return
        } else {
            attempts--

            if (attempts > 0) {
                println("Неверно! Осталось попыток: $attempts")
            }
        }
    }
    println("Было загадано число $secretNumber")
}