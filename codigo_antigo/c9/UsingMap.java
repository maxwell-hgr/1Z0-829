public class UsingMap{
	public static void main(String[] args) {
        // Criando um Map
        Map<String, Integer> populacao = new HashMap<>();
        
        // 1. put() - Adiciona ou substitui um par chave/valor
        populacao.put("São Paulo", 12300000);
        populacao.put("Rio de Janeiro", 6748000);
        populacao.put("Belo Horizonte", 2531000);
        populacao.put("Salvador", 2903000);
        System.out.println("Map após put(): " + populacao);
        
        // 2. get() - Obtém o valor associado a uma chave
        Integer popSP = populacao.get("São Paulo");
        System.out.println("\nPopulação de SP: " + popSP);
        
        // 3. getOrDefault() - Obtém valor ou retorna padrão se chave não existir
        Integer popCuritiba = populacao.getOrDefault("Curitiba", 0);
        System.out.println("População de Curitiba (default): " + popCuritiba);
        
        // 4. containsKey() - Verifica se chave existe
        boolean temSP = populacao.containsKey("São Paulo");
        System.out.println("\nTem São Paulo? " + temSP);
        
        // 5. containsValue() - Verifica se valor existe
        boolean temPop2903000 = populacao.containsValue(2903000);
        System.out.println("Tem cidade com 2.903.000 hab? " + temPop2903000);
        
        // 6. isEmpty() - Verifica se o map está vazio
        System.out.println("\nMap está vazio? " + populacao.isEmpty());
        
        // 7. size() - Retorna o número de entradas
        System.out.println("Tamanho do map: " + populacao.size());
        
        // 8. keySet() - Retorna um Set com todas as chaves
        Set<String> cidades = populacao.keySet();
        System.out.println("\nCidades no map: " + cidades);
        
        // 9. values() - Retorna uma Collection com todos os valores
        Collection<Integer> populacoes = populacao.values();
        System.out.println("Populações no map: " + populacoes);
        
        // 10. entrySet() - Retorna um Set de entradas (pares chave/valor)
        Set<Map.Entry<String, Integer>> entradas = populacao.entrySet();
        System.out.println("\nEntradas do map:");
        for (Map.Entry<String, Integer> entrada : entradas) {
            System.out.println(entrada.getKey() + " => " + entrada.getValue());
        }
        
        // 11. forEach() - Itera sobre cada par chave/valor
        System.out.println("\nIterando com forEach:");
        populacao.forEach((cidade, pop) -> 
            System.out.println(cidade + " tem " + pop + " habitantes"));
            
        // 12. putIfAbsent() - Adiciona apenas se a chave não existir
        Integer valorAntigo = populacao.putIfAbsent("Brasília", 3055000);
        System.out.println("\nValor antigo de Brasília: " + valorAntigo);
        valorAntigo = populacao.putIfAbsent("São Paulo", 9999999);
        System.out.println("Valor antigo ao tentar sobrescrever SP: " + valorAntigo);
        
        // 13. merge() - Combina valores se a chave já existir
        populacao.merge("São Paulo", 1000, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("\nPopulação de SP após merge +1000: " + populacao.get("São Paulo"));
        
        // 14. replace() - Substitui o valor de uma chave existente
        Integer popAntiga = populacao.replace("Salvador", 2904000);
        System.out.println("\nPopulação antiga de Salvador: " + popAntiga);
        System.out.println("População nova de Salvador: " + populacao.get("Salvador"));
        
        // 15. replaceAll() - Substitui todos os valores usando uma função
        populacao.replaceAll((cidade, pop) -> pop + 100); // Aumenta todas as populações em 100
        System.out.println("\nMap após replaceAll (+100 hab em todas):");
        populacao.forEach((k, v) -> System.out.println(k + " => " + v));
        
        // 16. remove() - Remove uma entrada pela chave
        Integer popRemovida = populacao.remove("Belo Horizonte");
        System.out.println("\nPopulação removida de BH: " + popRemovida);
        System.out.println("Map após remoção: " + populacao);
        
        // 17. clear() - Limpa todo o map
        populacao.clear();
        System.out.println("\nMap após clear(): " + populacao);
        System.out.println("Map está vazio agora? " + populacao.isEmpty());
    }
}