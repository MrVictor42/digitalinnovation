package digitalinnovation.digitalone.testes

import digitalinnovation.digitalone.Banco

fun main() {
    val digiOneBank = Banco(nome = "digione", numero = 12)

    println(digiOneBank.info())
}