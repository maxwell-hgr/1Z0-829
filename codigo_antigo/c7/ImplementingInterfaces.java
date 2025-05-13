public class ImplementingInterfaces implements PrimeiraInterface, SegundaInterface{
	public long numeroDePaginas(){
		return 1100;
	}


	public int numeroDoCapitulo(){
		return 7;
	}

	public static final void main(String... args){
		ImplementingInterfaces ii = new ImplementingInterfaces();
		System.out.println(ii.numeroDoCapitulo());
		System.out.println(ii.numeroDePaginas());
		System.out.println(ii.getTemperatura());		
	}
}

interface PrimeiraInterface{
	int numeroDoCapitulo();
	default double getTemperatura(){
		return 10.0;
	} 
}

interface SegundaInterface{
	long numeroDePaginas();
}