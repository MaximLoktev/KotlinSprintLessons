package lesson_19

fun main() {
    val ship = Spaceship()
    ship.takeOff()
    ship.land()
    ship.shootAsteroid()
}

class Spaceship {
    fun takeOff() {
        println("Корабль взлетает")
    }

    fun land() {
        // TODO: нужна информация о дополнительной логике
    }

    fun shootAsteroid() {
        TODO("Метод отстрела астероидов еще не реализован")
    }
}