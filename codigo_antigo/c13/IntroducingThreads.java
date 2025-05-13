public class IntroducingThreads{
	static int counter = 0;

	public static void main(String[] args){
		new Thread(() -> {
			for(int i = 0; i < 1_000_000; i++) counter++;
			mainThread.interrupt();
		}).start();
		while(counter < 1_000_000){
			System.out.println("Não alcançado ainda!");
			try{
				Thread.sleep(1);
			} catch(Exception e){
				System.out.println("Interrompido!");
			}
		}
		System.out.println("Alcançado: " + counter);
	}
}