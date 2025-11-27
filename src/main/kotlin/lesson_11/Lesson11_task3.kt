package lesson_11

fun main() {
    val gameRoom = VoiceRoom(
        id = 1,
        coverImage = "game_cover.jpg",
        name = "Игровая комната"
    )

    val users = listOf(
        User(id = 1, name = "Max", avatar = "111.jpg", status = UserStatus.SPEAKING),
        User(id = 2, name = "Djon", avatar = "222.jpg", status = UserStatus.MUTED),
        User(id = 3, name = "Alex", avatar = "333.jpg", status = UserStatus.MICROPHONE_OFF)
    )

    users.forEach {
        gameRoom.addParticipant(it)
    }

    gameRoom.updateUserStatus(
        username = users[0].name,
        newStatus = UserStatus.MUTED
    )

    gameRoom.printRoomInfo()
}