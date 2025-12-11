package lesson_21

fun main() {
    val player1 = Player("Воин", 100, 100)
    val player2 = Player("Маг", 50, 100)

    println("${player1.name} здоров: ${player1.isHealthy()}")
    println("${player2.name} здоров: ${player2.isHealthy()}")
}

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

fun Player.isHealthy(): Boolean = currentHealth == maxHealth