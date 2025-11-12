package lesson_2

fun main() {
    val buff: Int = 20

    val ironOre: Int = 7
    val crystalOre: Int = 11

    val bonusIronOre = ironOre * buff / 100
    val bonusCrystalOre = crystalOre * buff / 100

    println("Кол-во бонусной железной руды: $bonusIronOre")
    println("Кол-во бонусной кристаллической руды: $bonusCrystalOre")
}