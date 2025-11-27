package lesson_11

fun main() {
    val category = Category(
        id = 1,
        icon = "category.jpg",
        name = "Бургеры",
        description = "Рецепты всех популярных видов бургеров"
    )

    println("\n- Информация о категории -\n${category.getCategoryInfo()}\n")

    category.editCategoryDescription("Новое описание")

    val recipes = listOf(
        Recipe(id = 1, icon = "icon1.png", name = "Чизбургер", portions = 3),
        Recipe(id = 2, icon = "icon2.png", name = "Гамбургер", portions = 5),
        Recipe(id = 3, icon = "icon3.png", name = "БигМак", portions = 1)
    )

    recipes.forEach {
        category.addNewRecipe(it)
    }

    println("\n- Информация о категории -\n${category.getCategoryInfo()}")

    val recipe = category.recipes[0]

    println("\n- Информация о рецепте -\n${recipe.getRecipeInfo()}\n")

    val ingredients = listOf(
        Ingredient(id = 1, name = "Творог", value = "350г"),
        Ingredient(id = 2, name = "Яйцо", value = "2шт"),
        Ingredient(id = 3, name = "Мука", value = "30г")
    )

    ingredients.forEach {
        recipe.addNewIngredient(it)
    }

    println("\n- Информация о рецепте -\n${recipe.getRecipeInfo()}")
}