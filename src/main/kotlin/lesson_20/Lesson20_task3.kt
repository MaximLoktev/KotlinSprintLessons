package lesson_20

fun main() {
    val checkDoor: (Player) -> String = { player: Player ->
        if (player.hasKey) "Игрок открыл дверь" else "Дверь заперта"
    }

    val playerWithKey = Player(name = "Иван", hasKey = true)

    println(checkDoor(playerWithKey))
}

class Player(val name: String, val hasKey: Boolean)