package lesson_16

fun main() {
    val user = User("admin", "qwerty123")

    val input1 = "qwerty123"
    val input2 = "wrongpass"

    println("Пароль '$input1': ${user.validatePassword(input1)}")
    println("Пароль '$input2': ${user.validatePassword(input2)}")
}

class User(
    private val login: String,
    private val password: String,
) {
    fun validatePassword(inputPassword: String): Boolean =
        password == inputPassword
}