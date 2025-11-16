package lesson_5

const val BASE_DISTANCE_FOR_CONSUMPTION = 100

fun main() {
    print("Введите расстояние поездки (км): ")
    val distance = readln().toFloat()

    print("Введите расход топлива на 100 км (л): ")
    val fuelConsumption = readln().toFloat()

    print("Введите текущую цену за литр топлива (руб): ")
    val pricePerLiter = readln().toFloat()

    val fuelNeeded = (distance * fuelConsumption) / BASE_DISTANCE_FOR_CONSUMPTION

    val totalCost = fuelNeeded * pricePerLiter

    println("\nРезультаты расчета:")
    println("Общее количество топлива: ${"%.2f".format(fuelNeeded)} л")
    println("Итоговая стоимость поездки: ${"%.2f".format(totalCost)} руб")
}