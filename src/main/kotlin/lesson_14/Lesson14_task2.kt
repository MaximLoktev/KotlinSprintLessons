package lesson_14

fun main() {
    val liner = Liner2()
    val icebreaker = Icebreaker2()
    val cargoShip = CargoShip2()

    val ships = listOf(liner, icebreaker, cargoShip)

    ships.forEach {
        it.displayInfo()
        it.load()
    }
}

open class Liner2(
    val type: String = "Лайнер",
    val maxSpeed: Int = 50,
    val passengerCapacity: Int = 100,
    val cargoCapacity: Int = 50,
) {
    open fun load() {
        println("\nВыдвигает горизонтальный трап со шкафута")
    }

    open fun displayInfo() {
        println("\nТип: $type")
        println("Макс. скорость: $maxSpeed узлов")
        println("Вместимость: $passengerCapacity пассажиров")
        println("Грузоподъемность: $cargoCapacity тонн")
    }
}

class Icebreaker2(
    val canBreakIce: Boolean = true
) : Liner2(
    type = "Ледокол",
    maxSpeed = 30,
    passengerCapacity = 50,
) {
    override fun load() {
        println("\nАктивирует погрузочный кран")
    }

    override fun displayInfo() {
        super.displayInfo()
        println("Может разбивать лёд")
    }
}

class CargoShip2 : Liner2(
    type = "Грузовой корабль",
    maxSpeed = 10,
    passengerCapacity = 50,
    cargoCapacity = 1000,
) {
    override fun load() {
        println("\nОткрывает ворота со стороны кормы")
    }
}