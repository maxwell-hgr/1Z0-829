public class ManipulandoEscopo{
	String nome; // Variável disponível no escopo do tempo de vida da instância

	public static int instancias; // Variável disponível no escopo de toda a aplicação

	public void imprimeAltura(double altura){ // Parâmetro em escopo por todo o método
		double largura = 2.2; // Variável em escopo por todo o método
		if(altura > 2){
			String texto = "Alto"; // Variável disponível no escopo do if
		}
	}

	public static void main(String[] args){
		System.out.println(ManipulandoEscopo.instancias);
	}
}