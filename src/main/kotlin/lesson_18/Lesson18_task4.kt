package lesson_18

fun main() {
    val boxes: List<Box> = listOf(
        RectangularBox(10.0, 5.0, 3.0),
        CubeBox(4.0),
    )

    boxes.forEach {
        println("Площадь: ${it.surfaceArea()}")
    }
}

abstract class Box {
    abstract fun surfaceArea(): Double
}

class RectangularBox(
    val length: Double,
    val width: Double,
    val height: Double,
) : Box() {
    override fun surfaceArea(): Double {
        return 2 * (length * width + length * height + width * height)
    }
}

class CubeBox(val side: Double) : Box() {
    override fun surfaceArea(): Double = 6 * side * side
}