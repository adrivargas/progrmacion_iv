package com.example.ticketsupport

// Enum que representa los tipos de tickets de soporte
enum class TipoTicket(val nivel: Int, val categoria: String) {
    SOFTWARE(nivel = 70, categoria = "Aplicaciones") {
        override fun descripcion() = " Problemas relacionados con sistemas o aplicaciones."
    },
    HARDWARE(nivel = 85, categoria = "Equipos") {
        override fun descripcion() = " Fallas en dispositivos físicos o periféricos."
    },
    RED(nivel = 90, categoria = "Conectividad") {
        override fun descripcion() = " Problemas de red, conexión o ancho de banda."
    },
    SEGURIDAD(nivel = 95, categoria = "Ciberseguridad") {
        override fun descripcion() = "🛡 Riesgos de seguridad, malware o accesos no autorizados."
    };

    abstract fun descripcion(): String

    companion object {
        fun porCategoria(categoria: String) = values().find { it.categoria == categoria }
    }
}

// Clase que representa un ticket de soporte asociado a un tipo
class Ticket(val tipo: TipoTicket, val cliente: String) {
    fun procesar() = "Procesando ticket de tipo ${tipo.name.lowercase()} para $cliente..."
    fun info() = "${tipo.descripcion()} Prioridad: ${tipo.nivel} / Categoría: ${tipo.categoria}"
}

fun main() {
    val ticketHardware = Ticket(TipoTicket.HARDWARE, cliente = "María López")
    println(ticketHardware.procesar())
    println(ticketHardware.info())

    println("─────────────────────────────")

    val ticketSeguridad = Ticket(TipoTicket.SEGURIDAD, cliente = "Adriana Vargas")
    println(ticketSeguridad.procesar())
    println(ticketSeguridad.info())

    println("─────────────────────────────")

    // Buscar tipo de ticket por categoría
    val tipoBuscado = TipoTicket.porCategoria("Conectividad")
    println(" Tipo encontrado por categoría: ${tipoBuscado?.name} → ${tipoBuscado?.descripcion()}")
}
