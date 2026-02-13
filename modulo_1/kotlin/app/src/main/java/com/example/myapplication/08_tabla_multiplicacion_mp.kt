package com.example.ticketsupport

fun main() {
    println("Calculadora de Tarifas – Sistema de Soporte Técnico")
    println("Ingrese el costo por hora de soporte (en dólares):")
    val costoHora: Int = readLine()?.toIntOrNull() ?: 0

    println("\n Tabla de costos por cantidad de horas (1 a 12):")
    for (horas in 1..12 step 1) {
        val total = horas * costoHora
        println("$horas hora(s) de soporte = $$total")
    }
}
