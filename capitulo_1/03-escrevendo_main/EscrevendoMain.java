public class EscrevendoMain{
	public static void main(String[] args){ // A declaração do método main permite outras formas de declaração
//  public static void final main(String args[]){
//  public static void final main(String... args){
//  public static void final main(String ...args){
		// public -> modificador de acesso
		// static -> associa o método a classe para que o Java não precise criar uma instância
		// void -> tipo de retorno, indica que nenhum tipo de dado é retornado pelo método
		// final *opcional -> indica que o método não pode ser sobrescrito


		// A execução do programa deve fornecer dois argumentos, caso contrário o Java dispara um exception
		// Exemplo de comando para execução: java EscrevendoMain Argumento1 Argumento2
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
}