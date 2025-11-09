package lesson_2

fun main() {
    val buff: Byte = 20

    val ironOre: Byte = 7
    val crystalOre: Byte = 11

    val bonusIronOre: Int = ironOre * buff / 100
    val bonusCrystalOre: Int = crystalOre * buff / 100

    println("Кол-во бонусной железной руды: $bonusIronOre")
    println("Кол-во бонусной кристаллической руды: $bonusCrystalOre")
}