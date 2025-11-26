package lesson_9

private const val NUMBER_OF_INGREDIENTS = 5

fun main() {
    val ingredients = List(NUMBER_OF_INGREDIENTS) { index ->
        print("Введите ингредиент: ")
        readln().lowercase()
    }

    val result = ingredients
        .toSet()
        .sorted()
        .toMutableList()

    if (result.isNotEmpty()) {
        result[0] = result[0].replaceFirstChar { it.uppercase() }
    }

    println("Результат: ${result.joinToString(", ")}")
}