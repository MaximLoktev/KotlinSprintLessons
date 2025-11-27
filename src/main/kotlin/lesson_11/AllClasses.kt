package lesson_11

class Forum() {
    private var nextUserId = 1

    private val users = mutableListOf<Participant>()

    private val messages = mutableListOf<Message>()

    fun createNewUser(userName: String): Participant {
        val newUser = Participant.Builder()
            .setUserId(nextUserId++)
            .setUserName(userName)
            .build()

        users.add(newUser)
        println("Создан новый пользователь: ${newUser.userName}(ID: ${newUser.userId})")
        return newUser
    }

    fun createNewMessage(authorId: Int, messageText: String) {
        val item = users.find { it.userId == authorId }

        if (item != null) {
            val newMessage = Message.Builder()
                .setAuthorId(authorId)
                .setMessage(messageText)
                .build()

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

class Participant private constructor(
    val userId: Int,
    val userName: String
) {
    class Builder {
        private var userId: Int = 0
        private var userName: String = ""

        fun setUserId(id: Int): Builder = apply { this.userId = id }

        fun setUserName(name: String): Builder = apply { this.userName = name }

        fun build(): Participant = Participant(userId, userName)
    }
}

class Message private constructor(
    val authorId: Int,
    val message: String
) {
    class Builder {
        private var authorId: Int = 0
        private var message: String = ""

        fun setAuthorId(id: Int): Builder = apply { this.authorId = id }

        fun setMessage(text: String): Builder = apply { this.message = text }

        fun build(): Message = Message(authorId, message)
    }
}