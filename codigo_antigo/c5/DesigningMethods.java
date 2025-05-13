public class DesigningMethods{

	// modificadores de acesso
	private void meuMetodoPrivado(){
		System.out.println("Eu sou um método privado, sou acessível apenas dentro da mesma classe");
	}

	void metodoComPackageAcess(){
		System.out.println("Posso ser acessado por qualquer classe do mesmo pacote");
	}

	protected void metodoProtected(){
		System.out.println("Posso ser acessado por qualquer um dos meus filhos (classes que herdam de mim) e também por classes do mesmo pacote");
	}

	public void metodoPublico(){
		System.out.println("Posso ser acessado de qualquer lugar");
	}

	// especificadores opcionais (static, abstract, final, default, synchronized, native, strictfp)
	public final static void metodoFinalDeClasse(){}; // método final tem que ter corpo, não pode ser abstrato

	// public void final metodoQueNaoCompila(){}; // os especificadores opcionais tem ordem dinâmica, desde que sejam declarados antes do return type
		

	// return type
	static int pegaAltura(){
		long temp = 9L;
		return (int) temp; // sem o casting o código não compila
	}

	public static void main(String[] args){
		System.out.println(pegaAltura());
	}
}
