package lesson_5

const val REQUIRED_AGE = 18
const val CURRENT_YEAR = 2025

fun main() {
    print("Введите свой год рождения: ")
    val answer = readln().toInt()

    val isSuccess = (CURRENT_YEAR - answer) >= REQUIRED_AGE

    val string = if (isSuccess) "Показать экран со скрытым контентом" else "Надо ещё подрасти!"

    println(string)
}