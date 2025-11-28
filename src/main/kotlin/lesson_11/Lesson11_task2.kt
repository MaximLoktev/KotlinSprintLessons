package lesson_11

fun main() {
    val user = User2(
        id = 1,
        login = "user1",
        password = "qwerty1",
        email = "user1@mail.com",
    )

    user.setBioFromConsole()
    user.changePassword()
    user.printUserInfo()
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun printUserInfo() {
        println("\n--- ИНФОРМАЦИЯ О ПОЛЬЗОВАТЕЛЕ ---")
        println("""
            Идентификатор: $id
            Логин: $login
            Пароль: $password
            Почта: $email
            О себе: $bio
        """.trimIndent())
    }

    fun setBioFromConsole() {
        print("Расскажите немного о себе: ")
        bio = readln()
    }

    fun changePassword() {
        print("Введите текущий пароль: ")
        val currentPassword = readln()

        if (currentPassword == password) {
            print("Введите новый пароль: ")
            val newPassword = readln()

            password = newPassword
            println("Пароль успешно изменён!")
        } else {
            println("Неверный пароль!")
        }
    }
}