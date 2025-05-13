public class Enums{
	public static void main(String[] args){
		var s = DiasDaSemana.SEGUNDA;
		DiasDaSemana t = DiasDaSemana.valueOf("TERCA");
		System.out.println(s);
		System.out.println(t);

		switch(s){
			case SEGUNDA:
				System.out.println("Tô triste");
				break;
			case SEXTA:
				System.out.println("Tô feliz");
				break;
			default:
				System.out.println("Tô nem aí");
		}
	}
}

enum DiasDaSemana{
	SEGUNDA,
	TERCA,
	QUARTA,
	QUINTA,
	SEXTA;
}