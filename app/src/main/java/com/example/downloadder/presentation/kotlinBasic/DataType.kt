package com.example.downloadder.presentation.kotlinBasic

fun main() {
//    val arrayList: Array<Int> = arrayOf(1,3,4,5,5)
//    val arrayListMiz = arrayOf(1,3,4,5,5,"zuair",true)
//
//    println(arrayList[0])
//    println(arrayListMiz[5])
//    var name: String? = null
//    println("name :$name")
//    name = "zubair"
////    println("name is update:$name")
//    val name = readln("enter your name")
//
//    println(name)
    val mapList = mutableMapOf<Int, String>(1 to "one",2 to "two",3 to "three")
    println(mapList[1])
    println(mapList.get(2))
    println(mapList)
}