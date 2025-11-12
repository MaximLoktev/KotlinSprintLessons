package lesson_4

const val HAS_DAMAGE = false
const val MIN_CREW_COUNT = 55
const val MAX_CREW_COUNT = 70
const val FOOD_BOXES = 50
const val IS_WEATHER_FAVORABLE = true

fun main() {
    print("Есть ли повреждения корпуса (true/false): ")
    val hasDamage = readln().toBoolean()

    print("Текущий состав экипажа: ")
    val crewCount = readln().toInt()

    print("Количество ящиков с провизией: ")
    val foodBoxes = readln().toInt()

    print("Погода благоприятна (true/false): ")
    val isWeatherFavorable = readln().toBoolean()

    val canSail = (
            hasDamage == HAS_DAMAGE &&
            crewCount >= MIN_CREW_COUNT &&
            crewCount <= MAX_CREW_COUNT &&
            foodBoxes > FOOD_BOXES
            ) || (
            hasDamage == !HAS_DAMAGE &&
            crewCount == MAX_CREW_COUNT &&
            foodBoxes >= FOOD_BOXES &&
            isWeatherFavorable == IS_WEATHER_FAVORABLE
            )

    // Вывод результата
    println("Корабль может отправиться в плавание: $canSail")
}