package com.example.myapplication

fun main(){
    println("Operadores Aritmeticos")
    println("Incluir primer valor")
    val value1 : Int = readLine()?.toIntOrNull()?:0
    println("Incluir segundo valor")
    val value2 : Int = readLine()?.toIntOrNull()?:0
    println("Suma: ${value1 + value2}")
    println("Resta: ${value1 - value2}")
    println("Multiplicacion: ${value1 * value2}")
    println("Division: ${value1 / value2}")

}