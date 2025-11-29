package lesson_13

fun main() {
    val phoneBook = listOf(
        ContactCard(name = "Ростислав", phoneNumber = 89123456789, company = "Reddit"),
        ContactCard(name = "Анна", phoneNumber = 89987654321, company = null),
        ContactCard(name = "Максим", phoneNumber = 89775553322, company = "Google"),
        ContactCard(name = "Ольга", phoneNumber = 89551112233, company = null),
        ContactCard(name = "Иван", phoneNumber = 89334445566, company = "null"),
    )
    println(phoneBook.mapNotNull { it.company })
}

class ContactCard(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printContactInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}")
    }
}