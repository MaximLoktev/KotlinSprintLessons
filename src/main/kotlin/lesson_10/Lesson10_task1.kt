package lesson_10

fun main() {
    val humanResult = rollOfDice()
    println("Человек бросил кубик и выпало $humanResult")

    val robotResult = rollOfDice()
    println("Робот бросил кубик и выпало $robotResult")

    println(
        when {
            humanResult > robotResult -> "Победило человечество"
            robotResult > humanResult -> "Победила машина"
            else -> "Победила дружба"
        }
    )
}

private fun rollOfDice(): Int = (1..6).random()