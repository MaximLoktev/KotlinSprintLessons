package lesson_15

fun main() {
    val crucian = Carp()
    crucian.swim()

    val seagull = Seagull()
    seagull.fly()

    val duck = Duck()
    duck.fly()
    duck.swim()
}

interface Flying {
    fun fly()
}

interface Swimming {
    fun swim()
}

class Carp : Swimming {
    override fun swim() = println("Карп умеет плавать")
}

class Seagull : Flying {
    override fun fly() = println("Чайка умеет летать")
}

class Duck : Flying, Swimming {
    override fun fly() = println("Утра умеет летать")

    override fun swim() = println("Утка умеет плавать")
}