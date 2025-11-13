package lesson_5

fun main() {
    println("--- КАЛЬКУЛЯТОР ИНДЕКСА МАССЫ ТЕЛА ---")

    print("Введите ваш вес в килограммах: ")
    val weight = readln().toDouble()

    print("Введите ваш рост в сантиметрах: ")
    val heightCm = readln().toDouble()

    val heightM = heightCm / 100

    val bmi = weight / (heightM * heightM)

    val category = when {
        bmi < 18.5 -> "Недостаточная масса тела"
        bmi < 25 -> "Нормальная масса тела"
        bmi < 30 -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("-----------------------------------")
    println("""
        РЕЗУЛЬТАТЫ РАСЧЕТА:
        Ваш вес: ${"%.1f".format(weight)} кг
        Ваш рост: ${"%.1f".format(heightCm)} см
        Индекс массы тела: ${"%.2f".format(bmi)}
        Категория: $category
    """.trimIndent())
}