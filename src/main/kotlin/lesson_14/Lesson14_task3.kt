package lesson_14

import kotlin.math.PI


fun main() {
    val black = "Чёрный"
    val white = "Белый"

    val circle1 = Circle(color = white, 15)
    val circle2 = Circle(color = black, 5)

    val rectangle1 = Rectangle(color = white, width = 10, height = 5)
    val rectangle2 = Rectangle(color = black, width = 25, height = 15)

    val figures = listOf(circle1, circle2, rectangle1, rectangle2)

    val blackPerimeterSum = figures
        .filter { it.color == black }
        .sumOf { it.calculatePerimeter() }

    val whiteAreaSum = figures
        .filter { it.color == white }
        .sumOf { it.calculateArea() }

    println("\nСумма периметров всех черных фигур: $blackPerimeterSum")
    println("Сумма площадей всех белых фигур: $whiteAreaSum")
}

abstract class Figure(val color: String) {

    abstract fun calculateArea(): Int

    abstract fun calculatePerimeter(): Int
}

class Circle(
    color: String,
    val radius: Int,
) : Figure(color) {

    override fun calculateArea(): Int = (PI * radius * radius).toInt()

    override fun calculatePerimeter(): Int = (2 * PI * radius).toInt()
}

class Rectangle(
    color: String,
    val width: Int,
    val height: Int,
) : Figure(color) {

    override fun calculateArea(): Int = width * height

    override fun calculatePerimeter(): Int = (width + height) * 2
}