package lesson_19

fun main() {
    val product1 = Product("Футболка", 1, Category.CLOTHING)
    val product2 = Product("Ручка шариковая", 2, Category.STATIONERY)
    val product3 = Product("Настольная лампа", 3, Category.OTHER)

    println("\nИнформация о товарах:")
    product1.printInfo()
    product2.printInfo()
    product3.printInfo()
}

enum class Category {
    CLOTHING,
    STATIONERY,
    OTHER;

    fun getDisplayName(): String = when (this) {
        CLOTHING -> "Одежда"
        STATIONERY -> "Канцелярские товары"
        OTHER -> "Разное"
    }
}

class Product(
    val name: String,
    val id: Int,
    val category: Category
) {
    fun printInfo() {
        println("Товар: $name")
        println("ID: $id")
        println("Категория: ${category.getDisplayName()}")
        println("---")
    }
}