package lesson_19

fun main() {
    val tank = Tank()

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
    NONE(0),
}

class Tank {
    private var currentAmmo = Ammo.NONE

    fun load(ammo: Ammo) {
        if (ammo == Ammo.NONE) {
            println("Из орудия извлечён снаряд!")
            return
        }
        currentAmmo = ammo
        println("Танк заряжен патронами: ${ammo.name} урон ${ammo.damage}")
    }

    fun shoot() {
        println("Выстрел! Нанесено урона: ${currentAmmo.damage}")
    }
}