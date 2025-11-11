package lesson_4

const val PREFERRED_AIR_HUMIDITY = 20
const val UNFAVORABLE_SEASON = "зима"

fun main() {
    val isSunnyWeather = true
    val isOpenAwning = true
    val currentAirHumidity = 20
    val currentSeason = "зима"

    val result = isSunnyWeather && isOpenAwning && currentAirHumidity == PREFERRED_AIR_HUMIDITY && currentSeason != UNFAVORABLE_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}