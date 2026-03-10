//package com.example.downloadder.di
//
//import com.example.downloadder.data.repositoryimplement.TextRepeatRepositoryImpl
//import com.example.downloadder.domain.repository.TextRepeatRepository
//import com.example.downloadder.domain.usecases.RepeatTextUseCase
//import com.example.downloadder.presentation.textfieldviewmodel.TextRepeatViewModel
//import org.koin.androidx.viewmodel.dsl.viewModel
//import org.koin.dsl.module
//
////val domainModule = module {
////    factory {
////        UseCases(get())
////    }
////}
//val DomainModule = module {
//    // factory { UseCases(get()) }
//    single<TextRepeatRepository> { TextRepeatRepositoryImpl() }
//
//    single {
//        RepeatTextUseCase(get())
//    }
//    viewModel {
//        TextRepeatViewModel(get())
//    }
//}
package com.example.downloadder.di

import com.example.downloadder.data.repositoryimplement.TextRepeatRepositoryImpl
import com.example.downloadder.domain.repository.TextRepeatRepository
import com.example.downloadder.domain.usecases.RepeatTextUseCase
import com.example.downloadder.presentation.textfieldviewmodel.TextRepeatViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single<TextRepeatRepository> {
        TextRepeatRepositoryImpl()
    }

    factory {
        RepeatTextUseCase(get())
    }

    viewModel {
        TextRepeatViewModel(get())
    }

}