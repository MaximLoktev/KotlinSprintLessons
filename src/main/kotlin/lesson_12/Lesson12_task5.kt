package lesson_12

import kotlin.random.Random

fun main() {
    val numberOfDays = 30
    val dayTempRangeKelvin = 288..308 // 15°C to 35°C в Кельвинах
    val nightTempRangeKelvin = 278..293 // 5°C to 20°C в Кельвинах

    val weatherData = List(numberOfDays) {
        WeatherData4(
            dayTempKelvin = dayTempRangeKelvin.random(),
            nightTempKelvin = nightTempRangeKelvin.random(),
            _hasPrecipitation = Random.nextBoolean()
        )
    }

    val dayTempList = weatherData.map { it.dayTemp }
    val nightTempList = weatherData.map { it.nightTemp }

    val averageDayTemp = dayTempList.average().toInt()
    val averageNightTemp = nightTempList.average().toInt()

    val daysWithPrecipitation = weatherData.count { it.hasPrecipitation }

    println("\n- Статистика за $numberOfDays дней -")
    println("Средняя дневная температура: $averageDayTemp°C")
    println("Средняя ночная температура: $averageNightTemp°C")
    println("Дней с осадками: $daysWithPrecipitation")
}

private const val ABSOLUTE_ZERO_CELSIUS = -273

class WeatherData4(
    dayTempKelvin: Int,
    nightTempKelvin: Int,
    _hasPrecipitation: Boolean,
) {
    val dayTemp = dayTempKelvin + ABSOLUTE_ZERO_CELSIUS
    val nightTemp = nightTempKelvin + ABSOLUTE_ZERO_CELSIUS
    val hasPrecipitation = _hasPrecipitation

    init {
        printWeatherData()
    }

    fun printWeatherData() {
        val precipitation = if (hasPrecipitation) "Ожидаются осадки" else "Без осадков"

        println("Днём $dayTemp°C, Ночью $nightTemp°C, $precipitation")
    }
}