public class CreatingAbstractClasses{
	public static void main(String[] args){
		Canine canine = new Dog();
		canine.makeNoise();

		Wolf wolf = new GrayWolf();
	}
}

abstract class Canine{
	public abstract String getSound();
	public void makeNoise(){
		System.out.println(getSound());
	}
}

abstract class Wolf{

	public Wolf(){
		kill(); // executado quando a classe é inicializada através da subclasse
	}

	String getSound(){
		return "Awwwwwlf";
	}

	abstract void kill();
} 

class Dog extends Canine {
	public String getSound(){
		return "AU AU!";
	}
}

class GrayWolf extends Wolf{
	void kill(){
		System.out.println("Gray wolf is a killer!");
	}
}