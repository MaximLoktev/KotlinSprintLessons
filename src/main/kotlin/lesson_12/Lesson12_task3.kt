package lesson_12

fun main() {
    val firstDay = WeatherData3(
        dayTempKelvin = 293,
        nightTempKelvin = 287,
        _hasPrecipitation = false,
    )
    firstDay.printWeatherData("Среда")
}

private const val ABSOLUTE_ZERO_CELSIUS = -273

class WeatherData3(
    dayTempKelvin: Int,
    nightTempKelvin: Int,
    _hasPrecipitation: Boolean,
) {
    val dayTemp = dayTempKelvin + ABSOLUTE_ZERO_CELSIUS
    val nightTemp = nightTempKelvin + ABSOLUTE_ZERO_CELSIUS
    val hasPrecipitation = _hasPrecipitation

    fun printWeatherData(dayOfWeek: String) {
        val precipitation = if (hasPrecipitation) "Ожидаются осадки" else "Без осадков"

        println("$dayOfWeek: Днём $dayTemp°C, Ночью $nightTemp°C, $precipitation")
    }
}