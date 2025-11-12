package lesson_2

const val TIME_INTERVAL = 60

fun main() {
    val startTime: String = "9:39"
    val travelTime: Int = 457

    val (hour: Int, minutes: Int) = startTime.split(":").map { it.toInt() }

    val startTimeInMinutes = hour * TIME_INTERVAL + minutes

    val arrivalTimeInMinutes = startTimeInMinutes + travelTime

    val arrivalHour = arrivalTimeInMinutes / TIME_INTERVAL
    val arrivalMinutes = arrivalTimeInMinutes % TIME_INTERVAL

    println("%02d:%02d".format(arrivalHour, arrivalMinutes))
}