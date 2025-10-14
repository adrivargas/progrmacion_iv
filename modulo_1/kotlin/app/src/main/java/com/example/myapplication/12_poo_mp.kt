package com.example.ticketsupport

// Definición de la clase de datos (data class)
data class TicketSoporte(
    val id: Int,
    val cliente: String,
    val prioridad: Int,
    val estado: String = "Abierto",
    val tecnicoAsignado: String? = null
) {
    // Propiedad calculada: categoría según prioridad
    val categoria: String
        get() = when {
            prioridad >= 90 -> "Crítico "
            prioridad >= 70 -> "Alto "
            prioridad >= 40 -> "Medio "
            else -> "Bajo "
        }

    // Método: verifica si el ticket requiere atención inmediata
    fun requiereAtencionInmediata(): Boolean = prioridad >= 90

    // Método: verifica si el ticket puede ser asignado
    fun puedeSerAsignado(): Boolean = tecnicoAsignado == null
}

fun main() {
    // Crear un objeto TicketSoporte
    val ticket1 = TicketSoporte(
        id = 1001,
        cliente = "María López",
        prioridad = 85,
        tecnicoAsignado = "Adriana Vargass"
    )
    println(ticket1)

    // Desestructuración del objeto
    val (id, cliente, prioridad, estado) = ticket1
    println(" Ticket #$id de $cliente con prioridad $prioridad, estado: $estado")

    // Crear una copia del ticket con cambios
    val ticket2 = ticket1.copy(
        id = 1002,
        cliente = "Juan Pérez",
        prioridad = 95,
        tecnicoAsignado = null
    )
    println(ticket2)

    // Usar propiedades y métodos
    println(" Categoría del ticket2: ${ticket2.categoria}")
    println("¿Requiere atención inmediata?: ${ticket2.requiereAtencionInmediata()}")
    println("¿Puede ser asignado a un técnico?: ${ticket2.puedeSerAsignado()}")
}
