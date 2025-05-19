public class EntendendoTipos{
	// Java tem oito tipos primitivos de dados
	boolean condicao;
	byte num;
	short num2;
	int num3;
	long num4;
	float num5;
	double num6;
	char caractere;

	String nome; // Tipo de referência - aponta para um objeto

	public static void main(String... args){
		double numeroValido = 1_000_000.45_22; // Podemos usar underscore para facilitar a leitura

		Double numeroEmpacotado = Double.valueOf(numeroValido); // Classe wrapper para transformar primitivos em objetos

		String stringNormal = "\"Traduçao para pt-BR\"\n    feito por Maxwell";

		String blocoDeTexto = """
			"Tradução para pt-BR"
				feito por Maxwell""";
	}
}