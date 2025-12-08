package lesson_18

fun main() {
    val order1 = Order("001")
    val order2 = Order("002")

    println("Заказ №${order1.orderNumber}:")
    order1.printInfo("Ноутбук")

    println("\nЗаказ №${order2.orderNumber}:")
    order2.printInfo(listOf("Монитор", "Клавиатура", "Мышь"))
}

class Order(val orderNumber: String) {

    fun printInfo(product: String) {
        println("Заказан товар: $product")
    }

    fun printInfo(products: List<String>) {
        println("Заказаны следующие товары: ${products.joinToString(", ")}")
    }
}