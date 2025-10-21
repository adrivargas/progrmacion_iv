package com.example.ticketsupport

fun main() {
    println( "Operadores Aritméticos en el Sistema de Soporte Técnico")

    val costoBase: Double = 45.0
    val horasExtra: Double = 2.0
    val costoHoraExtra: Double = 15.0

    val descuento: Double = 10.0
    val ticketsAtendidos: Int = 5
    val totalHoras: Int = 8

    // Operaciones aritméticas
    val costoTotal = costoBase + (horasExtra * costoHoraExtra)
    val descuentoAplicado = costoTotal - (costoTotal * (descuento / 100))
    val promedioHorasPorTicket = totalHoras.toDouble() / ticketsAtendidos

    println("Costo base del servicio: $$costoBase")
    println("Costo con horas extra: $$costoTotal")
    println("Costo final con descuento: $$descuentoAplicado")
    println("Promedio de horas por ticket: $promedioHorasPorTicket")
}
