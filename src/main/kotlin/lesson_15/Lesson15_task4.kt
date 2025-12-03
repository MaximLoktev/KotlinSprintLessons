package lesson_15

abstract class Product(
    val name: String,
    val count: Int,
)

interface Searchable {
    fun search(query: String)
}

class Tools(name: String, count: Int) : Product(name, count), Searchable {

    override fun search(query: String) =
        println("Выполняется поиск")
}

class Accessories(name: String, count: Int) : Product(name, count)