package digitalinnovation.digitalone.testes

import digitalinnovation.digitalone.Gerente

fun main() {

    val gerente = Gerente("victor", "1234", 6500.0, "senha123")
    ImprimiRelatorioFuncionario.imprimir(gerente)
    TesteAutenticacao().autentica(gerente)
}