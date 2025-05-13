public class UnderstandingPolymorphism{
	public static void main(String[] args){
		Wolf wolfy = new Wolf();
		Dog badWolfy = (Dog) wolfy;
	}
}

interface Canine{}
interface Dog{}

class Wolf implements Canine{}

