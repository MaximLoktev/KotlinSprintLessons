package lesson_17

fun main() {
    val package1 = Package(number = "PK-001", currentLocation = "Москва")

    println("\nПосылка ${package1.number}")
    println("Начальное местоположение: ${package1.location}")
    println("Кол-во перемещений: ${package1.getMoveCount()}\n")

    package1.location = "Санкт-Петербург"
    package1.location = "Калининград"
    package1.location = "Самара"

    println("\nТекущее местоположение: ${package1.location}")
    println("Всего перемещений: ${package1.getMoveCount()}")
}

class Package(
    val number: String,
    currentLocation: String,
) {
    var location: String = currentLocation
        set(value) {
            moveCount++
            field = value
            println("Посылка перемещена в $value")
        }

    private var moveCount = 0

    fun getMoveCount(): Int = moveCount
}