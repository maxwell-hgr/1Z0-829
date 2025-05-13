public class PatternVariable{
	static void compareIntegers(Number num){
			if(num instanceof Integer data){ // -> o casting de data para Integer é feito automaticamente
				System.out.println(data.compareTo(5));
			}
		}

	public static void main(String[] args){
		Integer num = 5;

		compareIntegers(num);
	}
}