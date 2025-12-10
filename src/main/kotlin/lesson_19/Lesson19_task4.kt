package lesson_19

fun main() {
    val tank = Tank()

    tank.shoot()

    tank.load(Ammo.BLUE)
    tank.shoot()

    tank.load(Ammo.GREEN)
    tank.shoot()

    tank.load(Ammo.RED)
    tank.shoot()
}

enum class Ammo(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank {
    private var currentAmmo: Ammo? = null

    fun load(ammo: Ammo) {
        currentAmmo = ammo
        println("Танк заряжен патронами: ${ammo.name} урон ${ammo.damage}")
    }

    fun shoot() {
        println(if (currentAmmo != null) {
            "Выстрел! Нанесено урона: ${currentAmmo?.damage}"
        } else {
            "Танк не заряжен!"
        })
    }
}