package com.example.downloadder.presentation.homescreenviewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.downloadder.domain.EmplyeData
import com.example.downloadder.domain.usecases.UseCases
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class HomeScreenViewModel(private val useCases: UseCases) : ViewModel() {
    fun insertData(emplyeData: EmplyeData) {
        viewModelScope.launch {
            useCases.insertEmployeeData(emplyeData)
        }
    }

    fun deleteData(emplyeData: EmplyeData) {
        viewModelScope.launch {
            useCases.deleteEmployeeData(emplyeData)
        }
    }

    fun updateData(emplyeData: EmplyeData) {
        viewModelScope.launch {
            useCases.updateEmployeeData(emplyeData)
        }
    }

    fun deleteById(id: Int) {
        viewModelScope.launch {
            useCases.deleteById(id)
        }
    }

    fun getAllData(): Flow<List<EmplyeData>> {
        return useCases.getAllData()
    }
}