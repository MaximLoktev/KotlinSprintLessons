package lesson_14

fun main() {
    val moon = Satellite(
        name = "Луна",
        hasAtmosphere = false,
        isLandable = true
    )
    val titan = Satellite(
        name = "Титан",
        hasAtmosphere = true,
        isLandable = true
    )

    val earth = Planet(
        name = "Земля",
        hasAtmosphere = true,
        isLandable = true,
        satellites = listOf(moon, titan)
    )
    earth.printPlanetInfo()
}

abstract class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isLandable: Boolean,
)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isLandable: Boolean,
    val satellites: List<Satellite>
) : CelestialBody(name, hasAtmosphere, isLandable) {

    fun printPlanetInfo() {
        println("\nПланета: $name")
        println("Спутники: ${satellites.map { it.name }}")
    }
}

// Класс спутника
class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isLandable: Boolean,
) : CelestialBody(name, hasAtmosphere, isLandable)