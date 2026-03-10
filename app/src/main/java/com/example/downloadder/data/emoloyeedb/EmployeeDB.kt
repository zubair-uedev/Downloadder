package com.example.downloadder.data.emoloyeedb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.downloadder.data.dao.EmployeeDao
import com.example.downloadder.domain.EmplyeData

//@Database(entities = [EmplyeData::class], version = 1, exportSchema = false)
//abstract class EmployeeDB : RoomDatabase() {
//    abstract fun employeeDao(): EmployeeDao
//}
@Database(entities = [EmplyeData::class], version = 1)
abstract class EmployeeDB : RoomDatabase() {
    abstract fun employeeDao(): EmployeeDao
}