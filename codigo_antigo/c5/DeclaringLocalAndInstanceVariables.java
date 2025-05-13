public class DeclaringLocalAndInstanceVariables {
	String name = "Dole James"; // variável de instância

	final String constante = "Sou uma constante declarada com final"; 

	volatile int threadStuff = 10; // volatile -> indica que o valor pode ser mudado por outros threads
	transient String sobrenome_$ = "Souza"; // transient -> indica que o campo não deve ser serializado com a classe


	public static void main(String... args){
		final int num; // uma variavel local final não precisa ser assinada no momento da declaração
		int num2 = 10;

		if(num2 > 10) num = 5; // ela precisa ser assinala antes de ser usada
		else num = 10; // nessa linha garantimos que a variavel num é inicializada antes de ser usada

		System.out.println(num2);
	}
}