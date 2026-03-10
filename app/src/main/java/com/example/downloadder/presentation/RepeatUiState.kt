package com.example.downloadder.presentation

data class RepeatUiState(

    val text: String = "",
    val count: String = "",
    val isNewLine: Boolean = true,
    val result: List<String> = emptyList()

)
