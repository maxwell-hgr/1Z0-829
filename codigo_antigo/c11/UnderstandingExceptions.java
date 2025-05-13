import java.io.*;

public class UnderstandingExceptions{
	public static void main(String[] args){
		// try{
		// 	new UnderstandingExceptions().fall(15);
		// } catch(Exception e){
		// 	System.out.println("Disparei a exceção!");
		// }
		new UnderstandingExceptions().hop();
	}

	void fall(int distance) throws IOException{
		if(distance > 10){
			throw new IOException();
		}
	}

	void hop(){
		throw new RuntimeException("cannot hop");
	}
}