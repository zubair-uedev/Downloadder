package com.example.downloadder.presentation.coditionexpression

fun main() {
//    val age: Int = 10
//    if (age > 10) {
//        println("you have to caste a vote")
//    } else {
//        println("you have not caste a vote")
//    }
//    val marks = readln().toInt()
//    if (marks >= 90) {
//        println("your marks A+")
//    } else if (marks>=70){
//        println("your marks B+")
//    } else if (marks>=50){
//        println("your marks C+")
//    }else{
//        println("your marks below 40")
//    }
//    val a: Int = 10
//    val b: Int = 20
//    val max = if (a>b) a else b
//    println(max)
    //when statement
    val day = readln().toInt()
    when(day){
        1->println("Monday")
        2->println("tuesday")
        else -> println("invalid")
    }

}