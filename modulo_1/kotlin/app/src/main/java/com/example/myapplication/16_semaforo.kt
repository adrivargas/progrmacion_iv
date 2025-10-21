fun main() {
    print("Color del semáforo (rojo/amarillo/verde): ")
    val color = readln().trim().lowercase()
    print("¿Presionó el botón? (si/no): ")
    val boton = readln().trim().lowercase()

    val msg = when {
        color == "verde" && boton == "si" -> "Espera a rojo"
        color == "rojo"                   -> "Cruza"
        color == "amarillo"               -> "Prepárate"
        else                              -> "Espera"
    }
    println(msg)
}
