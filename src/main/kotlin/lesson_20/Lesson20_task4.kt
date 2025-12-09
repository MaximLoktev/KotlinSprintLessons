package lesson_20

fun main() {
    val items = listOf("Кнопка", "Ссылка", "Поле", "Чекбокс", "Слайдер")

    val clickActions = items.map { item ->
        { println("Нажат элемент $item") }
    }

    println("Нажимаем четные элементы:")
    clickActions.forEachIndexed { index, action ->
        if ((index + 1) % 2 == 0) {
            action()
        }
    }
}