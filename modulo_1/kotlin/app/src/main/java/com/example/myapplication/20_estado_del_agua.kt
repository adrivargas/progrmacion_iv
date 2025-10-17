// Water state based on Celsius temperature
fun main() {
    print("Temperatura (°C): ")
    val t = readln().toIntOrNull() ?: 0

    val estado = when {
        t <= 0      -> "Sólido"
        t in 1..99  -> "Líquido"
        else        -> "Gas"
    }
    println(estado)
}
