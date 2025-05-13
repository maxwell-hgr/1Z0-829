import java.util.ArrayList;
import java.util.List;

public class CreatingImmutableObjects{
	public final static void main(String... args){
		var comidaFavorita = new ArrayList<String>();
		comidaFavorita.add("Ração");


		Animal imutavel = new Animal(comidaFavorita);

		comidaFavorita.clear(); // se minha classe não copiar o valor do array, eu ainda consigo modificar o objeto, o que torna um objeto mutável

		System.out.println(imutavel.getComidaFavorita());
	}
}

final class Animal{ // criando um objeto imutável
	private final List<String> comidaFavorita;

	public Animal(List<String> comidaFavorita){
		List<String> comidaFavoritaCopia = new ArrayList<>(comidaFavorita);

		if(comidaFavorita == null || comidaFavorita.size() == 0)
			throw new RuntimeException("passe a comida favorita");
		this.comidaFavorita = comidaFavoritaCopia;
	}

	public String getComidaFavorita(){
		return comidaFavorita.get(0);
	}
}