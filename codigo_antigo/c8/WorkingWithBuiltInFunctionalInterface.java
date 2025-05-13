public class WorkingWithBuiltInFunctionalInterfaces{
	public static void main(String[] args){

		// ===================== SUPPLIER =====================
		// Fornece valores sem receber parâmetros (fábrica/gerador)
		Supplier<String> stringSupplier = () -> "Hello World!";
		System.out.println(stringSupplier.get()); // Imprime: Hello World!

		Supplier<Double> randomSupplier = Math::random;
		System.out.println(randomSupplier.get()); // Imprime um número aleatório

		Supplier<LocalDate> dateSupplier = LocalDate::now;
		System.out.println(dateSupplier.get()); // Imprime a data atual



		// ===================== CONSUMER =====================
		// Consome um valor (recebe parâmetro, não retorna nada) - operações de efeito colateral
		Consumer<String> printConsumer = s -> System.out.println(s);
		printConsumer.accept("Consumindo uma string"); // Imprime: Consumindo uma string

		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		names.forEach(printConsumer); // Imprime cada nome


		// BI-CONSUMER -> Versão de dois parâmetros do Consumer - útil para operações com pares
		BiConsumer<String, Integer> printKeyValue = (k, v) -> 
		    System.out.println(k + " = " + v);
		printKeyValue.accept("Idade", 30); // Imprime: Idade = 30

		var map = new HashMap<String, Integer>();
		BiConsumer<String, Integer> adicionaChaveValor = map::put;
		adicionaChaveValor.accept("Idade", 30)
		System.out.println(map);



		// ===================== PREDICATE =====================
		// Testa uma condição (recebe T, retorna boolean) - usado principalmente em filtros
		Predicate<String> isLong = s -> s.length() > 5;
		System.out.println(isLong.test("Java")); // false
		System.out.println(isLong.test("Functional")); // true

		List<String> words = Arrays.asList("Java", "Lambda", "Function");
		List<String> longWords = words.stream().filter(isLong).toList(); // ["Lambda", "Function"]


		// BIPREDICATE -> Versão de dois parâmetros do Predicate - testa condição com dois valores
		BiPredicate<String, Integer> isLength = (s, len) -> s.length() == len;
		System.out.println(isLength.test("Java", 4)); // true
		System.out.println(isLength.test("Hello", 3)); // false



		// ===================== FUNCTION =====================
		// Transforma um tipo em outro (T -> R) - operações de mapeamento
		Function<String, Integer> lengthFunction = String::length;
		System.out.println(lengthFunction.apply("Java")); // 4

		Function<Integer, String> intToString = Object::toString;
		System.out.println(intToString.apply(42)); // "42"


		// BI-FUNCTION -> Versão de dois parâmetros da Function (T, U -> R) - transforma dois valores em um resultado | o terceito tipo é o do retorno
		BiFunction<String, String, String> concat = (s1, s2) -> s1 + s2;
		System.out.println(concat.apply("Hello ", "World")); // Hello World

		BiFunction<Integer, Integer, Double> power = (base, exp) -> Math.pow(base, exp); // -> o terceito tipo é o do retorno
		System.out.println(power.apply(2, 3)); // 8.0



		// ===================== UNARY OPERATOR =====================
		// Caso especial de Function onde entrada e saída são do mesmo tipo (T -> T)
		UnaryOperator<String> toUpper = String::toUpperCase;
		System.out.println(toUpper.apply("java")); // JAVA

		UnaryOperator<Integer> square = n -> n * n;
		System.out.println(square.apply(5)); // 25



		// BINARY OPERATOR -> Caso especial de BiFunction onde todos os tipos são iguais (T, T -> T)
		BinaryOperator<Integer> sum = int i, int y -> Integer.sum(i, y);
		System.out.println(sum.apply(10, 20)); // 30

		BinaryOperator<String> join = (s1, s2) -> s1 + "-" + s2;
		System.out.println(join.apply("A", "B")); // A-B
	}
}