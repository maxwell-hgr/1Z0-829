public class InicializandoVariaveis{
	public static int instancias; // Variável de classe - pertence à classe e possui valor padrão

	String nome; // Variável de instância - pertence ao objeto e possui valor padrão

	public static void main(String... args){
		var texto = "Texto"; // Inferindo tipo String com var (disponível apenas para variáveis locais)

		int num; // Variável local - pertence ao método e não possui valor padrão (precisa ser inicializada se for usada)
	}
}