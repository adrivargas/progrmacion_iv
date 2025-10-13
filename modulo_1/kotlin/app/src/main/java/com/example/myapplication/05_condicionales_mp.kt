package com.example.ticketsupport

fun main() {
    println("¡Estructuras de Control en el Sistema de Soporte Técnico!")
    println("Condicionales")

    // Ejemplo 1: Comparar tiempos de respuesta
    val tiempoCliente1 = 2
    val tiempoCliente2 = 5

    if (tiempoCliente1 < tiempoCliente2) {
        println("El ticket del Cliente 1 fue atendido más rápido (${tiempoCliente1}h)")
    } else {
        println("El ticket del Cliente 2 fue atendido más rápido (${tiempoCliente2}h)")
    }

    // Ejemplo 2: Clasificar prioridad según nivel de urgencia
    println("Clasificación de prioridad del ticket")
    var urgencia: Int = 8

    if (urgencia >= 9) {
        println("Prioridad: CRÍTICA  – atención inmediata")
    } else if (urgencia >= 5) {
        println("Prioridad: ALTA ️ – resolver en menos de 2h")
    } else {
        println("Prioridad: NORMAL  – puede esperar en la cola de soporte")
    }

    // Ejemplo 3: Evaluar tipo de ticket con 'when'
    var tipoTicket: String = "Software"

    when (tipoTicket) {
        "Hardware", "Red" -> println(" Ticket técnico – requiere revisión física del equipo")
        "Software" -> println(" Ticket de software – posible error en el sistema operativo")
        "Cuenta", "Acceso" -> println("Ticket de usuario – verificar credenciales o permisos")
        else -> println(" Tipo de ticket no reconocido")
    }

    // Ejemplo 4: Evaluar riesgo y costo del ticket
    var nivelRiesgo: Int = 7
    var costoEstimado: Int = 120

    when {
        nivelRiesgo > 8 && costoEstimado < 500 -> println(" Requiere soporte avanzado y validación adicional")
        nivelRiesgo <= 3 -> println(" Ticket seguro y de bajo riesgo")
        else -> println(" Ticket requiere evaluación por un supervisor")
    }

    // Ejemplo 5: Evaluar disponibilidad según horario y estado del técnico
    var horaActual: Int = 14
    var tecnicoDisponible: Boolean = true

    when {
        horaActual < 9 -> println(" El soporte aún no inicia jornada")
        horaActual in 9..17 && tecnicoDisponible -> println(" Técnico disponible – puede asignarse el ticket")
        horaActual > 17 -> println(" Fuera de horario – se agenda para el siguiente día")
        else -> println(" No hay técnicos disponibles actualmente")
    }

    // Ejemplo 6: Determinar tipo de cliente mediante entrada por teclado
    print("Ingrese el tipo de cliente (nuevo, frecuente, empresa): ")
    val tipoCliente = readLine()?.lowercase() ?: ""

    val mensaje = when (tipoCliente) {
