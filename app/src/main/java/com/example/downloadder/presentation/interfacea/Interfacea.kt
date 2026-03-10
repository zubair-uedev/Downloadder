package com.example.downloadder.presentation.interfacea

fun main() {
    val obj = ShowSound()
    obj.makeSound()
    obj.makeSounds()
}


interface InterfaceAll{
    fun makeSound()
}
interface InterfaceA{
    fun makeSounds()
}
class ShowSound(): InterfaceAll ,InterfaceA{
    override fun makeSound() {
        println("Dog is barking")
    }

    override fun makeSounds() {
        println("cat is meow")
    }


}