package lesson_8

fun main() {
    val ingredients = arrayOf("говядина", "вода", "лук", "морковь", "свёкла", "картофель", "капуста")

    print("\nВведите название ингредиента: ")
    val searchQuery = readln().lowercase()

    if (ingredients.contains(searchQuery)) {
        println("\nИнгредиент $searchQuery в рецепте есть")
    } else {
        println("\nТакого ингредиента в рецепте нет")
    }
}