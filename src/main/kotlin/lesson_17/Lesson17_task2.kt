package lesson_17

fun main() {
    val ship = Ship(
        name = "Аврора",
        averageSpeed = 15.5,
        homePort = "Севастополь",
    )
    ship.name = "Титаник"
}

class Ship(
    name: String,
    var averageSpeed: Double,
    var homePort: String,
) {
    var name: String = name
        get() = field
        set(value) {
            println("Предупреждение: имя корабля менять нельзя!")
        }
}