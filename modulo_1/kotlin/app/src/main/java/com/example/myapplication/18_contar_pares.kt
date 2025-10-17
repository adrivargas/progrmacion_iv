// Counts even numbers from 1 to N
fun main() {
    print("N: ")
    val n = readln().toIntOrNull() ?: 0
    var count = 0
    for (i in 1..n) {
        if (i % 2 == 0) count++
    }
    println("Pares entre 1 y $n: $count")
}
