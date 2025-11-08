package org.example.lesson_1

fun main() {
    val totalSeconds: Short = 6480

    val secondsInOneHour = 60 * 60

    val hours = totalSeconds / secondsInOneHour

    val remainingSecondsAfterHours = totalSeconds % (hours * secondsInOneHour)

    val minutes = remainingSecondsAfterHours / 60

    val seconds = remainingSecondsAfterHours % 60

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}