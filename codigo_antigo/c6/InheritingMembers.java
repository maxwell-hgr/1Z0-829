public class InheritingMembers{
	public static void main(String[] args){
		System.out.println(Bird.temPena());
		System.out.println(Pinguim.temPena());		

		Bird verdadeiro;

		verdadeiro = new Pinguim();

		System.out.println(verdadeiro.temPena()); // o pinguim verdadeiro tem pena por conta do tipo da referência 
	}
}

class Bird{
	protected static boolean temPena(){
		return true;
	}
}

class Pinguim extends Bird{
	public static boolean temPena(){
		return false;
	}
}