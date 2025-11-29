package lesson_13

fun main() {
    val contact = ContactInfo(
        name = "Ростислав",
        phoneNumber = 89123456789,
        company = null
    )
    contact.printContactInfo()
}

class ContactInfo(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printContactInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}")
    }
}