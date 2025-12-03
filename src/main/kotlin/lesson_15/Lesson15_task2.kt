package lesson_15

fun main() {
    val weatherServer = WeatherServer()
    weatherServer.sendData(
        data = Temperature(stationId = "1", temperature = 35.0)
    )
    weatherServer.sendData(
        data = PrecipitationAmount(stationId = "2", amount = 15.8)
    )
}

abstract class WeatherStationStats(val stationId: String) {
    abstract fun getData(): String
    abstract fun getUnit(): String

    fun getFormattedData(): String {
        return "${getData()} ${getUnit()}"
    }
}

class Temperature(
    stationId: String,
    val temperature: Double,
) : WeatherStationStats(stationId) {

    override fun getData(): String = "%.1f".format(temperature)

    override fun getUnit(): String = "°C"
}

class PrecipitationAmount(
    stationId: String,
    val amount: Double,
    val precipitationType: String = "дождь",
) : WeatherStationStats(stationId) {

    override fun getData(): String = "%.1f".format(amount)

    override fun getUnit(): String = "мм"
}

class WeatherServer {

    fun sendData(data: WeatherStationStats) {
        println("\nПолучены данные со станции №${data.stationId}")

        val dataType = when (data) {
            is Temperature -> "Температура"
            is PrecipitationAmount -> "Осадки"
            else -> ""
        }

        println("$dataType: ${data.getFormattedData()}")
    }
}