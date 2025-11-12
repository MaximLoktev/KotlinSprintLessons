package lesson_4

const val SUNNY_WEATHER = true
const val OPEN_AWNING = true
const val PREFERRED_AIR_HUMIDITY = 20
const val UNFAVORABLE_SEASON = "зима"

fun main() {
    val isSunnyWeather = true
    val isOpenAwning = true
    val currentAirHumidity = 20
    val currentSeason = "зима"

    val result = isSunnyWeather == SUNNY_WEATHER &&
            isOpenAwning == OPEN_AWNING &&
            currentAirHumidity == PREFERRED_AIR_HUMIDITY &&
            currentSeason != UNFAVORABLE_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}