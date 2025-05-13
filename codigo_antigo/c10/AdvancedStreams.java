import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class AdvancedStreams {
    
    public static void main(String[] args) {
        System.out.println("=== Exemplos de Advanced Streams ===");
        
        // 1. Optional encadeado (Chained Optional)
        chainedOptionalExample();
        
        // 2. Spliterator básico
        spliteratorBasicExample();
        
        // 3. Spliterator com características
        spliteratorCharacteristicsExample();
        
        // 4. Operações avançadas de Stream
        advancedStreamOperations();
        
        // 5. Custom Spliterator
        customSpliteratorExample();
    }
    
    // 1. Exemplo de Optional encadeado
    private static void chainedOptionalExample() {
        System.out.println("\n--- Optional Encadeado ---");
        
        List<Optional<String>> optionals = Arrays.asList(
            Optional.of("Java"),
            Optional.empty(),
            Optional.of("Streams"),
            Optional.empty(),
            Optional.of("Avancado")
        );
        
        // Encadeando Optionals para extrair valores não vazios
        List<String> result = optionals.stream()
            .flatMap(opt -> opt.map(Stream::of).orElseGet(Stream::empty))
            .collect(Collectors.toList());
            
        System.out.println("Valores presentes: " + result);
        
        // Outro exemplo com Optional.flatMap
        Optional<String> username = Optional.of("user123");
        Optional<String> userProfile = username.flatMap(user -> getUserProfile(user));
        System.out.println("Perfil do usuário: " + userProfile.orElse("Não encontrado"));
    }
    
    private static Optional<String> getUserProfile(String user) {
        // Simulação de busca em banco de dados
        return user.equals("user123") ? Optional.of("Admin") : Optional.empty();
    }
    
    // 2. Exemplo básico de Spliterator
    private static void spliteratorBasicExample() {
        System.out.println("\n--- Spliterator Básico ---");
        
        List<String> languages = Arrays.asList("Java", "Python", "C++", "JavaScript", "Go");
        Spliterator<String> spliterator = languages.spliterator();
        
        // Dividindo o Spliterator
        Spliterator<String> firstHalf = spliterator.trySplit();
        
        System.out.println("Primeira metade:");
        firstHalf.forEachRemaining(System.out::println);
        
        System.out.println("Segunda metade:");
        spliterator.forEachRemaining(System.out::println);
    }
    
    // 3. Exemplo de Spliterator com características
    private static void spliteratorCharacteristicsExample() {
        System.out.println("\n--- Spliterator Characteristics ---");
        
        List<Integer> numbers = IntStream.range(0, 100).boxed().collect(Collectors.toList());
        Spliterator<Integer> spliterator = numbers.spliterator();
        
        System.out.println("Características do Spliterator:");
        System.out.println("SIZED: " + spliterator.hasCharacteristics(Spliterator.SIZED));
        System.out.println("ORDERED: " + spliterator.hasCharacteristics(Spliterator.ORDERED));
        System.out.println("SORTED: " + spliterator.hasCharacteristics(Spliterator.SORTED));
        System.out.println("CONCURRENT: " + spliterator.hasCharacteristics(Spliterator.CONCURRENT));
        
        // Estimativa de tamanho
        System.out.println("Tamanho estimado: " + spliterator.estimateSize());
    }
    
    // 4. Operações avançadas de Stream
    private static void advancedStreamOperations() {
        System.out.println("\n--- Operações Avançadas de Stream ---");
        
        // Stream de números primos
        System.out.println("Números primos entre 1 e 50:");
        IntStream.rangeClosed(1, 50)
            .filter(AdvancedStreams::isPrime)
            .forEach(n -> System.out.print(n + " "));
        System.out.println();
        
        // Coletor personalizado - média de inteiros
        double average = Stream.of(10, 20, 30, 40, 50)
            .collect(Collectors.collectingAndThen(
                Collectors.summarizingInt(Integer::intValue),
                stats -> stats.getAverage()
            ));
        System.out.println("Média: " + average);
        
        // Stream paralelo com ordenação
        List<String> sortedParallel = Arrays.asList("Java", "C", "Python", "Ruby", "Go", "Swift")
            .parallelStream()
            .sorted()
            .collect(Collectors.toList());
        System.out.println("Ordenação paralela: " + sortedParallel);
    }
    
    private static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
    
    // 5. Exemplo de Spliterator customizado
    private static void customSpliteratorExample() {
        System.out.println("\n--- Custom Spliterator ---");
        
        String text = "Java-8-Stream-API-Spliterator-Example";
        Spliterator<String> wordSpliterator = new WordSpliterator(text, '-');
        
        System.out.println("Palavras separadas por '-':");
        wordSpliterator.forEachRemaining(System.out::println);
    }
    
    // Implementação de um Spliterator customizado
    static class WordSpliterator implements Spliterator<String> {
        private final String string;
        private final char delimiter;
        private int currentPosition = 0;
        
        public WordSpliterator(String string, char delimiter) {
            this.string = string;
            this.delimiter = delimiter;
        }
        
        @Override
        public boolean tryAdvance(Consumer<? super String> action) {
            if (currentPosition >= string.length()) return false;
            
            int nextDelimiter = string.indexOf(delimiter, currentPosition);
            if (nextDelimiter == -1) {
                nextDelimiter = string.length();
            }
            
            String word = string.substring(currentPosition, nextDelimiter);
            action.accept(word);
            currentPosition = nextDelimiter + 1;
            return true;
        }
        
        @Override
        public Spliterator<String> trySplit() {
            // Implementação simples - não suporta divisão
            return null;
        }
        
        @Override
        public long estimateSize() {
            return string.length() - currentPosition;
        }
        
        @Override
        public int characteristics() {
            return ORDERED | IMMUTABLE | NONNULL;
        }
    }
}