public class DeclaringConstructors{
	public static void main(String... args){
		Overloaded over = new Overloaded(); // essa linha executa o construtor padrão sem argumentos
		Overloaded chamaOver = new Overloaded(true); // essa linha executa o construtor que recebe um boolean
		Overloaded naoChamaOver = new Overloaded(false); // essa linha executa o construtor que recebe um boolean
	}
}

class Construtor{
	String nome;

	public Construtor(){
		nome = "Nome de construtor padrão";
	}

	public Construtor(String nome){
		this.nome = nome;
	}
}

class Overloaded{

	int num;

	public Overloaded(){
		num = 1;
	}

	public Overloaded(int numero){
		num = numero;
	}

	public Overloaded(boolean chamaOverloaded){
		this(10); // chama o construtor que se aplica (recebe um int)
		if(chamaOverloaded){	
			System.out.println("Chamei o overloaded constructor para printar " + num);
		}
	}
}
