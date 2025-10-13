package com.example.ticketsupport

fun main() {
    println("Calculadora de Costos – Sistema de Soporte Técnico")

    println("Ingrese el costo base del servicio:")
    val costoBase: Int = readLine()?.toIntOrNull() ?: 0

    println("Ingrese el número de horas de soporte:")
    val horas: Int = readLine()?.toIntOrNull() ?: 0

    println("Ingrese el costo por hora adicional:")
    val costoPorHora: Int = readLine()?.toIntOrNull() ?: 0

    // Cálculos principales
    val tot
