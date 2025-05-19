public class CriandoObjetos{
	private String nome;

	// Contrutores são executados depois que os campos/atributors e inicializadores de instância são executados
	public CriandoObjetos(String nome){ // Recebe o parâmetro e inicializa o atributo
		this.nome = nome;
	}

	public void CriandoObjetos(){} // Não se trata de um construtor, construtores não têm tipo de retorno

	public static void main(String... args){
		CriandoObjetos co = new CriandoObjetos(); // Chamando o contrutor padrão
	}

	{nome = "Objeto";} // Inicializador de instância - primeira camada de execução na criação de um objeto
}