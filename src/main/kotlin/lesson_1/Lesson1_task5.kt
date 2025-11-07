package org.example.lesson_1

fun main() {
    val totalSeconds: Short = 6480

    val secondsInOneHour = 60 * 60

    val hours = totalSeconds / secondsInOneHour

    val remainingSecondsAfterHours = totalSeconds % (hours * secondsInOneHour)

    val minutes = remainingSecondsAfterHours / 60

    val seconds = remainingSecondsAfterHours % 60

    val formattedHours = String.format("%02d", hours)
    val formattedMinutes = String.format("%02d", minutes)
    val formattedSeconds = String.format("%02d", seconds)

    println("$formattedHours:$formattedMinutes:$formattedSeconds")
}