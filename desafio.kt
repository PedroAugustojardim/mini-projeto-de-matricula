// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun Matricular(vararg usuario: Usuario) {
        for (Usuario in usuario)
        inscritos.add(Usuario)    
    }
    fun ListaInscritos() {
        for(Inscrito in inscritos){
        println(Inscrito.nome)
    }
}
    fun ListaDeConteudo(){
        
        
    }

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    
    
 }
