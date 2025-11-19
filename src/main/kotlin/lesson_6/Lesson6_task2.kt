package lesson_6

fun main() {
    println("--- Таймер ---")

    print("Введите время таймера(в секундах): ")
    val numberOfSeconds = readln().toLong()

    Thread.sleep(numberOfSeconds * 1000)

    println("Прошло $numberOfSeconds секунд")
}