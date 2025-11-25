package lesson_9

fun main() {
    val ingredients = mutableListOf("яблоко", "груша", "апельсин")

    println("В рецепте есть базовые ингредиенты: $ingredients")

    print("Желаете добавить еще? ")
    val answer = readln()

    if (!answer.equals("да", ignoreCase = true)) {
        return
    }

    print("Какой ингредиент вы хотите добавить? ")
    val item = readln().lowercase()

    ingredients.add(item)

    println("Теперь в рецепте есть следующие ингредиенты: $ingredients")
}