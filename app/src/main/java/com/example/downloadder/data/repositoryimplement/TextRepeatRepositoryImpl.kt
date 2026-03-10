package com.example.downloadder.data.repositoryimplement

import com.example.downloadder.domain.repository.TextRepeatRepository

class TextRepeatRepositoryImpl : TextRepeatRepository {
    override fun repeatText(
        text: String,
        count: Int
    ): List<String> {
        if (text.isBlank() || count <= 0) {
            return emptyList()
        }

        val list = mutableListOf<String>()

        for (i in 1..count) {

            list.add(text)

        }

        return list

    }
}