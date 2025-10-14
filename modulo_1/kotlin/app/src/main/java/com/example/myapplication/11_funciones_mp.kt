package com.example.ticketsupport

// Función sin parámetros ni retorno
fun bienvenida() {
    println(" Bienvenido al sistema de soporte técnico TechHelp S.A.")
}

// Función con parámetros y retorno
fun calcularCosto(horas: Int, costoPorHora: Int): Int {
    return horas * costoPorHora
}

// Función de una sola expresión (single-expression function)
fun aplicarDescuento(total: Int) = total - (total * 0.1).toInt()

// Función con retorno múltiple usando Pair
fun calcularTiempos(tiempoDiagnostico: Int, tiempoReparacion: Int): Pair<Int, Int> {
    val tiempoTotal = tiempoDiagnostico + tiempoReparacion
    val diferencia = tiempoReparacion - tiempoDiagnostico
    return Pair(tiempoTotal, diferencia)
}

fun main() {
    bienvenida()

    // Cálculo de costo total
    val costo = calcularCosto(5, 20)
    println(" Costo total del servicio: $$costo")

    // Aplicar descuento del 10%
    val costoFinal = aplicarDescuento(costo)
    println(" Costo final con descuento: $$costoFinal")

    // Calcular tiempos de trabajo
    val tiempos = calcularTiempos(2, 5)
    println(" Tiempo total: ${tiempos.first} horas, diferencia: ${tiempos.second} horas")

    // Funciones lambda
    val generarCodigoTicket = { id: Int -> "TCK-${id + 1000}" }
    val mensajeTecnico = { nombre: String -> " Técnico asignado: $nombre" }

    println(generarCodigoTicket(25))
    println(mensajeTecnico("Adriana Vargas"))
}
