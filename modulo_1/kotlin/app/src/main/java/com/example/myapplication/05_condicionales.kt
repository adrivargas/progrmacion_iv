package com.example.myapplication

fun main() {
    println("!Estructuras de control!!!")
    println("!Condicionales!!!")
    val value1 = 10
    val value2 = 15
    if (value1 > value2) {
        println("El mayor es ${value1}")
    } else {
        println("El mayor es ${value2}")
    }
    println("Rango segun nivel de la fuerza")
    var fuerza: Int = 10
    if (fuerza > 10) {
        println("Maestro")
    } else if (fuerza > 5) {
        println("Caballero Jedi")
    } else {
        println("Padawan")
    }

    var tipoDroide: String = "BB-8"
    when(tipoDroide){
        "R2-D2", "R2-Q5" -> print("Droide astromecanico")
        "C-3P0", "C-3pa" -> print("Droide de protocolo")
        "B8-8", "BB-9E" -> print("Droide de nueva generacion")
        else -> print("Modelo Desconocido")
    }

    var peligro: Int = 10
    var recompensa: Int = 50
    when{
        peligro>8 && recompensa < 1000 -> print("Droide astromecanico")
        peligro<=3 ->print("Mision Aceptada")
        else -> print("Reqioere Evaluacion adicional")
    }

    var semaforo: String = "VERDE"
    var estado_calle: String = ""
    when{
        semaforo == "VERDE" && estado_calle == "vacio"-> print("Puede pasar")
        semaforo == "AMARILLO" && estado_calle == "vacio" -> print("Avanzar con precaucion")
    }



    print("¿Cual es tu signo del zodiaco? ")
    val signo = readLine()?.lowercase() ?: ""

    val elemento = when {
        signo == "aries" || signo == "leo" || signo == "sagitario" -> "Fuego"
        signo == "tauro" || signo == "virgo" || signo == "capricornio" -> "Tierra"
        signo == "geminis" || signo == "libra" || signo == "acuario" -> "Aire"
        signo == "cancer"  || signo == "escorpio" || signo == "piscis" -> "Agua"
        else -> "Signo no reconocido"
    }

    println("Tu elemento es: $elemento")



}