package com.example.downloadder.presentation.oop

//fun main() {
//    val use = User()
//    use.userDetail()
//    use.start()
//    val bird = Bird()
//    bird.start()
//    bird.fly()
//    val user = UserScreeDetail()
//    user.name()
//    user.name()
//}
//abstraction is use implemnt hide
abstract class ImplementHide() {
    fun userDetail() {
        println("I am Zubair")
    }

    abstract fun start()
}

class User() : ImplementHide() {
    override fun start() {
        println("this is the abstraction of all ")
    }

}

//pure 100%
interface Flyable {
    fun fly()
    fun start()
}

class Bird() : Flyable {
    override fun fly() {
        println("Bird fly one sky")
    }

    override fun start() {
        println("bird fly start now ")
    }

}


//encapsulation use for data hiding and show only info thata u awant to share
class UserScreeDetail() {
    private val name: String = "zubair"
    fun name() {
        println("my name is zubair")
    }

    private fun info() {
        println("I am from burewala")
    }
}

//inhritance


open class Animala() {
    fun animal() {
        println("Animal eat and producte  milk")
    }
}

class Cow() : Animala() {
    fun cow() {
        println("Cow milk dytii ha ")
    }
}

// Shape classes
open class Shape {
    open fun draw() {
        println("Drawing shape")
    }
}

class Circle : Shape() {
    override fun draw() {
        println("Drawing circle")
    }

    fun newShape() {
        println("you have to draw any shape")
    }
}

class Rectangle : Shape() {
    override fun draw() {
        println("Drawing rectangle")
    }
}

// 👇 YAHAN likhna hota hai
fun drawShape(shape: Shape) {
    shape.draw()
}


fun main() {
    val cow = Cow()
    cow.animal()
    drawShape(Circle())
    drawShape(Rectangle())
    //poly morphism
    val cal = Calculator()
    println(cal.sum(4,3))
    println(cal.sum(4,5,6))

    val dogs: Animal = Dog()
    dogs.makeSound()

}

//poly morphism
//over loading
//over riding
//overt loading same fn diff prametr
class Calculator() {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sum(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }

    fun sum(a: Double, b: Double): Double {
        return a + b
    }

}
//over riding same fn name but diff behavir
open class Animal(){
    open fun makeSound(){
        println("Animale make sound")
    }
}
class Dog(): Animal(){
    override fun makeSound() {
        println("Dog is barkinh")
    }
}
class Cat(): Animal(){
    override fun makeSound() {
        println("Cat is meow")
    }
}