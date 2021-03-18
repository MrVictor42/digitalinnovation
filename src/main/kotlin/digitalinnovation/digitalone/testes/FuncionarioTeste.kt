package digitalinnovation.digitalone.testes

import digitalinnovation.digitalone.Funcionario
import digitalinnovation.digitalone.Pessoa

fun main() {
    val pessoa = Pessoa("victor", "123.1234.123-1")

    val funcionario = Funcionario(pessoa.nome, pessoa.cpf, 4500.0)
    println(funcionario.nome)
    println(funcionario.cpf)
    println(funcionario.salario)
}