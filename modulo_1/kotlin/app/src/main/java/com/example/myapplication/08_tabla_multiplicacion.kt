package com.example.myapplication

fun main(){
    println("Que tabla de multiplicar desea? 1 al 10")
    val valor : Int = readLine()?.toIntOrNull()?:0

    for (i in 0 .. 12 step 1){
        println("$i x $valor = ${i*valor}")
    }
}