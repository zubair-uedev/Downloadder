package com.example.downloadder.presentation.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun fetchUser(): String {
    delay(3000)
    return "user data fetched"
}

suspend fun fetchOrder(userData: String): String {
    delay(3000)
    return "fetchOrder from $userData"
}

suspend fun fetchOrderDetail(fetchOrder: String): String {
    return "fetchOrder Detail from $fetchOrder"
}

//fun main() = runBlocking {
//    val userData = fetchUser()
//    println(userData)
//    val fetchOrder = fetchOrder(userData)
//    println(fetchOrder)
//    val fetchDetail = fetchOrderDetail(fetchOrder)
//    println(fetchDetail)
//}
fun main(): kotlin.Unit = runBlocking {

    val launchJob = launch {
        println("Launch start")
        delay(2000)
        println("launch end ")
    }
    val asynchJob = async {
        println("async start")
        delay(2000)
        "async end"
    }
    launchJob.join()
    println(asynchJob.await())
}