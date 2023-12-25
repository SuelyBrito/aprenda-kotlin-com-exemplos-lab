enum class Nivel(val nivel: String) {
    BA("Basico"),
    IN("Intermediario"),
    AV("Avançado")

}

data class ConteudoEducacional(var nome: String, val duracao: Int = 180)
data class Formacao(val nome: String, var dificuldade: Any, var conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

data class Usuario(var nome: String, var idade: Int)

fun main() {
    var user1 = Usuario("Suely", 66)
    var PROG = ConteudoEducacional("PROGRAMAÇÂO")
    val PROG1 = ConteudoEducacional("Logica", 120)
    val PROG2 = ConteudoEducacional("Introduçao ao Banco de Dados,50")

    val conteudo = mutableListOf<ConteudoEducacional>(PROG, PROG1, PROG2)
    val dific = Nivel.BA
    val dific2 = dific.nivel
    val Formacao1 = Formacao("KOTLIN e JAVA", dific2, conteudo)

    println(Formacao1.toString())
    Formacao1.matricular(user1)
    println(Formacao1.inscritos)

}
