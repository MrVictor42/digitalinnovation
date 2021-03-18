package digitalinnovation.digitalone

abstract class Funcionario(
    nome: String, cpf: String, var salario: Double
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String {
        return "Nome: $nome - CPF: $cpf - Salario: $salario - Auxílio: ${calculoAuxilio()}".trimIndent()
    }
}