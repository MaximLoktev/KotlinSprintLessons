package lesson_12

fun main() {
    val firstDay = WeatherData()
    firstDay.dayTemp = 15.8
    firstDay.nightTemp = 10.1
    firstDay.hasPrecipitation = true

    val secondDay = WeatherData()
    secondDay.dayTemp = 25.3
    secondDay.nightTemp = 19.5
    secondDay.hasPrecipitation = false

    firstDay.printWeatherData("Понедельник")
    secondDay.printWeatherData("Суббота")
}

class WeatherData {
    var dayTemp: Double = 0.0
    var nightTemp: Double = 0.0
    var hasPrecipitation: Boolean = false

    fun printWeatherData(dayOfWeek: String) {
        val precipitation = if (hasPrecipitation) "Ожидаются осадки" else "Без осадков"

        println("$dayOfWeek: Днём ${dayTemp.toInt()}°C, Ночью ${nightTemp.toInt()}°C, $precipitation")
    }
}