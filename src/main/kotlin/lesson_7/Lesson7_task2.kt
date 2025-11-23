package lesson_7

fun main() {
    println("\n--- Система авторизации по SMS ---")

    do {
        val smsCode = (1000..9999).random().toString()
        println("\nВаш код авторизации: $smsCode")

        print("Введите код из SMS: ")
        val userInput = readln()

    } while (userInput != smsCode)

    println("\nАвторизация успешна!")
    println("Добро пожаловать в систему!")
}