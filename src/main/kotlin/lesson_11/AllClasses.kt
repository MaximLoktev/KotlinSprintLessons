package lesson_11

class Category(
    val id: Int,
    val icon: String,
    val name: String,
    var description: String,
) {
    val recipes = mutableListOf<Recipe>()

    fun editCategoryDescription(string: String) {
        description = string
        println("Описание категории изменено!")
    }

    fun addNewRecipe(recipe: Recipe) {
        recipes.add(recipe)
        println("В категорию '$name' добавлен новый рецепт '${recipe.name}'")
    }

    fun removeRecipe(recipeName: String) {
        val recipe = recipes.find { it.name == recipeName }

        if (recipe != null) {
            recipes.remove(recipe)
            println("Рецепт '${recipeName}' удалён из категории '$name'")
        } else {
            println("Рецепт '${recipeName}' не найден!")
        }
    }

    fun getCategoryInfo(): String = """
        Идентификатор: $id
        Иконка: $icon
        Название: $name
        Описание: $description
        Кол-во рецептов: ${recipes.size}
    """.trimIndent()
}

class Recipe(
    val id: Int,
    val icon: String,
    val name: String,
    val portions: Int,
) {
    private val ingredients = mutableListOf<Ingredient>()

    fun addNewIngredient(item: Ingredient) {
        ingredients.add(item)
        println("В рецепт '$name' добавлен новый ингредиент '${item.name}'")
    }

    fun removeIngredient(itemName: String) {
        val item = ingredients.find { it.name == itemName }

        if (item != null) {
            ingredients.remove(item)
            println("Ингредиент '${itemName}' удалён из рецепта '$name'")
        } else {
            println("Ингредиент '${itemName}' не найден!")
        }
    }

    fun getRecipeInfo(): String = """
        Идентификатор: $id
        Иконка: $icon
        Название: $name
        Порции: $portions
        Ингредиенты: ${ingredients.map { it.name }}
    """.trimIndent()
}

class Ingredient(
    val id: Int,
    val name: String,
    val value: String,
) {
    fun getIngredientInfo(): String = """
        Идентификатор: $id
        Название: $name
        Кол-во: $value
    """.trimIndent()
}