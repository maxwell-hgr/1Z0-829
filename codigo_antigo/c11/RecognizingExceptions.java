public class RecognizingExceptions {
    public static void main(String[] x) {
    	// *** Unchecked Exceptions ***
        // NullPointerException (tentar acessar método de objeto null)
        String s = null;
        // System.out.println(s.length()); // Descomente para ver NullPointerException

        // ArrayIndexOutOfBoundsException (acessar índice inválido)
        int[] arr = new int[3];
        // System.out.println(arr[5]); // Descomente para ver ArrayIndexOutOfBoundsException

        // ArithmeticException (divisão por zero)
        int a = 5, b = 0;
        // System.out.println(a / b); // Descomente para ver ArithmeticException

        // NumberFormatException (conversão inválida de string para número)
        String numStr = "abc";
        // int num = Integer.parseInt(numStr); // Descomente para ver NumberFormatException



		// *** Checked Exceptions ***
        try {
            // FileNotFoundException (tentar abrir arquivo que não existe)
            FileInputStream fis = new FileInputStream("arquivo_inexistente.txt");
            
            // ParseException (tentar parsear data com formato inválido)
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.parse("31-02-2023"); // Formato inválido
            
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        } catch (ParseException e) {
            System.out.println("Erro ao parsear data: " + e.getMessage());
        }
        
        // ClassNotFoundException (tentar carregar classe que não existe)
        try {
            Class.forName("com.exemplo.ClasseInexistente");
        } catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada: " + e.getMessage());
        }
    }
}