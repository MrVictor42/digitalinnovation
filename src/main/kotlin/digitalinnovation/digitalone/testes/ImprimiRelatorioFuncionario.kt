package digitalinnovation.digitalone.testes

import digitalinnovation.digitalone.Funcionario

class ImprimiRelatorioFuncionario {
    companion object {
        fun imprimir(funcionario: Funcionario) {
            println(funcionario.toString())
        }
    }
}