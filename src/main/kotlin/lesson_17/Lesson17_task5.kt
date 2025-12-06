package lesson_17

fun main() {
    val user = User(_login = "admin", _password = "qwerty")

    println("\nЧтение логина и пароля:")
    println("Логин: ${user.login}")
    println("Пароль (маскированный): ${user.password}")

    println("\nИзменение пароля:")
    user.password = "newpassword"

    println("\nИзмениние логина:")
    user.login = "moder"

    println("\nИтоговые данные:")
    println("Логин: ${user.login}")
    println("Пароль (маскированный): ${user.password}")
}

class User(
    _login: String,
    _password: String,
) {
    var login: String = _login
        set(value) {
            field = value
            println("Логин успешно изменён!")
        }

    var password: String = _password
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль!")
        }
}