import java.util.*;

public class SimpleLambdas{
	public final static void main(String[] args){
		List<Animal> animais = Arrays.asList(new Animal("Leão"),new Animal("Tatu"),new Animal("Zebra"));
		animais.get(0).atack = true;
		

		Animal[] perigosos = animais.stream().filter((Animal a) -> { return a.atack }).toArray(Animal[]::new);
		for(Animal a : perigosos){
			System.out.println(a);
		}
	}
}

class Animal {
	public String name;
	boolean atack;

	public Animal(String name){
		this.name = name;
	}

	public String toString(){
		return this.name + " ";
	}
}