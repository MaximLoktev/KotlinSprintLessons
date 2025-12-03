package lesson_15

fun main() {
    val user = User(username = "Макс")
    user.readForum()
    user.writeMessage(message = "Привет всем!")

    val admin = Admin(username = "Андрей")
    admin.readForum()
    admin.writeMessage(message = "Добро пожаловать!")
    admin.deleteMessage(messageId = 2)
    admin.deleteUser(userId = 5)
}

abstract class Member(val username: String) {
    abstract fun readForum()
    abstract fun writeMessage(message: String)
}

class User(username: String) : Member(username) {
    override fun readForum() =
        println("$username читает форум")

    override fun writeMessage(message: String) =
        println("$username пишет: $message")

}

class Admin(username: String) : Member(username) {
    override fun readForum() =
        println("Администратор $username читает форум")

    override fun writeMessage(message: String) =
        println("Администратор $username пишет: $message")

    fun deleteMessage(messageId: Int) =
        println("Администратор $username удалил сообщение #$messageId")

    fun deleteUser(userId: Int) =
        println("Администратор $username удалил пользователя #$userId")
}