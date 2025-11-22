package lesson_7

fun main() {
    println("\n--- Система авторизации по SMS ---")

    var isAuthorized = false

    while (!isAuthorized) {
        val smsCode = (1000..9999).random().toString()
        println("Ваш код авторизации: $smsCode")

        print("\nВведите код из SMS: ")
        val userInput = readln()

        if (userInput == smsCode) {
            println("\nАвторизация успешна!")
            println("Добро пожаловать в систему!")
            isAuthorized = true
        } else {
            println("\nНеверный код! Отправляем новый...")
        }
    }
}