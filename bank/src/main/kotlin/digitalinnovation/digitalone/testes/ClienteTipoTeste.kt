package digitalinnovation.digitalone.testes

import digitalinnovation.digitalone.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    println()

    val pf = ClienteTipo.PF
    val pj = ClienteTipo.PJ
    println("${pf.name} - ${pf.descricao}")
    println("${pj.name} - ${pj.descricao}")
}