package lesson_7

private const val NUMBER_OF_CHARS = 6

fun main() {
    val letters = 'a'..'z'
    val digits = 0..9

    var password = ""

    for (i in 0 until NUMBER_OF_CHARS) {
        password += if (i % 2 == 0) letters.random().toString()
                        else digits.random().toString()
    }

    print("\n")
    println("Генератор шестизначных паролей")
    println("Сгенерированный пароль: $password")
}