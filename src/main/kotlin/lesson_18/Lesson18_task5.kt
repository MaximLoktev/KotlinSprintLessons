package lesson_18

fun main() {
    val screen = Screen()

    println(screen.draw("круг", 10, 20))
    println(screen.draw("квадрат", 5, 15))
    println(screen.draw("точка", 0, 0))

    println(screen.draw("круг", 10.5f, 20.3f))
    println(screen.draw("квадрат", 5.7f, 15.2f))
    println(screen.draw("точка", 0.0f, 0.0f))
}

class Screen {
    fun draw(shape: String, x: Int, y: Int): String =
        "Нарисован(а) $shape в координатах ($x, $y)"

    fun draw(shape: String, x: Float, y: Float): String =
        "Нарисована(а) $shape в координатах (${"%.1f".format(x)}, ${"%.1f".format(y)})"
}