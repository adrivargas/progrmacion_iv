fun main() {
    print("Texto: ")
    val s = readln().lowercase()
    val vocales = setOf('a','e','i','o','u')
    val count = s.count { it in vocales }
    println("Vocales: $count")
}
