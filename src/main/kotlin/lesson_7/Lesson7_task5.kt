package lesson_7

private const val MIN_PASSWORD_LENGTH = 6

fun main() {
    println("\n--- Генератор сложных паролей ---")

    val lowercase = ('a'..'z').toList()
    val uppercase = ('A'..'Z').toList()
    val digits = ('0'..'9').toList()

    val allChars = lowercase + uppercase + digits

    // Гарантируем наличие всех типов символов
    val chars = mutableListOf(
        lowercase.random(),
        uppercase.random(),
        digits.random()
    )

    var isSuccess = false

    while (!isSuccess) {
        print("\nВведите длину пароля (минимум 6 символов): ")
        val passwordLength = readln().toInt()

        if (passwordLength < MIN_PASSWORD_LENGTH) {
            println("\nОшибка: минимальная длина пароля - 6 символов")
            continue
        } else {
            for (i in 3 until passwordLength) {
                chars.add(allChars.random())
            }
            isSuccess = true
        }
    }

    val password = chars.shuffled().joinToString("")
    println("\nСгенерированный пароль: $password")
}