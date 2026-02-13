package com.example.ticketsupport

fun main() {
    println("🔧 Sistema de Soporte Técnico – Evaluación de Tickets")

    val prioridad: Int = 4
    val tecnicoDisponible: Boolean = true
    val ticketAbierto: Boolean = true
    val tiempoEsperaHoras: Int = 2

    // Operadores lógicos

    val esUrgente = prioridad >= 4 && ticketAbierto


    val puedeAsignarse = tecnicoDisponible && ticketAbierto


    val requiereEscalamiento = !tecnicoDisponible || tiempoEsperaHoras > 3

    println("¿El ticket es urgente? → $esUrgente")
    println("¿Se puede asignar a un técnico? → $puedeAsignarse")
    println("¿Requiere escalamiento? → $requiereEscalamiento")
}
