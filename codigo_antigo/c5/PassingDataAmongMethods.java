public class PassingDataAmongMethods{

	static void swap(int num1, int num2){
		int temp = num1;

		num1 = num2;
		num2 = temp;
	}


	public static void main(String... args){
		int original1 = 1;
		int original2 = 2;

		Long testando = (long) 8;
		System.out.println(testando);


		swap(original1, original2);
		System.out.println(original1);
		System.out.println(original2);
	}
}