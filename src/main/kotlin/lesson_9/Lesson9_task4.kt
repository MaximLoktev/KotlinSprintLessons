package lesson_9

private const val NUMBER_OF_INGREDIENTS = 5

fun main() {
    print("Введите $NUMBER_OF_INGREDIENTS ингредиентов через запятую с пробелом (, ): ")
    val input = readln().lowercase()

    val ingredients = input.split(", ")

    if (ingredients.size != NUMBER_OF_INGREDIENTS) {
        println("Ошибка: нужно ввести ровно $NUMBER_OF_INGREDIENTS ингредиентов через ', '")
        return
    }

    val sortedIngredients = ingredients.sorted()

    println("Отсортированный список ингредиентов: $sortedIngredients")
}