package lesson_2

fun main() {
    val startTime: String = "9:39"
    val travelTime: Short = 457

    val (hour: Byte, minutes: Byte) = startTime.split(":").map { it.toByte() }

    val startTimeInMinutes: Int = hour * 60 + minutes

    val arrivalTimeInMinutes: Int = startTimeInMinutes + travelTime

    val arrivalHour = arrivalTimeInMinutes / 60
    val arrivalMinutes = arrivalTimeInMinutes % 60

    println("%02d:%02d".format(arrivalHour, arrivalMinutes))
}