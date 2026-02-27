package com.example.lib.POO

class CuentaBancaria(val titular: String) {
    var saldo: Double = 0.0
    fun depositar(cantidad: Double) {
        // TODO
        saldo += cantidad
        println("El nuevo saldo es: $saldo")
    }
    fun retirar(cantidad: Double) {
        // TODO: verifica que haya saldo suficiente
        var suma: Double = 0.0
        suma = saldo - cantidad
        if (suma >= 0){
            saldo = suma
            println("El nuevo saldo es: $saldo")
        }else{
            println("La cuenta no tiene suficientes fondos")
        }
    }
    fun mostrarSaldo() {
        // TODO
        println("El saldo actual es: $saldo")
    }
}
fun main() {
    val cuenta = CuentaBancaria("María García")
    cuenta.depositar(1000.0)
    cuenta.retirar(400.0)
    cuenta.retirar(800.0) // No debe permitirlo
    cuenta.mostrarSaldo()
    //test
}