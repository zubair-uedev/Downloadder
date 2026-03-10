package com.example.downloadder.di

import com.example.downloadder.presentation.homescreenviewmodel.HomeScreenViewModel
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel


//val presentationModule = module {
//    viewModel {
//        HomeScreenViewModel(get())
//    }
//}
val Presentation = module {
    single { HomeScreenViewModel(get()) }
}

