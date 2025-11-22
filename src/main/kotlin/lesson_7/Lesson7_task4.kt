package lesson_7

fun main() {
    print("\nВведите количество секунд для таймера: ")
    val seconds = readln().toInt()

    println("\nТаймер запущен")

    for (i in seconds downTo 1) {
        println("Осталось: $i сек")
        Thread.sleep(1000)
    }

    println("Время вышло")
}