package com.example.downloadder.domain.repository

import com.example.downloadder.domain.EmplyeData
import kotlinx.coroutines.flow.Flow

interface RepositoryInterface {
    suspend fun insert(emplyeData: EmplyeData)
    suspend fun delete(emplyeData: EmplyeData)
    suspend fun update(emplyeData: EmplyeData)
    fun getAllData(): Flow<List<EmplyeData>>
    suspend fun deleteData(id: Int)

}