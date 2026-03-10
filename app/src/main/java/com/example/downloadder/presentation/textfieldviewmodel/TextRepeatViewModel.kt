package com.example.downloadder.presentation.textfieldviewmodel

import androidx.lifecycle.ViewModel
import com.example.downloadder.domain.usecases.RepeatTextUseCase
import com.example.downloadder.presentation.RepeatUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class TextRepeatViewModel(private val useCase: RepeatTextUseCase) : ViewModel() {
    private val _state = MutableStateFlow(RepeatUiState())

    val state: StateFlow<RepeatUiState> = _state

    fun updateText(value: String) {
        _state.update { current ->
            current.copy(
                text = value
            )
        }
    }

    //count
    fun updateCount(value: String) {

        _state.update { current ->

            current.copy(
                count = value
            )

        }

    }

    //update check
    fun updateCheck(value: Boolean) {
        _state.update { current ->
            current.copy(
                isNewLine = value
            )
        }
    }

    fun generateText() {
        val currentState = _state.value
        val number = currentState.count.toIntOrNull() ?: 0
        val list = useCase.execute(
            currentState.text,
            number
        )
        _state.update { current ->

            current.copy(
                result = list
            )

        }
    }

}