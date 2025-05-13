public class UsingMethodsReferences {
    public static void main(String... args) {
    	Animal a = new Animal("Leao", true);
 
    	Ataque at = a::atacando; 
    	

    	System.out.println(a.atacando(a)); 
   
    }
}

interface Ataque {
	String atacando(Animal a);
}

class Animal {
    String nome;
    boolean perigoso;

    public Animal(String nome, boolean perigoso){
    	this.nome = nome;
    	this.perigoso = perigoso;
    }

    public String atacando(Animal a){
    	return a.nome + "está atacando";
    }
}