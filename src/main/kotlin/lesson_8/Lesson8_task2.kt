package lesson_8

fun main() {
    val ingredients = arrayOf("говядина", "вода", "лук", "морковь", "свёкла", "картофель", "капуста")

    print("\nВведите название ингредиента: ")
    val searchQuery = readln().lowercase()

    for (i in ingredients) {
        if (i == searchQuery) {
            println("\nИнгредиент $searchQuery в рецепте есть")
            return
        }
    }
    println("\nТакого ингредиента в рецепте нет")
}