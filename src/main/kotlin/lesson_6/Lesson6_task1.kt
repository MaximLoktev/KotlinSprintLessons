package lesson_6

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

    println("--- Авторизация прошла успешно ---")
}