public class EncapsulatingDataWithRecords{
	public static void main(){

	}
}

class Carro{
	String modelo;
	int ano;

	public Carro(String modelo, int ano){
		this.modelo = modelo;
		this.ano = ano;
	}
}

record NovoCarro(String modelo, int ano){
	public Crane (int lancamento, int ano){
		this("Carro novo de " + lancamento, ano);
		System.out.println("New car");
	}
}