package lesson_22

fun main() {
    val regularBook1 = RegularBook("Дюна", "Фрэнк Герберт")
    val regularBook2 = RegularBook("Дюна", "Фрэнк Герберт")

    val dataBook1 = DataBook("Дюна", "Фрэнк Герберт")
    val dataBook2 = DataBook("Дюна", "Фрэнк Герберт")

    // В случае class оператор == сравнивает ССЫЛКИ на объекты (адреса в памяти)
    println(regularBook1 == regularBook2)

    // В случае data class оператор == сравнивает СОДЕРЖИМОЕ объектов(значения свойств)
    println(dataBook1 == dataBook2)
}

class RegularBook(val title: String, val author: String)

data class DataBook(val title: String, val author: String)