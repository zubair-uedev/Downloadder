package com.example.downloadder.presentation.loops

fun main() {
//    for (i in 1..5){
//        println("i : $i")
//    }
    val list = listOf<String>("zubair", "Ali", "Ahmad", "safyan")
    println(list[0])
    for (i in list) {
        println(i)
    }
}