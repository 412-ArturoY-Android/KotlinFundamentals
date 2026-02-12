package com.example.lib

//Kotlin = Multiplataforma

fun main(){
    /*
    //variables inmutables, en ejecucion
    val name: String = "Juan Frausto"
    //variables mutables
    var edad = 28
    val height: Double = 1.69
    val isBlind : Boolean = true
    val initialLetter:Char='J'

    //Constantes, en compilacion (mas eficiente pero no debe de cambiar)
    const name2 = "Juan"
    edad = 29
    println(name)
    println(edad)
    if(edad>18){
        println("Es mayor de edad")
    }else{
        println("No es mayor de edad")
    }

    //If Else (Operador Ternario, pero aqui no existe)

    //Int,Float,Boolean,String,Char,Array<t> y Any (mala practica, solo si es necesario),, Double
     */
    // for (int i=0;i<10;i++)

    for(i in 1..10){
        println(i)
    }
    for(i in 100 downTo 0 step 10){
        println(i)
    }

    //Calculadora de propinas
    /*
    Crear un programa que tenga un precio de comida y un porcentaje de propina. El progra,a debe
     imprimir cuanto es de propina y cuanto es el total a pagar.
     */
    val cost = 500.0
    val precentage = 0.15
    val tip = cost * precentage
    val total = cost + tip
    println("El total es $$total")
    println("La propina es $$tip")

}