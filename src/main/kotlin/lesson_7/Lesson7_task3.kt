package lesson_7

fun main() {
    print("\nВведите число: ")
    val number = readln().toInt()

    print("\nЧётные числа от 0 до $number: ")

    for (i in 0..number step 2) {
        print("$i ")
    }
}