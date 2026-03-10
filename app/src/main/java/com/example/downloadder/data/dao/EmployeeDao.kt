package com.example.downloadder.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.downloadder.domain.EmplyeData
import kotlinx.coroutines.flow.Flow

@Dao
interface EmployeeDao {
    @Insert
    suspend fun insertDataEmployee(emplyeData: EmplyeData)

    @Delete
    suspend fun deleteDataEmployee(emplyeData: EmplyeData)

    @Update
    suspend fun updateDataEmployee(emplyeData: EmplyeData)

    @Query("DELETE FROM userTable WHERE id = :id")
    suspend fun deleteId(id: Int)


    @Query("select * from userTable")
    fun getAllUser(): Flow<List<EmplyeData>>

}