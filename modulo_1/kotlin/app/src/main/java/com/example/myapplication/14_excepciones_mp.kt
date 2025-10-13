package com.example.ticketsupport

fun main() {
    println(" Sistema de Soporte Técnico – Manejo de Excepciones")

    try {
        println("Ingrese el costo total del servicio:")
        val costo = readLine()?.toIntOrNull() ?: 0

        println("Ingrese el número de técnicos disponibles:")
        val tecnicos = readLine()?.toIntOrNull() ?: 0

        // Posible división por cero
        val costoPorTecnico = costo / tecnicos
        println(" Cada técnico debe cobrar: $$costoPorTecnico")

    } catch (e: ArithmeticException) {
        println(" Error: No se puede dividir entre 0 (ningún técnico disponible).")
    } catch (e: Exception) {
        println(" Ocurrió un error inesperado: ${e.message}")
    } finally {
        println(" Proceso finalizado. Registro almacenado en el sistema.")
    }
}
