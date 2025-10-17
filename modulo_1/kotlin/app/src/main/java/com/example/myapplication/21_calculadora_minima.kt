fun main() {
    var resultado = 0.0
    while (true) {
        println("\nMenú: 1) Sumar  2) Restar  3) Salir")
        print("Opción: ")
        when (readln().trim()) {
            "1" -> {
                print("Valor a sumar: ")
                val v = readln().toDoubleOrNull() ?: 0.0
                resultado += v
                println("Resultado: $resultado")
            }
            "2" -> {
                print("Valor a restar: ")
                val v = readln().toDoubleOrNull() ?: 0.0
                resultado -= v
                println("Resultado: $resultado")
            }
            "3" -> { println("Adiós"); return }
            else -> println("Opción inválida")
        }
    }
}
