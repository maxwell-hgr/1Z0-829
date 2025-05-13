
// Essa é a definição de uma classe
public class EstruturaClasse{

	// Este é um campo (ou variável) da classe
	private String nome = "Maxwell"; 

	// Este é um método - o comportamento do método é definido no bloco de código, e neste caso ele imprime o campo nome
	public void imprimeNome(){ 
		System.out.println(nome);
	}

	public static void main(String... args){
		imprimeNome();
	}
}

// Classes são top-level types, e podem existir de forma independente
class TopLevel{
	// Só é permitido existir um top-level type públic por arquivo .java, ou seja, o código não compilaria se essa classe fosse pública
}