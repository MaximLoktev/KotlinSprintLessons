package lesson_17

fun main() {
    val secretFolder = Folder(
        _name = "Приветные документы",
        fileCount = 7,
        isSecret = true,
    )
    println("\nИмя: ${secretFolder.name}")

    val regularFolder = Folder(
        _name = "Фото",
        fileCount = 3,
        isSecret = false,
    )
    println("Имя: ${regularFolder.name}")
}

class Folder(
    private val _name: String,
    private val fileCount: Int,
    private val isSecret: Boolean
) {
    val name: String
        get() = if (isSecret) {
            "Cкрытая папка, количество файлов – 0"
        } else {
            "$_name, количество файлов – $fileCount"
        }
}