package com.example.downloadder.di

import android.content.Context
import androidx.room.Room
import com.example.downloadder.data.dao.EmployeeDao
import com.example.downloadder.data.emoloyeedb.EmployeeDB
import com.example.downloadder.data.repositoryimplement.RepositoryImplement
import com.example.downloadder.domain.repository.RepositoryInterface
import org.koin.dsl.module

val AppModule = module {
    single { provideDB(get()) }
    single { provideDao(get()) }
    single<RepositoryInterface> { RepositoryImplement(get()) }
}

fun provideDB(context: Context): EmployeeDB {
    val databaseBuilder = Room.databaseBuilder(context, EmployeeDB::class.java, "userdb")
    val userdb = databaseBuilder.build()
    return userdb
}

fun provideDao(db: EmployeeDB): EmployeeDao {
    return db.employeeDao()
}


//val AppModule = module {
//    single { provideDB(get()) }
//    single { provideDao(get()) }
//    single<RepositoryInterface>{ RepositoryImplement(get()) }
//}
//fun provideDB(context: Context): EmployeeDB{
//    val databaseBuilder = Room.databaseBuilder(context, EmployeeDB::class.java,"userdb")
//    val userdb = databaseBuilder.build()
//    return userdb
//}
//fun provideDao(db: EmployeeDB): EmployeeDao{
//    return db.employeeDao()
//}