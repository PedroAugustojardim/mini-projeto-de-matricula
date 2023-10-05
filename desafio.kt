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
        for(cont in conteudos){
        println("${cont.nome}")
        }
    } 
}
fun main() {
     
    val programacaoExterna = ConteudoEducacional("Programação Externa")
    val designDeSoftware = ConteudoEducacional("Design de Software")

    	val ListaConteudo = mutableListOf<ConteudoEducacional>()
    
    ListaConteudo.add(programacaoExterna)
    ListaConteudo.add(designDeSoftware)

    println("Estas são as matérias disponiveis ${ListaConteudo.map{it.nome}}") 
    println("Inscritos na formação:  ")
}
    

