package lesson_18

fun main() {
    val diceList: List<Dice> = listOf(Dice4(), Dice6(), Dice8())

    println("Бросаем кости:")
    for (dice in diceList) {
        dice.roll()
    }
}

abstract class Dice(val sides: Int) {
    fun roll() {
        val result = (1..sides).random()
        println("Кость Dice$sides выпало: $result")
    }
}

class Dice4 : Dice(sides = 4)
class Dice6 : Dice(sides = 6)
class Dice8 : Dice(sides = 8)