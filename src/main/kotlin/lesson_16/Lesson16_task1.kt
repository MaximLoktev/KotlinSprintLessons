package lesson_16

fun main() {
    val dice = Dice()
    dice.showValue()
}

class Dice {
    private val value = (1..6).random()

    fun showValue() {
        println("На кубике выпало: $value")
    }
}