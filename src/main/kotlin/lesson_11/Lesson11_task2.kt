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