package lesson_14

import java.util.UUID

fun main() {
    val chat = Chat()

    val message1Id = chat.addMessage("Михаил", "Кто-нибудь смотрел новый фильм?")
    chat.addThreadMessage("Петр", "Я смотрел! Очень понравилось", message1Id)
    chat.addThreadMessage("Анна", "А я еще не успела", message1Id)

    chat.addMessage("Георгий", "Ребята, у кого есть ссылка на документацию?")

    val message3Id = chat.addMessage("Иван", "Завтра встреча в 11:00")
    chat.addThreadMessage("Макс", "Я буду!", message3Id)
    chat.addThreadMessage("Елена", "Подтверждаю", message3Id)

    chat.printChat()
}

class Chat {

    private val messages = mutableListOf<Message>()

    fun addMessage(author: String, text: String): String {
        val newMessage = Message(
            author = author,
            text = text,
        )
        messages.add(newMessage)
        return newMessage.id
    }

    fun addThreadMessage(author: String, text: String, parentMessageId: String): String {
        val newThreadMessage = ChildMessage(
            author = author,
            text = text,
            parentMessageId = parentMessageId,
        )
        messages.add(newThreadMessage)
        return newThreadMessage.id
    }

    fun printChat() {
        val groupedMessages = messages.groupBy { message ->
            when (message) {
                is ChildMessage -> message.parentMessageId
                else -> message.id
            }
        }
        groupedMessages.forEach { (parentId, messageGroup) ->
            val parentMessage = messages.find { it.id == parentId }

            if (parentMessage != null) {
                println(parentMessage.display())

                messageGroup.filterIsInstance<ChildMessage>().forEach { childMessage ->
                    println(childMessage.display())
                }
            }
        }
    }
}

open class Message(
    val id: String = UUID.randomUUID().toString(),
    val author: String,
    val text: String,
) {
    open fun display(): String = "\n$author: $text"
}

class ChildMessage(
    author: String,
    text: String,
    val parentMessageId: String,
) : Message(author = author, text = text) {

    override fun display(): String = "\t$author: $text"
}