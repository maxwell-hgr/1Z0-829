public class SealingClasses{
	public static void main(String[] args){
		PinguimGrande pg = new PinguimGrande();
	}	
}

sealed class Pinguim permits PinguimGrande{ 
	{System.out.println("Sou um pinguim normal");}
} 

non-sealed class PinguimGrande extends Pinguim{ // se 'PinguimGrande' não extender Pinguim, o código não compila
	{System.out.println("Sou um pinguim grade!");}

}

sealed interface SealedInterface permits OutraSealedInterface{
	int pegaNum();
}

non-sealed interface OutraSealedInterface extends SealedInterface{} // a interface que extende outra interface não pode ser final, todas as interfaces são abstract