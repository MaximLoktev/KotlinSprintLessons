package lesson_2

import kotlin.math.pow

fun main() {
    val startBalance: Int = 70_000
    val interestRate: Double = 16.7
    val numberOfYears: Int = 20

    val finalBalance = startBalance * (1 + interestRate / 100).pow(numberOfYears)

    println("%.3f".format(finalBalance))
}