package lesson_16

fun main() {
    val circle = Circle(13.0)
    println("Длина окружности: ${circle.getCircumference()}")
    println("Площадь круга: ${circle.getArea()}")
}

private const val PI = 3.14

class Circle(private val radius: Double) {

    fun getCircumference(): Double = 2 * PI * radius

    fun getArea(): Double = PI * radius * radius
}