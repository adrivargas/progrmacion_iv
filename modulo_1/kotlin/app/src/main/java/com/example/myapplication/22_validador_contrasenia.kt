fun main() {
    print("Contraseña: ")
    val pass = readlnOrNull() ?: ""

    val tieneLongitud = pass.length >= 8
    val tieneDigito = pass.any { it.isDigit() }

    println(if (tieneLongitud && tieneDigito) "Válida" else "Inválida")
}
