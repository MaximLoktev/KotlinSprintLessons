package lesson_16

class Order(
    val orderNumber: String,
    private var status: String,
) {

    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun requestStatusChange(newStatus: String) {
        changeStatus(newStatus)
        println("Статус изменён успешно")
    }

    fun getStatus(): String = status
}

fun main() {
    val order = Order(orderNumber = "123", status = "Новый")

    println("Текущий статус заказа: ${order.getStatus()}")

    order.requestStatusChange("В обработке")

    println("Новый статус заказа: ${order.getStatus()}")
}