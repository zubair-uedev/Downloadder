package com.example.downloadder.presentation.nulsafty

fun main() {
//    val num: String? = null
//    println(num?.length)
    val name: String? = "zr"
    val name1: String? = null
    val value = name1?:  1
    val value1 = name?:  1
    println(value)
    println(value1)
//    val obj: Any = 20
//    val valueS: String? = obj as? String
//    println(valueS)
    val obj : Any = "zubair"
    val valueS: Int? = obj as? Int
    println(valueS)
}