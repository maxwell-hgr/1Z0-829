public class AutomatingResources{
	public static void main(String[] args){
		try(FileInputStream is = new FileInputStream("meuArquivo.txt")){
			// Ler o arquivo
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}