package com.example.ticketsupport

fun main() {

    println("¡Operadores de Igualdad en el Sistema de Soporte Técnico!")

    val ticketCliente1: String = "TCK-1001"
    val ticketCliente2: String = "TCK-1001"
    val ticketCliente3: String = String("TCK-1001".toCharArray())

    println("Igualdad estructural (contenido):")
    println(ticketCliente1 == ticketCliente2)
    println(ticketCliente1 == ticketCliente3)

    println("Igualdad referencial (misma instancia en memoria):")
    println(ticketCliente1 === ticketCliente2)
