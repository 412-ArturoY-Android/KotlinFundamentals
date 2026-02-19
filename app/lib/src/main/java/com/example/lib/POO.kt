package com.example.lib

import com.example.lib.Person.Circle
import com.example.lib.Person.Square

// A PIE
// Abstraction
// Polimorfism
// Inheretanse
// ~Encapsulamiento

class Person(val name:String, val age: Int){ // Public person(Int age){this.age}
    fun sayHello(language:String){
        if(language == "Spanish"){
            println("Hola soy $name y tengo $age años")
        }else{
            println("Hello, im $name and I am $age years-old")
        }

    }
    fun caminar():Double{
        return 10.0
    }

    abstract class Shape{
        abstract fun calculateArea() : Double
    }
    // Extends / implements
    class Square(val side: Double) : Shape(){
        override fun calculateArea(): Double {
            return side * side
        }
    }

    class Circle(private val radius: Double): Shape(){
        override fun calculateArea(): Double {
            return Math.PI * radius * radius
        }

    }


}

fun main() { // instancear
    val person = Person(name = "Juan Frausto", age = 28)
    // val figura = Shape() error, las abstractas no se pueden instancear
    val square = Square(side = 10.0)
    val circle = Circle(radius = 10.0)
    println(square.side)
    // println(circle.radius) error, el radio es privado
    val shapes = listOf(square,circle)
}