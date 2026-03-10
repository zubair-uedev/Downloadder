package com.example.downloadder.domain.usecases

import com.example.downloadder.domain.repository.TextRepeatRepository

class RepeatTextUseCase(private val textRepeatRepository: TextRepeatRepository) {
    fun execute(
        text: String,
        count: Int
    ): List<String> {

        return textRepeatRepository.repeatText(
            text,
            count
        )

    }

}