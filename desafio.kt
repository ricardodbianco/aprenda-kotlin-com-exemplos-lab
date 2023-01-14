// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String, val email: String, val senha: String, val nivelConhecimento: Nivel)

data class ConteudoEducacional(var nome: String, var duracao: Int = 60)

data class Formacao(val nome: String, val nivelDificuldade: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }
    
    fun getInscritosOrdenadosPorNivelConhecimento(): List<Usuario> {

    return inscritos.sortedBy { it.nivelConhecimento }

  	}

  	fun usuarioEstaInscrito(usuario: Usuario): Boolean {

  	return usuario in inscritos

   }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    val usuario1 = Usuario("Mariana", "mariana@email.com", "senha123", Nivel.INTERMEDIARIO)
  	val usuario2 = Usuario("Ricardo", "ricardo@email.com", "senha456", Nivel.AVANCADO)
  	val usuario3 = Usuario("Pedro", "pedro@email.com", "senha789", Nivel.BASICO)
  
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val conteudo1 = ConteudoEducacional("Introdução à programação")
  	val conteudo2 = ConteudoEducacional("Design de Interfaces", 90)
  	val conteudo3 = ConteudoEducacional("Estudo das Cores")
    
    val formacao1 = Formacao("$conteudo1", Nivel.INTERMEDIARIO, listOf(conteudo1, conteudo2, conteudo3))
	
	formacao1.matricular(usuario1)
	formacao1.matricular(usuario2)
	formacao1.matricular(usuario3)
    
    println("Usuários inscritos no ${formacao1.nome}:")

}
