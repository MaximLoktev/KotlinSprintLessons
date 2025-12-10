package lesson_21

fun main() {
    val skills = mapOf(
        "Сила" to 33,
        "Ловкость" to 75,
        "Интеллект" to 45,
        "Крит" to 75,
    )
    println(skills.maxCategory())
}

fun Map<String, Int>.maxCategory(): String = this.maxBy { it.value }.key