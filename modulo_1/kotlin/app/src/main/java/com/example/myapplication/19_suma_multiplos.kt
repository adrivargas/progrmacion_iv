fun main() {
    print("N: ")
    val n = readln().toIntOrNull() ?: 0
    var suma = 0
    for (i in 3..n step 3) {
        suma += i
    }
    println("Suma de múltiplos de 3: $suma")
}
