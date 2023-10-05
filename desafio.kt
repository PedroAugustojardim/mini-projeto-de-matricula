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
   
}
fun main() {
     
    val programacaoExterna = ConteudoEducacional("Programação Externa")
    val designDeSoftware = ConteudoEducacional("Design de Software")

    	val ListaConteudo = mutableListOf<ConteudoEducacional>()
    
    ListaConteudo.add(programacaoExterna)
    ListaConteudo.add(designDeSoftware)
    
    val formacao = Formacao("Minha Formação", ListaConteudo, Nivel.AVANCADO)

    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Anny")

    formacao.Matricular(usuario1, usuario2)
    
   val matricula1 = Formacao("João", ListaConteudo, Nivel.AVANCADO)
   val matricula2 = Formacao("Anny", ListaConteudo, Nivel.INTERMEDIARIO)

    println("Estas são as matérias escolhidas por ${ListaConteudo.map{it.nome}}") 
    println("Inscritos na formação:")
     formacao.ListaInscritos()
    println("${matricula1}")
    println("${matricula2}")
    
}

