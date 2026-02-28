package com.example.lib.POO

import kotlin.math.PI

interface Figura {
    fun calcularArea(): Double
    fun calcularPerimetro(): Double
}
class Rectangulo(val base: Double, val altura: Double) : Figura {
    override fun calcularArea() = base * altura
    override fun calcularPerimetro(): Double {
        // TODO: Perimetro = 2 * (base + altura)
        val perimetro: Double = 2 * (base + altura)
        return perimetro
    }
}
class Circulo(val radio: Double) : Figura {
    override fun calcularArea(): Double {
        // TODO: Area = PI * radio * radio
        val area: Double = PI * radio * radio
        return area
    }
    override fun calcularPerimetro(): Double {
        // TODO: Perimetro = 2 * PI * radio
        val perimetro: Double = 2 * PI * radio
        return perimetro
    }
}
fun main() {
    val rect = Rectangulo(5.0, 3.0)
    val circ = Circulo(4.0)
    println("Rectangulo - Area: %.2f, Perimetro:%.2f".
    format(rect.calcularArea(), rect.calcularPerimetro()))
    println("Circulo - Area: %.2f, Perimetro:%.2f".
    format(circ.calcularArea(), circ.calcularPerimetro()))
}