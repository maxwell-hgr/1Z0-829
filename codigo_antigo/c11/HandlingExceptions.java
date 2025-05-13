public class HandlingExceptions {
    public static void main(String... args) {
        // Exemplo básico de try-catch
        try {
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro ao dividir: " + e.getMessage());
        }

        // Exemplo com múltiplos catch blocks (chaining catch)
        try {
            processarDados(null, "10");
        } catch (NullPointerException e) {
            System.out.println("Erro: Objeto nulo - " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro: Formato numérico inválido - " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro genérico: " + e.getMessage());
        }

        // Exemplo com bloco finally
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Isso vai causar ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice do array inválido: " + e.getMessage());
        } finally {
            System.out.println("Este bloco finally SEMPRE será executado, ocorrendo erro ou não");
        }

        // Exemplo com propagação de exceção
        try {
            metodoQuePodeLancarExcecao();
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção capturada no main: " + e.getMessage());
        }

        // Exemplo com catch combinado (Java 7+)
        try {
            String texto = "123a";
            int valor = Integer.parseInt(texto);
            System.out.println("Valor: " + valor);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Erro ao processar número: " + e.getClass().getSimpleName());
        }
    }

    // Método que lança exceção unchecked
    private static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida");
        }
        return a / b;
    }

    // Método que pode lançar diferentes exceções
    private static void processarDados(String texto, String numero) {
        System.out.println("Tamanho do texto: " + texto.length()); // Pode lançar NullPointerException
        int valor = Integer.parseInt(numero); // Pode lançar NumberFormatException
        System.out.println("Valor processado: " + valor);
    }

    // Método que propaga exceção
    private static void metodoQuePodeLancarExcecao() {
        // Simulando uma condição de erro
        boolean condicaoErro = true;
        if (condicaoErro) {
            throw new IllegalArgumentException("Argumento inválido fornecido");
        }
        System.out.println("Método executado com sucesso");
    }
}