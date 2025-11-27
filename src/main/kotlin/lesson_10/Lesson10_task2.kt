package lesson_10

private const val MIN_LENGTH = 4

fun main() {
    print("Введите логин: ")
    val login = readln()

    print("Введите пароль: ")
    val password = readln()

    println(
        if (isValidCredentials(login) && isValidCredentials(password)) {
            "Добро пожаловать!"
        } else {
            "Логин или пароль недостаточно длинные"
        }
    )
}

fun isValidCredentials(string: String) = string.length >= MIN_LENGTH