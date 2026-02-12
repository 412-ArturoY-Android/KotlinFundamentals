package com.example.lib

/*
1,2,3,4,5,6,7
Escribir un programa que me muestre en la consola los dias de la semana y si es sabado o domingo
que escriba fin de semana
 */

fun main(){
    val dayOfTheWeek = 2
    //comentar
    //ctrl k ctrl C,, yesyes
    //ctrl K ctrl U,, nono
    when(dayOfTheWeek){
        1 -> {
            println("Es Lunes")
        }
        2 -> {println("Es Martes")}
        3 -> {println("Es Miercoles")}
        4 -> {println("Es Jueves")}
        5 -> {println("Es Viernes")}
        6,7 -> {println("Es fin de semana")}
        else -> {println("No es un dia de la semana")}
    }

}