package lesson_17

fun main() {
    val secretFolder = Folder(
        _name = "Приветные документы",
        _fileCount = 7,
        isSecret = true,
    )
    println("\nИмя: ${secretFolder.name}")
    println("Количество файлов: ${secretFolder.fileCount}")

    val regularFolder = Folder(
        _name = "Фото",
        _fileCount = 3,
        isSecret = false,
    )
    println("\nИмя: ${regularFolder.name}")
    println("Количество файлов: ${regularFolder.fileCount}")
}

class Folder(
    private val _name: String,
    private val _fileCount: Int,
    private val isSecret: Boolean
) {
    val name: String
        get() = if (isSecret) "скрытая папка" else _name

    val fileCount: Int
        get() = if (isSecret) 0 else _fileCount
}