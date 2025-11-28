package lesson_11

fun main() {
    val gameRoom = VoiceRoom(
        id = 1,
        coverImage = "game_cover.jpg",
        name = "Игровая комната"
    )

    val members = listOf(
        Member(id = 1, name = "Max", avatar = "111.jpg", status = UserStatus.SPEAKING),
        Member(id = 2, name = "Djon", avatar = "222.jpg", status = UserStatus.MUTED),
        Member(id = 3, name = "Alex", avatar = "333.jpg", status = UserStatus.MICROPHONE_OFF)
    )

    members.forEach {
        gameRoom.addParticipant(it)
    }

    gameRoom.updateUserStatus(
        username = members[0].name,
        newStatus = UserStatus.MUTED
    )

    gameRoom.printRoomInfo()
}

enum class UserStatus(val string: String) {
    SPEAKING("разговаривает"),
    MICROPHONE_OFF("микрофон выключен"),
    MUTED("пользователь заглушен"),
}

class Member(
    val id: Int,
    val name: String,
    val avatar: String,
    var status: UserStatus,
) {
    fun printUserInfo() {
        println("""
            Идентификатор: $id
            Имя: $name
            Аватар: $avatar
            Статус: ${status.string}
        """.trimIndent())
    }

    fun getStatusText(): String = status.string

    fun setNewStatus(value: UserStatus) {
        status = value
        println("Статус изменён!")
    }
}

class VoiceRoom(
    val id: Int,
    val coverImage: String,
    val name: String
) {
    private val participants = mutableListOf<Member>()

    fun addParticipant(user: Member) {
        participants.add(user)
        println("Пользователь '${user.name}' присоединился к комнате '$name'")
    }

    fun updateUserStatus(username: String, newStatus: UserStatus) {
        val user = participants.find { it.name == username }

        if (user != null) {
            user.status = newStatus

            println("\nПользователь '${user.name}' сменил статус на '${newStatus.string}'")
        } else {
            println("Пользователь '$username' не найден в комнате")
        }
    }

    fun printRoomInfo() {
        println("\n- Информация о комнате -")
        println("""
            Идентификатор: $id
            Название: $name
            Обложка: $coverImage
            Участники: ${participants.size}
        """.trimIndent())

        println("\n- Информация об участниках -")

        participants.forEachIndexed { index, user ->
            println("\n- Участник ${index + 1} -")
            user.printUserInfo()
        }
    }
}