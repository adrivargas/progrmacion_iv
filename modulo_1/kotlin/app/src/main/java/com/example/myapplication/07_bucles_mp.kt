package com.example.ticketsupport

fun main() {
    println("Bucles en el Sistema de Soporte Técnico")


    val tickets = listOf("TCK-1001", "TCK-1002", "TCK-1003", "TCK-1004", "TCK-1005")

    println("\n Lista de tickets activos:")
    for ((index, ticket) in tickets.withIndex()) {
        println("${index + 1}. Ticket ID: $ticket")
    }


    println("\nProgreso del diagnóstico del sistema:")
    for (i in 0..100 step 20) {
        println("Progreso: $i%")
    }


    println("\n Reinicio del servidor en:")
    for (segundos in 5 downTo 1) {
        println("...$segundos")
    }
    println("Servidor reiniciado correctamente")


    println("\n Asignación de técnicos:")
    val tecnicos = listOf("Carlos", "Adriana", "Fernando", "Elian")

    for (tecnico in tecnicos) {
        if (tecnico == "Luis") {
            println(" $tecnico está de descanso, saltando asignación")
            continue
        }
        if (tecnico == "Adriana") {
            println(" $tecnico tiene demasiados tickets, deteniendo asignación")
            break
        }
        println("Asignando nuevo ticket a $tecnico")
    }
}
