package lesson_10

private const val CORRECT_LOGIN = "admin"
private const val CORRECT_PASSWORD = "qwerty"

fun main() {
    val login = "admin"
    val password = "qwerty"

    val authToken = authorize(login, password)

    println(
        if (authToken != null) getShoppingCart(authToken)
            else "Неудачная авторизация: неверный логин или пароль"
    )
}

private fun authorize(login: String, password: String): String? =
    if (login == CORRECT_LOGIN && password == CORRECT_PASSWORD) generateToken() else null

private fun generateToken(): String {
    val characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    return String(CharArray(32) { characters.random() })
}

private fun getShoppingCart(token: String): List<String> =
    listOf("яблоко", "банан", "апельсин", "груша", "арбуз")