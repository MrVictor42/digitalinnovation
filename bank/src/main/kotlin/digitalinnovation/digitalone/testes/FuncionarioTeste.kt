package digitalinnovation.digitalone.testes

import digitalinnovation.digitalone.Analista

fun main() {

    val analista = Analista("victor", "1234", 4500.0)
    ImprimiRelatorioFuncionario.imprimir(analista)
}