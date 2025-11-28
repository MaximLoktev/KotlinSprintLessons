package lesson_11

fun main() {
    val firstUser = User(
        id = 1,
        login = "user1",
        password = "qwerty1",
        email = "user1@mail.com",
    )

    val secondUser = User(
        id = 2,
        login = "user2",
        password = "qwerty2",
        email = "user2@mail.com",
    )

    println("\nПервый пользователь")
    println("Идентификатор: ${firstUser.id}")
    println("Логин: ${firstUser.login}")
    println("Пароль: ${firstUser.password}")
    println("Почта: ${firstUser.email}")

    println("\nВторой пользователь")
    println("Идентификатор: ${secondUser.id}")
    println("Логин: ${secondUser.login}")
    println("Пароль: ${secondUser.password}")
    println("Почта: ${secondUser.email}")
}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)