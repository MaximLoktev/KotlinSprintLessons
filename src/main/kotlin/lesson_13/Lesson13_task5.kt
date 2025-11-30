package lesson_13

fun main() {
    println("\n- Добавление нового контакта -")

    print("Введите имя: ")
    val name = readln()

    print("Введите номер телефона(пример: 89112324343): ")
    val phoneNumberString = readln()

    try {
        val phoneNumber = phoneNumberString.toLong()
        println("Успех: строка преобразована в Long")
    } catch (e: NumberFormatException) {
        println("Ошибка: ${e::class.simpleName} - ${e.message}")
    }
}

class ContactCard3(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printContactInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}")
    }
}