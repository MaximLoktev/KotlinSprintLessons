package lesson_22

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}

data class MainScreenState(
    val data: String = "",
    val isLoading: Boolean = false
)

class MainScreenViewModel {
    private var state = MainScreenState()

    fun loadData() {
        println("Состояние 1: $state")

        state = state.copy(isLoading = true)
        println("Состояние 2: $state")

        state = state.copy(
            data = "Данные успешно загружены",
            isLoading = false
        )
        println("Состояние 3: $state")
    }
}