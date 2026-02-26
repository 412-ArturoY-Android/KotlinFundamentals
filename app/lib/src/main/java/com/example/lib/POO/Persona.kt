package com.example.lib.POO

class Persona(val nombre: String, val edad: Int, val ciudad: String) {
    fun saludar() {
        // TODO: Imprime el saludo
        println("Hola, me llamo $nombre y tengo $edad años.")
    }
    fun esMayorDeEdad(): Boolean {
        // TODO: Regresa true si edad >= 18
        return edad >= 18
    }
}
fun main() {
    val persona1 = Persona("Ana", 20, "Guadalajara")
    val persona2 = Persona("Luis", 15, "Leon")
    // TODO: Llama los métodos de cada persona
    persona1.saludar()
    print("${persona1.nombre} es mayor de edad: ")
    println(persona1.esMayorDeEdad())

    println("------")

    persona2.saludar()
    print("${persona2.nombre} es mayor de edad: ")
    println(persona2.esMayorDeEdad())
}
