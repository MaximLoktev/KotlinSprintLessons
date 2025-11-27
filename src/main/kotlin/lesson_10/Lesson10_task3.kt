package lesson_10

fun main() {
    print("Введите желаемую длинну пароля: ")
    val length = readln().toInt()

    println("Сгенерированный пароль: ${passwordGeneration(length)}")
}

fun passwordGeneration(length: Int): String {
    val digits = 0..9
    val specialChars = ' '..'/'

    var buildString = ""

    for (i in 0 until length) {
        buildString += if (i % 2 == 0) digits.random() else specialChars.random()
    }

    return buildString
}