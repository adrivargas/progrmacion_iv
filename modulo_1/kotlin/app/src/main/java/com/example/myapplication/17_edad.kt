// Cinema ticket price by age
fun main() {
    print("Edad: ")
    val edad = readln().toIntOrNull() ?: 0

    val precio = when {
        edad < 12  -> 3.0
        edad >= 65 -> 4.0
        else       -> 5.0
    }
    println("Total: $${"%.2f".format(precio)}")
}
