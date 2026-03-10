package com.example.downloadder.data.repositoryimplement

import com.example.downloadder.data.dao.EmployeeDao
import com.example.downloadder.domain.EmplyeData
import com.example.downloadder.domain.repository.RepositoryInterface
import kotlinx.coroutines.flow.Flow

class RepositoryImplement(private val employeeDao: EmployeeDao) : RepositoryInterface {
    override suspend fun insert(emplyeData: EmplyeData) {
        employeeDao.insertDataEmployee(emplyeData)
    }

    override suspend fun delete(emplyeData: EmplyeData) {
        employeeDao.deleteDataEmployee(emplyeData)
    }

    override suspend fun update(emplyeData: EmplyeData) {
        employeeDao.updateDataEmployee(emplyeData)
    }

    override fun getAllData(): Flow<List<EmplyeData>> {
        return employeeDao.getAllUser()
    }

    override suspend fun deleteData(id: Int) {
        employeeDao.deleteId(id)
    }



}