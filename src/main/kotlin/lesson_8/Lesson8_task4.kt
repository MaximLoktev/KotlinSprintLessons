package lesson_8

fun main() {
    val ingredients = arrayOf("говядина", "вода", "лук", "морковь", "свёкла")

    println("\nТекущий список ингредиентов: ${ingredients.contentToString()}")

    print("\nКакой ингредиент нужно заменить: ")
    val searchQuery = readln().lowercase()

    val index = ingredients.indexOf(searchQuery)

    if (index != -1) {
        println("\nИнгредиент $searchQuery в рецепте есть")

        print("\nКакой ингредиент нужно добавить: ")
        val newItem = readln().lowercase()

        ingredients[index] = newItem

        println("\nГотово! Вы сохранили следующий список: ${ingredients.contentToString()}")
    } else {
        println("\nТакого ингредиента в рецепте нет")
    }
}