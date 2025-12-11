package lesson_22

fun main() {
    val regularBook1 = RegularBook2("Дюна", "Фрэнк Герберт")

    val dataBook1 = DataBook2("Дюна", "Фрэнк Герберт")

    /*
        При выводе через println() вызывается метод toString()
        По умолчанию toString() возвращает: имя_класса@хеш_код
    */
    println(regularBook1)

    /*
        Data классы автоматически генерируют метод toString()
        toString() возвращает строку с именами и значениями всех свойств
    */
    println(dataBook1)
}

class RegularBook2(val title: String, val author: String)

data class DataBook2(val title: String, val author: String)