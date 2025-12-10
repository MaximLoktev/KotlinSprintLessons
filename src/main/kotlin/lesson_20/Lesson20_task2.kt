package lesson_20

fun main() {
    val healPotion: (Player) -> Unit = { player: Player ->
        player.currentHealth = player.maxHealth
        println("""
            ${player.name} использовал лечебное зелье!
            Здоровье восстановлено полностью!
        """.trimIndent())
    }

    val player = Player("Воин", 30, 100)

    println("\nДо зелья: ${player.name} - ${player.currentHealth}/${player.maxHealth}")
    healPotion(player)
    println("После зелья: ${player.name} - ${player.currentHealth}/${player.maxHealth}")
}

class Player(val name: String, var currentHealth: Int, val maxHealth: Int)