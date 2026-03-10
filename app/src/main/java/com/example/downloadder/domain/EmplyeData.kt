package com.example.downloadder.domain

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "userTable")
data class EmplyeData(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val age: Int,
)
