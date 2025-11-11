package lesson_4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {
    var currentWeight = 20
    var currentVolume = 80

    println("Груз с весом $currentWeight кг и объемом $currentVolume л соответствует категории 'Average': ${((currentWeight > MIN_WEIGHT && currentWeight <= MAX_WEIGHT) && currentVolume < MAX_VOLUME)}")

    currentWeight = 50
    currentVolume = 100

    println("Груз с весом $currentWeight кг и объемом $currentVolume л соответствует категории 'Average': ${((currentWeight > MIN_WEIGHT && currentWeight <= MAX_WEIGHT) && currentVolume < MAX_VOLUME)}")
}