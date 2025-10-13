package com.example.ticketsupport

fun main() {
    println("VARIABLES EN EL SISTEMA DE SOPORTE TÉCNICO")


    val empresa = "TechHelp S.A."
    var tecnicoAsignado = "Adriana Vargas"

    tecnicoAsignado = "Ana Torres"

    println("Tipos de Variables en un Ticket de Soporte")

    println("Tipo Entero - ID del ticket")
    val idTicket: Int = 1024
    println(idTicket)

    println("Tipo Double - Costo estimado del servicio")
    val costoServicio: Double = 49.99
    println(costoServicio)

    println("Tipo Float - Tiempo promedio de respuesta (en horas)")
    val tiempoRespuesta: Float = 2.5f
    println(tiempoRespuesta)

    println("Tipo Long - Total de tickets procesados en la base de datos")
    val totalTickets: Long = 2_540_000L
    println(totalTickets)

    println("Tipo Texto - Nombre del cliente")
    val nombreCliente: String = "María López"
    println(nombreCliente)

    println("Tipo Char - Nivel de prioridad (A, B, C)")
    val prioridad: Char = 'A'
    println(prioridad)

    println("Tipo Lógico - ¿El ticket está resuelto?")
    val estaResuelto: Boolean = false
    println(estaResuelto)

    println("Nulabilidad")
    val comentarioCliente: String? = "El equipo no enciende correctamente"
    println(comentarioCliente)

    val telefonoCliente: String? = null // Aún no registrado
    println(telefonoCliente?.length) // Evita error con operador seguro

    println("Operación de aserción no null (!!)")
    val longitudComentario = comentarioCliente!!.length
    println("Longitud del comentario: $longitudComentario")

    println("Interpolación de Strings")
    val fechaCreacion = "2025-10-13"
    val estadoTicket = "Pendiente"
    println("El ticket #$idTicket fue creado por $nombreCliente el $fechaCreacion y está actualmente $estadoTicket")

    println("En 2 horas se espera resolverlo: Tiempo estimado ${tiempoRespuesta + 2} horas")

    println("String Multilínea")
    val resumenTicket: String = """
        Estimado/a $nombreCliente,
        Su ticket con ID #$idTicket ha sido recibido.
        Técnico asignado: $tecnicoAsignado
        Estado actual: $estadoTicket
        Gracias por confiar en $empresa.
    """.trimIndent()

    println(resumenTicket)

    println("Conversiones")
    val textoPrioridad = "3"
    val prioridadNumerica: Int = textoPrioridad.toInt()
    println("Nivel numérico de prioridad: $prioridadNumerica")

    val costoNumerico: Double = 75.5
    val costoComoTexto: String = costoNumerico.toString()
    println("Costo convertido a texto: $costoComoTexto")
}
