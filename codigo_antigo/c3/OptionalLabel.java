public class OptionalLabel{
	public static final void main(String... args){
		OUTER_LOOP: for(int i = 0; i < 3; i++){
			System.out.println("i");
			PARENT_LOOP: for(int j = 0; j < 6; j++){
				System.out.println("j");
				for(int k = 0; k < 5; k++){
					System.out.println("k");
					while(k < 25){
						if(k != 10){
							System.out.println("Sou diferente de 10");
						} else {
							System.out.println("Sou 10");
							break PARENT_LOOP;
						}
						k++;
					}
					System.out.println("K");
				}
				System.out.println("J");
			}
			System.out.println("I");	
		}
	}
}