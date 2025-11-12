package lesson_3

fun main() {
    val string = "D2-D4;0"

    val (start, end, stepNumber) = string.split("-", ";")

    println(start)
    println(end)
    println(stepNumber)
}