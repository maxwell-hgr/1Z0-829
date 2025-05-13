import java.util.*;

public class UsingCommonCollectionAPI{
	public static void main(String[] args){
		List<Animal> zoo = new ArrayList<>();
		
		Animal leao = new Animal(true, 12, "Leão");
		Animal tartaruga = new Animal(false, 112, "Tartaruga");;
		Animal cobra = new Animal(true, 8, "Cobra");

		zoo.add(leao);
		zoo.add(tartaruga);
		zoo.add(cobra);

		System.out.println(zoo);
		System.out.println(zoo.size());
		System.out.println(zoo.isEmpty());

		zoo.remove(cobra);
		System.out.println(zoo.contains(cobra));

		zoo.removeIf(Animal::getPerigo);
		System.out.println(zoo);

		zoo.clear();
		System.out.println(zoo);
	}
}

class Animal{
	boolean ePerigoso;
	int idade;
	String nome;

	public Animal(boolean ePerigoso, int idade, String nome){
		this.ePerigoso = ePerigoso;
		this.idade = idade;
		this.nome = nome;
	}

	public String toString(){
		return nome;
	}

	public boolean getPerigo(){
		return ePerigoso;
	}
}