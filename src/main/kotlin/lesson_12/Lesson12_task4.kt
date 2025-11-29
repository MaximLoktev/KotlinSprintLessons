package lesson_12

fun main() {
    val firstDay = WeatherData4(
        dayTempKelvin = 293.15,
        nightTempKelvin = 287.15,
        _hasPrecipitation = false,
    )
}

class WeatherData4(
    dayTempKelvin: Double,
    nightTempKelvin: Double,
    _hasPrecipitation: Boolean,
) {
    private val ABSOLUTE_ZERO_CELSIUS = -273.15

    val dayTemp: Int = (dayTempKelvin + ABSOLUTE_ZERO_CELSIUS).toInt()
    val nightTemp: Int = (nightTempKelvin + ABSOLUTE_ZERO_CELSIUS).toInt()
    val hasPrecipitation = _hasPrecipitation

    init {
        printWeatherData(dayOfWeek = "Пятница")
    }

    fun printWeatherData(dayOfWeek: String) {
        val precipitation = if (hasPrecipitation) "Ожидаются осадки" else "Без осадков"

        println("$dayOfWeek: Днём $dayTemp°C, Ночью $nightTemp°C, $precipitation")
    }
}