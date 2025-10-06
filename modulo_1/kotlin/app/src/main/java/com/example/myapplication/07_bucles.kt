package com.example.myapplication

fun main(){
    println("Bucles")
    val jedis = listOf("Luke","Leia","Obi-Wan","Yoda","Ahsoka")
    for((index,jedi) in jedis.withIndex()){
        println("${index+1}.$jedi")
    }
    for (i in 0 .. 20 step 2){
        println("Energia: $i%")
    }
    //rangos descendentes
    for (countdown in 10 downTo 1){
        println("Despegue en: $countdown")
    }

    for (jedi in jedis){
        if(jedi == "Obi-Wan") continue //saltar esta iteracion
        if(jedi == "Yoda") break //saltar esta iteracion
        println("entrenando a $jedi")
    }
}