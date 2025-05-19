public class DestruindoObjetos{
	public static void main(String[] args){
		String um, dois; // Declarando duas variáveis de referência para objetos do tipo String

		um = new String("a"); // Criando objeto String "a" e apontando variável "um"
		dois = new String("b"); // Criando objeto String "b" e apontando variável "dois"
		um = dois; // Apontando variável "um" para o objeto "a", nesse momento o objeto "b" perde referência e se torna elegível ao garbage collector

		String tres = um; // Declara nova variável de referência e aponta para o objeto "a"
		um = null; // Aponta a variável "um" para null
	}
}