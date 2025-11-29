package lesson_12

fun main() {
    val firstDay = WeatherData2(
        dayTemp = 30.1,
        nightTemp = 25.5,
        hasPrecipitation = true
    )
    firstDay.printWeatherData("Вторник")
}

class WeatherData2(
    val dayTemp: Double,
    val nightTemp: Double,
    val hasPrecipitation: Boolean,
) {
    fun printWeatherData(dayOfWeek: String) {
        val precipitation = if (hasPrecipitation) "Ожидаются осадки" else "Без осадков"

        println("$dayOfWeek: Днём ${dayTemp.toInt()}°C, Ночью ${nightTemp.toInt()}°C, $precipitation")
    }
}