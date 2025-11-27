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