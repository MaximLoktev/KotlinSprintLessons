package lesson_13

fun main() {
    val phoneBook = mutableListOf<ContactCard2>()

    do {
        var answer = "Да"

        println("\n- Добавление нового контакта -")

        print("Введите имя: ")
        val name = readln()

        print("Введите номер телефона(пример: 89112324343): ")
        val phoneNumber = readln().toLongOrNull()

        if (phoneNumber == null) {
            println("\nНеверный формат номера телефона! Контакт не добавлен.")
            continue
        }

        print("Введите название компании(необязательно): ")
        val company = readln().takeIf { it.isNotBlank() }

        phoneBook.add(ContactCard2(name, phoneNumber, company))
        println("\nКонтакт успешно добавлен!")

        print("\nХотите добавить еще один контакт?(да/нет): ")
        answer = readln()

    } while (answer.equals("Да", ignoreCase = true))

    println("\n- Телефонная книга -")
    phoneBook.forEachIndexed { index, contact ->
        println("\nКонтакт ${index + 1}:")
        contact.printContactInfo()
    }
}

class ContactCard2(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printContactInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}")
    }
}