package com.example.downloadder.presentation.functions


//fun main() {
//    println(sum(4, 3))
//    println(sum(4, 3))
//    detailUser("zubair", 27)
//    var save = addDetail(4)
//    println(save)
//    userDefine("zubair", 27, "burewala")
//    println(num("zubair"))
//    println(numNo(5,9,7))
//    val higher = highOrder("Ahmad"){name->"your name is $name"}
//    println(higher)
//    val userInfo = userDetail("Ahmad","burewala"){name,address->"your name is $name and address $address"}
//    println(userInfo)
//}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun detailUser(a: String, b: Int) {
    println("your name is $a and age: $b")
}

//single line fn
fun addDetail(a: Int) = a * a
fun <T> userDefine(a: T, b: T, address: T) {
    println("your name is $a and your age $b and your address is $address")
}

//lamda fn
//val num:(String)-> String = { name->"whats your name : $name" }
val num: (String) -> String = { it ->
    "I am senior dev $it"
}
val numNo: (Int, Int, Int) -> Int = { a, b, c ->
    a + b + c
}


//higher order fn
fun highOrder(name: String, hight: (String) -> String): String {
    return hight(name)
}

fun userDetail(name: String, address: String, detailAll: (String, String) -> String): String {
    return detailAll(name, address)
}

fun main() {
    val obj1 = SingleInherit()
    obj1.makeSound()
    val obj = InheritOther()
    obj.makeSound()
}

open class SingleInherit() {
    open fun makeSound() {
        println("make sound")
    }
}

class InheritOther : SingleInherit() {
    override fun makeSound() {
        println("Dog is bakrking")
    }
}
