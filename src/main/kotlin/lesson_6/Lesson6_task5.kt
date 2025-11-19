package lesson_6

const val ATTEMPTS = 3
const val START_RANGE = 1
const val END_RANGE = 9

fun main() {
    println("--- Регистрация ---")

    print("Введите логин: ")
    val loginReg = readln()

    print("Введите пароль: ")
    val passwordReg = readln()

    do {
        println("--- Авторизации ---")

        print("Введите логин: ")
        val login = readln()

        print("Введите пароль: ")
        val password = readln()

    } while (loginReg != login || passwordReg != password)

    println("--- Авторизация прошла успешно, осталось доказать, что вы не бот! У вас $ATTEMPTS попытки ---")

    var attempts = ATTEMPTS

    while (attempts > 0) {
        val firstNumber = (START_RANGE..END_RANGE).random()
        val secondNumber = (START_RANGE..END_RANGE).random()

        val result = firstNumber + secondNumber

        println("Решите пример: $firstNumber + $secondNumber = ?")

        print("Введите ответ: ")
        val inputResult = readln().toInt()

        if (result == inputResult) {
            println("Добро пожаловать!")
            return
        } else {
            attempts--

            if (attempts > 0) {
                println("Неверно! Осталось попыток: $attempts")
            }
        }
    }
    println("Доступ запрещен")
}