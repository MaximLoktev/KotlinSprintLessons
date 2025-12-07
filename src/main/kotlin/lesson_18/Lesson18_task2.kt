package lesson_18

fun main() {
    val diceList: List<Dice> = listOf(D4(), D6(), D8())

    println("Бросаем кости:")
    for (dice in diceList) {
        dice.roll()
    }
}

open class Dice(val sides: Int) {
    open fun roll() {
        val result = (1..sides).random()
        println("Кость D$sides выпало: $result")
    }
}

class D4 : Dice(sides = 4)
class D6 : Dice(sides = 6)
class D8 : Dice(sides = 8)