fun main() {
    print("Número: ")
    val n = readln().toIntOrNull() ?: 0
    for (i in 1..10) {
        println("$n x $i = ${n * i}")
    }
}
