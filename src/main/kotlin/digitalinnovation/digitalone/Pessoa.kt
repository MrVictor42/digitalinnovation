package digitalinnovation.digitalone

class Pessoa {
    var nome:String = "Victor"
    var cpf: String = "123.123.123-11"
    private set

    constructor() {

    }

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val pessoa = Pessoa()

    println(pessoa.nome)
    println(pessoa.cpf)
    println(pessoa.pessoaInfo())
}