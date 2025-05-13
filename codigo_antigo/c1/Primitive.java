public class Primitive{
	long number = 123124314515L;
	int uninitialized;

	int hexa = 0xFf;

	int binary = 0b10;

	int primiti = Integer.parseInt("123");
	Integer number2 = Integer.valueOf("123");

	String textBlock = """
		"Java Study Guide"
			by Scoott and Jeanne""";

	String pyramid = """
	  *
	 * *
	* * *
	""";


	public static void main(String... args){
		Primitive prime = new Primitive();

		System.out.println(prime.uninitialized);
		System.out.println(prime.number);
		System.out.println(prime.hexa);
		System.out.println(prime.binary);
		System.out.println(prime.textBlock);
		System.out.println(prime.pyramid);
	}
}