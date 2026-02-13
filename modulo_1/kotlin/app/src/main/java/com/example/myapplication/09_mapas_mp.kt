package com.example.ticketsupport

fun main() {
    println(" Mapas y Conjuntos en el Sistema de Soporte Técnico")

    // Mapa inmutable con el nivel de experiencia de los técnicos
    val nivelTecnicos = mapOf(
        "Carlos" to 95,
        "Ana" to 90,
        "Luis" to 85,
        "María" to 80
    )
    println(" Nivel de experiencia de los técnicos: $nivelTecnicos")

    // Mapa mutable con tickets resueltos por técnico
    println("\n Tickets resueltos (Mapa mutable)")
    val ticketsResueltos = mutableMapOf<String, Int>()
    ticketsResueltos["Carlos"] = 25
    ticketsResueltos["Ana"] = 18
    ticketsResueltos.put("Luis", 20)

    println("Tickets por técnico: $ticketsResueltos")

    // Recorrer el mapa con for
    println("\nReporte individual:")
    for ((tecnico, nivel) in nivelTecnicos) {
        println("$tecnico tiene nivel de experiencia $nivel puntos")
    }

    // Conjuntos: Áreas del sistema que los técnicos han trabajado
    val modulosAtendidos = setOf("Red", "Software", "Hardware", "Seguridad")
    println("\n Módulos atendidos: $modulosAtendidos")

    val modulosCriticos = setOf("Seguridad", "Base de Datos", "Red")
    println(" Módulos críticos del sistema: $modulosCriticos")

    // Operaciones de conjuntos
    println("\n Operaciones de conjuntos:")
    val modulosCoincidentes = modulosAtendidos intersect modulosCriticos
    val todosLosModulos = modulosAtendidos union modulosCriticos
    val modulosSeguros = modulosAtendidos - modulosCriticos

    println("Módulos atendidos y críticos: $modulosCoincidentes")
    println("Todos los módulos trabajados: $todosLosModulos")
    println(" Módulos seguros atendidos: $modulosSeguros")
}
