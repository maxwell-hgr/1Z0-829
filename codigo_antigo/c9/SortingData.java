import java.util.*;

public class SortingData{
	public static void main(String ...args){
		var animais = new ArrayList<Animal>();
		animais.add(new Animal("Leão"));
		animais.add(new Animal("Lobo"));
		animais.add(new Animal("Jaguatirica"));
		animais.add(new Animal("Avestruz"));
		animais.add(new Animal("Macaco"));
		System.out.println(animais);

		Collections.sort(animais);
		System.out.println(animais);

		Comparator<Animal> comparador = (a1, a2) -> a1.name.compareTo(a2.name);
	}
}

class Animal implements Comparable<Animal>{
	public String name;
	public Animal(String name){
		this.name = name;
	}
	public String toString(){
		return name;
	}
	public int compareTo(Animal a){
		return name.compareTo(a.name); // -> compara as Strings que já tem 'implementação default'
	}
}