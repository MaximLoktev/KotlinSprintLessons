package lesson_14

import kotlin.math.PI

fun main() {
    val black = "Чёрный"
    val white = "Белый"

    val circle1 = Circle(color = white, 15.0)
    val circle2 = Circle(color = black, 5.0)

    val rectangle1 = Rectangle(color = white, width = 10.0, height = 5.0)
    val rectangle2 = Rectangle(color = black, width = 25.0, height = 15.0)

    val figures = listOf(circle1, circle2, rectangle1, rectangle2)

    val blackPerimeterSum = figures
        .filter { it.color == black }
        .sumOf { it.calculatePerimeter() }

    val whiteAreaSum = figures
        .filter { it.color == white }
        .sumOf { it.calculateArea() }

    println("\nСумма периметров всех черных фигур: ${"%.2f".format(blackPerimeterSum)}")
    println("Сумма площадей всех белых фигур: ${"%.2f".format(whiteAreaSum)}")
}

abstract class Figure(val color: String) {

    abstract fun calculateArea(): Double

    abstract fun calculatePerimeter(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {

    override fun calculateArea() = (PI * radius * radius)

    override fun calculatePerimeter() = (2 * PI * radius)
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {

    override fun calculateArea() = width * height

    override fun calculatePerimeter() = (width + height) * 2
}