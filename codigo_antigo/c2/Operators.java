public class Operators{
	public static void main(String args[]){
		int i = 5;
		int x = 5;
		System.out.println(i--); // output = 5
		System.out.println(--x); // output = 4

		int value = 3;

		int complement = ~value; // para achar esse valor, multiplique o valor original por (-1) e subtraia 1

		System.out.println(complement); // -4

		if(true || i >= 5){ // -> o lado direito não é verificado já que o esquerdo é true
			System.out.println("Diferença de operador lógico e condicional");
		}

		int owl = 5;
		//int food;
		// if(owl < 2) {
		// 	food = 3;
		// } else {
		// 	food = 4;
		// };

		int food = owl < 2 ? 3 : 4; // ternary
	}
}