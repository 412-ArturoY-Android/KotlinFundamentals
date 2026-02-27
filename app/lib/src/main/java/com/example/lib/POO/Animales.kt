package com.example.lib.POO

open class Animal(val nombre: String, val edad: Int) {
    open fun hacerSonido() {
        println("Sonido genérico.")
    }
    fun describirse() {
        println("Soy $nombre y tengo $edad años.")
    }
}
class Perro(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        // TODO: imprime ¡Guau!
        println("Woof!")
    }
}
class Gato(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        // TODO: imprime ¡Guau!
        println("Mau")
    }
}
class Vaca(nombre: String, edad: Int) : Animal(nombre, edad) {
    override fun hacerSonido() {
        // TODO: imprime ¡Guau!
        println("Mooo!")
    }
}

// TODO: Crea Gato y Vaca de forma similar
fun main() {
    val perro = Perro("Rex", 3)
    val gato = Gato("Misifus", 1)
    val vaca = Vaca("Vaca", 2)
    perro.describirse()
    perro.hacerSonido()
    gato.describirse()
    gato.hacerSonido()
    vaca.describirse()
    vaca.hacerSonido()

    // TODO: Crea y usa Gato y Vaca
}