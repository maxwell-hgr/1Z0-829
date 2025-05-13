import java.util.*;
import java.util.stream.*;

public class UsingStreams{

	public static void main(String[] args){
		Stream<String> empty = Stream.empty();
		Stream<String> single = Stream.of("1");
		Stream<Integer> array = Stream.of(1,2,3);

		var list = List.of("a", "b", "c"); // precisa ser um collection
		Stream<String> fromList = list.stream();

		Stream<String> stream1 = Stream.of("macaco", "leão", "cachorro");
		System.out.println(stream1.count()); // 3

		Stream<String> stream2 = Stream.of("macaco", "leão", "cachorro");
		Optional<String> menor = stream2.min((s1,s2) -> s1.length() - s2.length());
		System.out.println(menor.get()); // leão

		Stream<String> stream3 = Stream.of("macaco", "leão", "cachorro");
		Optional<String> existe = stream3.findAny();
		System.out.println(existe);

		Stream<String> stream4 = Stream.of("macaco", "leão", "cachorro");
		boolean match = stream4.anyMatch(s -> s.equals("macaco"));
		System.out.println(match);

		//Stream<Double> infinit = Stream.generate(Math::random);
		//infinit.forEach(x -> System.out.println(x));

		// Soma de números
		List<Integer> numeros = List.of(1, 2, 3, 4, 5);
		int soma = numeros.stream()
		                 .reduce(0, (a, b) -> a + b); // 0 + 1 + 2 + 3 + 4 + 5
		System.out.println(soma); // Saída: 15

		// Concatenação de strings
		List<String> palavras = List.of("Java", " ", "Streams");
		String frase = palavras.stream()
		                      .reduce("", (a, b) -> a + b);
		System.out.println(frase); // Saída: "Java Streams"

		Stream<String> letras = Stream.of("w", "o", "l", "f");

		StringBuilder palavra = letras.collect(
		    StringBuilder::new,         // Cria um novo StringBuilder (supplier)
		    StringBuilder::append,      // Adiciona cada elemento (accumulator)
		    StringBuilder::append       // Combina resultados em paralelo (combiner)
		);

		System.out.println(palavra);  // Saída: "wolf"

		Stream<String> animais = Stream.of("lobo", "leão", "tigre");
		List<String> listaAnimais = animais.collect(Collectors.toList());

		Stream<String> animais2 = Stream.of("lobo", "leão", "tigre");
		animais2.filter(s -> s.startsWith("l")).forEach(x -> System.out.println("Começo com L: " + x));
	}
	
}