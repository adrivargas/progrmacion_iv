package com.example.ticketsupport

import java.lang.Exception

// Excepción personalizada: sin técnicos disponibles
class TecnicoNoDisponibleException(message: String) : Exception(message)

// Excepción personalizada: ticket demasiado complejo
class TicketComplejoException(nivelComplejidad: Int, message: String) : Exception(message)

// Función que simula la asignación de un ticket de soporte
fun asignarTicket(tecnicosDisponibles: Int, nivelComplejidad: Int): String {
    return try {
        when {
            tecnicosDisponibles == 0 -> throw TecnicoNoDisponibleException("No hay técnicos disponibles para atender el ticket.")
            nivelComplejidad > 80 -> throw TicketComplejoException(nivelComplejidad, "El ticket es demasiado complejo para el equipo actual.")
            else -> "Ticket asignado correctamente. Nivel de complejidad: $nivelComplejidad"
        }
    } catch (e: TecnicoNoDisponibleException) {
        " Error: ${e.message} Por favor, escale el ticket o espere disponibilidad."
    } catch (e: TicketComplejoException) {
        " Error: ${e.message} (Nivel de complejidad: $nivelComplejidad)"
    } catch (e: Exception) {
        " Error inesperado: ${e.message}"
    } finally {
        println(" Registro del proceso guardado en el sistema.")
    }
}

fun main() {
    println(asignarTicket(tecnicosDisponibles = 0, nivelComplejidad = 40))
    println(asignarTicket(tecnicosDisponibles = 3, nivelComplejidad = 90))
    println(asignarTicket(tecnicosDisponibles = 2, nivelComplejidad = 50))
}
