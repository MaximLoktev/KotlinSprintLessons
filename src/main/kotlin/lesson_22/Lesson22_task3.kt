package lesson_22

fun main() {
    val (title, author, copies) = Book("Дюна", "Фрэнк Герберт", 33)

    println("Название: $title")
    println("Автор: $author")
    println("Кол-во копий: $copies")
}

data class Book(
    val title: String,
    val author: String,
    val copies: Int,
)