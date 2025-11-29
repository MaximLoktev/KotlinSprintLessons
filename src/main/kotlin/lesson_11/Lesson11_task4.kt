package lesson_11

class Category(
    val id: Int,
    val icon: String,
    val name: String,
    var description: String,
    val recipes: List<Recipe>,
) {

    fun editCategoryDescription(string: String) { }

    fun addNewRecipe(recipe: Recipe) { }

    fun removeRecipe(recipeName: String) { }

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
    val ingredients: List<Ingredient>,
    val cookingMethod: List<String>,
) {

    fun addNewIngredient(item: Ingredient) { }

    fun removeIngredient(itemName: String) { }

    fun getRecipeInfo(): String = """
        Идентификатор: $id
        Иконка: $icon
        Название: $name
        Порции: $portions
        Ингредиенты: ${ingredients.map {
        "${it.name}: ${it.quantity} ${it.unitOfMeasure}"
    }}
        Способ приготовления: $cookingMethod
    """.trimIndent()
}

class Ingredient(
    val id: Int,
    val name: String,
    val quantity: String,
    val unitOfMeasure: String,
) {
    fun getIngredientInfo(): String = """
        Идентификатор: $id
        Название: $name
        Кол-во: $quantity $unitOfMeasure
    """.trimIndent()
}