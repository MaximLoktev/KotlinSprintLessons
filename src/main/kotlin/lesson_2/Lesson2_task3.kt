package lesson_2

fun main() {
    val startTime: String = "9:39"
    val travelTime: Int = 457

    val (hour: Int, minutes: Int) = startTime.split(":").map { it.toInt() }

    val startTimeInMinutes = hour * 60 + minutes

    val arrivalTimeInMinutes = startTimeInMinutes + travelTime

    val arrivalHour = arrivalTimeInMinutes / 60
    val arrivalMinutes = arrivalTimeInMinutes % 60

    println("%02d:%02d".format(arrivalHour, arrivalMinutes))
}