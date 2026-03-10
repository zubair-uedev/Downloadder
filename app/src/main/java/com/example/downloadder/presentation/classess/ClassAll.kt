package com.example.downloadder.presentation.classess

import com.example.downloadder.presentation.functions.detailUser

//fun main() {
//    val obj = AllUser("zubair")
//    obj.user()
//}
//class AllUser(val name: String){
//    fun user(){
//        println("my name is $name")
//    }
//}
data class UserModel(
    val name: String,
    val age: Int,
    val address: String
)

class UserRepository {
    fun loadUsers(): List<UserModel> {
        return listOf(
            UserModel("Ali", 22, "Lahore"),
            UserModel("Zubair", 27, "Burewala"),
            UserModel("Ahmed", 30, "Karachi")
        )
    }
}

sealed class Shape{
    class Circle(val area: Double): Shape()
    class Squire(val length: Double,val width: Double): Shape()
}
fun areaShape(shape: Shape){
    when(shape){
        is Shape.Circle -> println("the ara of circle is ${shape.area}")
        is Shape.Squire -> println("The squire of circle length  ${shape.length} width ${shape.width}")
    }
}
object Singleton{
    fun Singlefn(){
        println("this is singleTon no instance")
    }
}
fun main() {
    val obj = Shape.Circle(6.9)
    areaShape(obj)
    Singleton.Singlefn()
}

