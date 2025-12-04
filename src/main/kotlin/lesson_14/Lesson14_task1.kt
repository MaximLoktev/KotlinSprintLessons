package lesson_14

fun main() {
    val liner = Liner()
    val icebreaker = Icebreaker()
    val cargoShip = CargoShip()
}

open class Liner(
    open val maxSpeed: Int = 50,
    open val passengerCapacity: Int = 100,
    open val cargoCapacity: Int = 50,
)

class Icebreaker(
    val canBreakIce: Boolean = true
) : Liner(
    maxSpeed = 30,
    passengerCapacity = 50,
)

class CargoShip : Liner(
    maxSpeed = 10,
    passengerCapacity = 50,
    cargoCapacity = 1000,
)