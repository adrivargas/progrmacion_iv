package com.example.myapplication


fun main(){
    print("¿Que operacion desea hacer? ")
    val operacion = readLine()?.lowercase() ?: ""
    println("Incluir primer valor")
    val value1 : Int = readLine()?.toIntOrNull()?:0
    println("Incluir segundo valor")
    val value2 : Int = readLine()?.toIntOrNull()?:0

    val resultado = when {

        operacion == "+"  ->   println("Suma: ${value1 + value2}")
        operacion == "-" -> println("Resta: ${value1 - value2}")
        operacion == "*"  -> println("Multiplicacion: ${value1 * value2}")
        operacion == "/"   -> println("Division: ${value1 / value2}")
        else -> "Signo no reconocido"
    }
    println("Tu operacion es: $resultado")
}
