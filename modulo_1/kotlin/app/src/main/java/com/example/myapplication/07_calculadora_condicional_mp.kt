package com.example.ticketsupport

fun main() {
    println(" Calculadora de Operaciones – Sistema de Soporte Técnico")
    print("¿Qué operación desea realizar? (+, -, *, /): ")
    val operacion = readLine()?.lowercase() ?: ""

    println("Ingrese el primer valor (ej: costo base, horas, etc.):")
    val valor1: Int = readLine()?.toIntOrNull() ?: 0

    println("Ingrese el segundo valor (ej: costo adicional, técnicos, etc.):")
    val valor2: Int = readLine()?.toIntOrNull() ?: 0

    val resultado = when (operacion) {
        "+" -> valor1 + valor2
        "-" -> valor1 - valor2
        "*" -> valor1 * valor2
        "/" -> if (valor2 != 0) valor1 / valor2 else {
            println(" Error: no se puede dividir entre 0")
            null
        }
        else -> {
            println(" Operación no reconocida")
            null
        }
    }

    if (resultado != null) {
        println(" Resultado de la operación: $resultado")
    } else {
        println(" No se pudo realizar la operación")
    }
}
