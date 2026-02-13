package com.example.ticketsupport

fun main() {
    println("Listas en el Sistema de Soporte Técnico")

    // Lista inmutable: IDs de tickets cerrados (no se puede modificar)
    val ticketsCerrados: List<Int> = listOf(1001, 1002, 1003)
    println(" Tickets cerrados (lista inmutable): $ticketsCerrados")

    // Lista mutable: Tickets en progreso (puede modificarse)
    val ticketsEnProgreso: MutableList<Int> = mutableListOf(2001, 2002, 2003)
    println(" Tickets en progreso (antes): $ticketsEnProgreso")

    // Agregar y eliminar elementos
    ticketsEnProgreso.add(2004)
    println(" Ticket agregado: $ticketsEnProgreso")

    ticketsEnProgreso.removeAt(0)
    println(" Ticket eliminado: $ticketsEnProgreso")

    // Recorrer la lista
    println("\n Revisión de tickets en progreso:")
    for (ticket in ticketsEnProgreso) println("Revisando ticket #$ticket")

    // Operaciones con lista mutable
    println("\n Operaciones con lista de técnicos:")
    val tecnicos = mutableListOf("Carlos", "Ana")
    tecnicos.add("Luis")
    tecnicos += "María"
    tecnicos.add(index = 1, element = "Jorge")
    println(" Técnicos actuales: $tecnicos")

    tecnicos.remove("Ana")
    println(" Se eliminó 'Ana': $tecnicos")

    tecnicos.removeAt(0)
    println(" Eliminado el primer técnico: $tecnicos")

    tecnicos[0] = "Pedro"
    println(" Reemplazo: $tecnicos")

    tecnicos.clear()
    println(" Lista de técnicos vacía: ${tecnicos.isEmpty()}")

    // Búsquedas con listas
    println("\n Búsquedas en lista de clientes:")
    val clientes = mutableListOf("Juan", "Luis", "Pedro", "Lucía")
    println("Cliente que empieza con L: ${clientes.find { it.startsWith("L") }}")
    println("Primer cliente con nombre largo (>4 letras): ${clientes.firstOrNull { it.length > 4 }}")
    println("¿Algún cliente contiene la letra 'J'? ${clientes.any { it.contains('J') }}")
    println("¿No existe cliente llamado 'X'? ${clientes.none { it == "X" }}")

    // Ordenamiento de tiempos de respuesta
    println("\n Ordenamiento de tiempos de respuesta (en minutos):")
    val tiemposRespuesta = mutableListOf(45, 20, 30, 10, 60, 15)
    println("Tiempos ordenados ascendente: ${tiemposRespuesta.sorted()}")
    println("Tiempos ordenados descendente: ${tiemposRespuesta.sortedDescending()}")
    println("Tiempos únicos registrados: ${tiemposRespuesta.distinct()}")
}
