package lesson_15

fun main() {
    println("\n--- Перевозка 6 человек и 2 тонн груза ---")

    val truck = Truck()
    truck.loadCargo(2)
    truck.loadPassengers(1)

    val car1 = Car()
    car1.loadPassengers(3)

    val car2 = Car()
    car2.loadPassengers(3)

    truck.move()
    car1.move()
    car2.move()

    truck.unloadCargo(2)
    truck.unloadPassengers(1)
    car1.unloadPassengers(3)
    car2.unloadPassengers(3)
}

interface Movable {
    fun move()
}

interface PassengerTransport {
    val maxPassengers: Int
    var currentPassengers: Int

    fun loadPassengers(count: Int)
    fun unloadPassengers(count: Int)
}

interface CargoTransport {
    val maxCargo: Int
    var currentCargo: Int

    fun loadCargo(weight: Int)
    fun unloadCargo(weight: Int)
}

class Truck : Movable, PassengerTransport, CargoTransport {
    override val maxPassengers = 1
    override var currentPassengers = 0

    override val maxCargo = 2
    override var currentCargo = 0

    override fun move() {
        println("Грузовик едет с $currentPassengers пассажирами и $currentCargo т груза")
    }

    override fun loadPassengers(count: Int) {
        if (currentPassengers + count <= maxPassengers) {
            currentPassengers += count
            println("Посажено $count пассажиров в грузовик")
        } else {
            println("Нельзя посадить $count пассажиров, максимум $maxPassengers")
        }
    }

    override fun unloadPassengers(count: Int) {
        if (currentPassengers - count >= 0) {
            currentPassengers -= count
            println("Высажено $count пассажиров из грузовика")
        }
    }

    override fun loadCargo(weight: Int) {
        if (currentCargo + weight <= maxCargo) {
            currentCargo += weight
            println("Загружено $weight т груза в грузовик")
        } else {
            println("Нельзя загрузить $weight т, максимум $maxCargo")
        }
    }

    override fun unloadCargo(weight: Int) {
        if (currentCargo - weight >= 0) {
            currentCargo -= weight
            println("Разгружено $weight т груза из грузовика")
        }
    }
}

class Car : Movable, PassengerTransport {
    override val maxPassengers = 3
    override var currentPassengers = 0

    override fun move() {
        println("Легковой автомобиль едет с $currentPassengers пассажирами")
    }

    override fun loadPassengers(count: Int) {
        if (currentPassengers + count <= maxPassengers) {
            currentPassengers += count
            println("Посажено $count пассажиров в легковой автомобиль")
        } else {
            println("Нельзя посадить $count пассажиров, максимум $maxPassengers")
        }
    }

    override fun unloadPassengers(count: Int) {
        if (currentPassengers - count >= 0) {
            currentPassengers -= count
            println("Высажено $count пассажиров из легкового автомобиля")
        }
    }
}