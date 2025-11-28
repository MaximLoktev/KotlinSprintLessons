package lesson_11

fun main() {
    val forum = Forum()

    val firstUser = forum.createNewUser(userName = "Max")
    val secondUser = forum.createNewUser(userName = "Alex")

    forum.createNewMessage(authorId = firstUser.userId, messageText = "Привет!")
    forum.createNewMessage(authorId = firstUser.userId, messageText = "Добро пожаловать!")

    forum.createNewMessage(authorId = secondUser.userId, messageText = "Здравствуй")
    forum.createNewMessage(authorId = secondUser.userId, messageText = "Спасибо")

    forum.printThread()
}

class Forum {
    private var nextUserId = 1

    private val users = mutableListOf<Participant>()

    private val messages = mutableListOf<Message>()

    fun createNewUser(userName: String): Participant {
        val newUser = Participant(nextUserId++, userName)
        users.add(newUser)
        println("Создан новый пользователь: ${newUser.userName}(ID: ${newUser.userId})")
        return newUser
    }

    fun createNewMessage(authorId: Int, messageText: String) {
        val item = users.find { it.userId == authorId }

        if (item != null) {
            val newMessage = Message(authorId, messageText)
            messages.add(newMessage)
            println("Сообщение '$messageText' отправлено от пользователя ID $authorId")
        } else {
            println("Участник с ID $authorId не обнаружен!")
        }
    }

    fun printThread() {
        if (messages.isEmpty()) {
            println("Пока нет сообщений")
            return
        }

        messages.forEach { message ->
            val author = users.find { it.userId == message.authorId }
            val authorName = author?.userName ?: "Неизвестный пользователь"
            println("$authorName: ${message.message}")
        }
    }
}

class Participant(
    val userId: Int,
    val userName: String
)

class Message(
    val authorId: Int,
    val message: String
)