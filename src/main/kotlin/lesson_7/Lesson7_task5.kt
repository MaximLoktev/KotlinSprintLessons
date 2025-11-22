package lesson_7

private const val MIN_PASSWORD_LENGTH = 6

fun main() {
    println("\n--- Генератор сложных паролей ---")

    val lowercase = ('a'..'z')
    val uppercase = ('A'..'Z')
    val digits = ('0'..'9')

    val allChars = lowercase + uppercase + digits

    var passwordLength = 0

    while (passwordLength < MIN_PASSWORD_LENGTH) {
        print("\nВведите длину пароля (минимум 6 символов): ")
        passwordLength = readln().toInt()
    }

    // Гарантируем наличие всех типов символов
    val chars = mutableListOf(
        lowercase.random(),
        uppercase.random(),
        digits.random()
    )

    for (i in 3 until passwordLength) {
        chars.add(allChars.random())
    }

    chars.shuffle()

    println("\nСгенерированный пароль: ${chars.joinToString("")}")
}