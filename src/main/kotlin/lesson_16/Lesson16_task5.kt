package lesson_16

fun main() {
    val player = Player(name = "Воин", health = 100, attackPower = 20)

    println("\n- Начало боя! -")

    println("""
        Имя: ${player.name}
        Здоровье: ${player.getHealth()}
        Сила удара: ${player.getAttackPower()}
        
    """.trimIndent())

    player.takeDamage(80)
    player.heal(20)
    player.takeDamage(50)
    player.heal(10)
    player.takeDamage(10)

    println("\nИтог:")
    println("${player.name}: ${player.isAlive()}")
    println("Здоровье: ${player.getHealth()}")
    println("Сила удара: ${player.getAttackPower()}")
}

class Player(
    val name: String,
    private var health: Int,
    private var attackPower: Int,
) {

    fun takeDamage(damage: Int) {
        if (health <= 0) {
            println("$name мёртв и не может получать урон")
            return
        }

        health -= damage

        if (health <= 0) {
            die()
            println("$name получил смертельные $damage урона и погиб!")
        } else {
            println("$name получил $damage урона. Здоровье: $health")
        }
    }

    fun heal(healAmount: Int) {
        if (health <= 0) {
            println("$name мёртв и не может лечиться")
            return
        }

        health += healAmount
        println("$name восстановил $healAmount здоровья. Здоровье: $health")
    }

    private fun die() {
        health = 0
        attackPower = 0
    }

    fun getHealth(): Int = health

    fun getAttackPower(): Int = attackPower

    fun isAlive(): String = if (health <= 0) "мёртв" else "жив"
}