public class AssiningValues{

	// short erro = (byte) 2 * (byte) 4; -> ao multiplicar bytes, o java automaticamente faz o casting do resultado para int, um int não pode ser atribuido a um short

	static long addCandy(double fruit, float vegetables){
		return (int) (fruit + vegetables); // dessa forma compila, já que um int é convertido para long pelo java 
		return (int) fruit + vegetables; // dessa forma não compila já que o cast int está sendo feito apenas em 'fruit'
	}

	public static void main(String[] args){
		System.out.println(AssiningValues.addCandy(1.4, 2.4f));
	}
}