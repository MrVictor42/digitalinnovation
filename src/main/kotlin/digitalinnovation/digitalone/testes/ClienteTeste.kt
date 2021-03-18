package digitalinnovation.digitalone.testes

import digitalinnovation.digitalone.Cliente
import digitalinnovation.digitalone.ClienteTipo

fun main() {
    val victor = Cliente(
        nome = "Victor Mota",
        cpf = "123.456.789-0",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(victor)
    TesteAutenticacao().autentica(victor)
}
