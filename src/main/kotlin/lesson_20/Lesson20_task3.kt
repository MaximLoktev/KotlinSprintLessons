package lesson_20

fun main() {
    val checkDoor: (Player2) -> String = { player: Player2 ->
        if (player.hasKey) "Игрок открыл дверь" else "Дверь заперта"
    }

    val playerWithKey = Player2(name = "Иван", hasKey = true)

    println(checkDoor(playerWithKey))
}

class Player2(val name: String, val hasKey: Boolean)