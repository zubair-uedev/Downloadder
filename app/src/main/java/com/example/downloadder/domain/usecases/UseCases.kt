package com.example.downloadder.domain.usecases

import com.example.downloadder.domain.EmplyeData
import com.example.downloadder.domain.repository.RepositoryInterface
import kotlinx.coroutines.flow.Flow

class UseCases(private val repositoryInterface: RepositoryInterface) {
    suspend fun insertEmployeeData(emplyeData: EmplyeData) {
        repositoryInterface.insert(emplyeData)
    }

    suspend fun deleteEmployeeData(emplyeData: EmplyeData) {
        repositoryInterface.delete(emplyeData)
    }

    suspend fun updateEmployeeData(emplyeData: EmplyeData) {
        repositoryInterface.update(emplyeData)
    }

    suspend fun deleteById(id: Int) {
        repositoryInterface.deleteData(id)
    }

    fun getAllData(): Flow<List<EmplyeData>> {
        return repositoryInterface.getAllData()
    }
}