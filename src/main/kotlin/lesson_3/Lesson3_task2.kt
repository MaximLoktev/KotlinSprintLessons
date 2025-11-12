package lesson_3

fun main() {
    var lastName = "Андреева"
    val firstName = "Татьяна"
    val patronymic = "Сергеевна"
    var age = 20

    println("$lastName $firstName $patronymic, $age")

    lastName = "Сидорова"
    age = 22

    println("$lastName $firstName $patronymic, $age")
}