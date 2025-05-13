import java.util.*;

public class CodingFunctionalInterfaces{
	public static void main(String... args){
		List<Animal> animais = new ArrayList<>();
		animais.add(new Animal("Leão", true));
		animais.add(new Animal("Gato", false));
		animais.add(new Animal("Zebra", false));
		animais.add(new Animal("Crocodilo", true));

		boolean perigoso = animais.get(0).checkPerigoso(a -> a.perigoso); // passando lambda como implementação do ÚNICO MÉTODO ABSTRATO da interface funcional checkPerigoso
		System.out.println(perigoso);

	}
}

interface CheckPerigoso{
	boolean ePerigoso(Animal a);
}


class Animal{
	String name;
	boolean perigoso;

	public Animal(String name, boolean perigoso){
		this.name = name;
		this.perigoso = perigoso;
	}

	public boolean checkPerigoso(CheckPerigoso cp){
		return cp.ePerigoso(this);
	}
}