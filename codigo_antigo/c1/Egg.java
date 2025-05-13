public class Egg{
	public Egg(){
		number = 5; // 3 
	}

	int number = 3; // 1
	{ number = 4;} // 2

	public static void main(String args[]){
		Egg egg = new Egg();
		System.out.println(egg.number);
	}
}