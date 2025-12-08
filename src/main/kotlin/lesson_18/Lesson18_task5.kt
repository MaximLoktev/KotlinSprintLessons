package lesson_18

fun main() {
    val screen = Screen()

    println(screen.drawCircle(10, 20))
    println(screen.drawSquare(5, 15))
    println(screen.drawPoint(0, 0))

    println(screen.drawCircle(10.5f, 20.3f))
    println(screen.drawSquare(5.7f, 15.2f))
    println(screen.drawPoint(0.0f, 0.0f))
}

class Screen {
    fun drawCircle(x: Int, y: Int): String =
        "Нарисован круг в координатах ($x, $y)"

    fun drawCircle(x: Float, y: Float): String =
        "Нарисован круг в координатах (${"%.1f".format(x)}, ${"%.1f".format(y)})"

    fun drawSquare(x: Int, y: Int): String =
        "Нарисован квадрат в координатах ($x, $y)"

    fun drawSquare(x: Float, y: Float): String =
        "Нарисован квадрат в координатах (${"%.1f".format(x)}, ${"%.1f".format(y)})"

    fun drawPoint(x: Int, y: Int): String =
        "Нарисована точка в координатах ($x, $y)"

    fun drawPoint(x: Float, y: Float): String =
        "Нарисована точка в координатах (${"%.1f".format(x)}, ${"%.1f".format(y)})"
}