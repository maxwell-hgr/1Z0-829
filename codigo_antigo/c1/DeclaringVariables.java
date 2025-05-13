public class DeclaringVariables{
	
	 // var não é permitido como variável de instância, apenas como variável local

	// var fall = 2, autumn = 2; // gera erro de compilação

	float souUmFloatDefault;

	{float segundoFloat = souUmFloatDefault; }


	public void localDefaultValue(){
		var morning = ""; morning = "Hello"; // como é a mesma variável, separada por ';', o java interpreta como instruções diferentes e não ocorre nenhum erro
		 // int souDefault; -> gera erro de compilação, já que variáveis locais não tem valor default
		int souDefault = 1;
		double tambemSou = 2;

		System.out.println(morning + " | " + souDefault + " | " + tambemSou + " | " + souUmFloatDefault);


		// \s mantém o espaço após os caracteres e \ ignora a quebra de linha
		var blocky = """
			squirrel \s
			pigeon \
			termite""";

		System.out.println(blocky);

		var num1 = Long.parseLong("100"); // retorna um primitivo
		var num2 = Long.valueOf("100"); // retorna um wrapper

		System.out.println(num1 + " | " + num2);
	}

	public static void main(String[] args){
		DeclaringVariables dv = new DeclaringVariables();
		dv.localDefaultValue();
	}
}