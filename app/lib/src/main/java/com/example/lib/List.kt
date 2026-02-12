package com.example.lib

fun main(){
//    dada una lista de numeros desordenados, encuentra e imprime cual es el numero mas
//    grande SIN usar la funcion MAX
    val numbers = listOf(1,2,3,4,5)

    for(number in numbers){
        println(number)
    }

/*    val limit = 4
//    var si = 0
//    for(i in 0 .. limit+1){
//        if(numbers[i] >= si || numbers[i] >= 0) {
//            si = numbers[i]
//        }
//    }
//    println("El numero mayor es $si")
*/

    var maxNumber = numbers[0]
    for(number in numbers){
        if(number > maxNumber){
            maxNumber = number
        }
    }
    println("El numero mayor es $maxNumber")
}