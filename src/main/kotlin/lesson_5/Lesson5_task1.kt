package lesson_5

fun main() {
    val firstNumber = 7
    val secondNumber = 5

    val result = firstNumber + secondNumber

    println("Докажите, что вы не бот! Решите пример: $firstNumber + $secondNumber = ?")
    print("Введите ответ: ")
    val inputResult = readln().toInt()

    val isSuccess = result == inputResult

    val string = if (isSuccess) "Добро пожаловать!" else "Доступ запрещен."

    println(string)
}