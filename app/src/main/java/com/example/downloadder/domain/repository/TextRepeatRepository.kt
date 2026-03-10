package com.example.downloadder.domain.repository

interface TextRepeatRepository {
    fun repeatText(
        text: String,
        count: Int
    ): List<String>

}