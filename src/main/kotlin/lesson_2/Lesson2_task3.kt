package lesson_2

fun main() {
    val startTime: String = "9:39"
    val travelTime: Int = 457

    val timeInterval: Int = 60

    val (hour: Int, minutes: Int) = startTime.split(":").map { it.toInt() }

    val startTimeInMinutes = hour * timeInterval + minutes

    val arrivalTimeInMinutes = startTimeInMinutes + travelTime

    val arrivalHour = arrivalTimeInMinutes / timeInterval
    val arrivalMinutes = arrivalTimeInMinutes % timeInterval

    println("%02d:%02d".format(arrivalHour, arrivalMinutes))
}