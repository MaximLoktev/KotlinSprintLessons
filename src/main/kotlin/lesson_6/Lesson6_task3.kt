package lesson_6

fun main() {
    println("--- Таймер ---")

    print("Введите время таймера(в секундах): ")
    val numberOfSeconds = readln().toInt()

    var counter = numberOfSeconds

    while (counter > 0) {
        println("Осталось секунд: ${counter--}")
        Thread.sleep(1000)
    }

    println("Время вышло")
}