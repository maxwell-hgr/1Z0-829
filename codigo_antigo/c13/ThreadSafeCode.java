import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.concurrent.locks.*;

public class ThreadSafeCode{
	private int counter = 0;
	private int counter2 = 0;

	Lock instanceLock = new ReentrantLock();

	public synchronized void incrementAndReport(){
		System.out.println(++counter + " ");
	}

	public void incrementAndReport2(){
		try{
			instanceLock.lock();
			System.out.println(++counter2 + "-");
		} finally {
			instanceLock.unlock();
		}
	}

	public static void printHello(Lock lock){
		try{
			lock.lock();
			System.out.println("Lockado!");
		}finally{
			lock.unlock();
		}
	}


	public void fazendoTarefasEmEquipe(CyclicBarrier c1, CyclicBarrier c2){
		try{
			System.out.println("Fazendo tarefa 1");
			c1.await();
			System.out.println("Fazendo tarefa 2");
			c2.await();
			System.out.println("Fazendo tarefa 3");
		} catch(Exception e){

		}
	}

	public static void main(String[] args){
		ExecutorService service = Executors.newFixedThreadPool(20);
		ThreadSafeCode tsc = new ThreadSafeCode();
		try{
			for(int i = 0; i < 5; i++){
				service.submit(() -> tsc.incrementAndReport());
			}
			for(int i = 0; i < 5; i++){
				service.submit(() -> tsc.incrementAndReport2());
			}
			Lock lock = new ReentrantLock();
			service.submit(() -> printHello(lock));

			if(lock.tryLock()){
				try{
					System.out.println("Conseguiu o lock");
				} finally {
					lock.unlock();
				}
			} else System.out.println("Não conseguiu o lock!");
			
		} finally{
			service.shutdown();
		}

		ExecutorService service2 = Executors.newFixedThreadPool(4);
		try{
			var c1 = new CyclicBarrier(4);
			var c2 = new CyclicBarrier(4, () -> System.out.println("Realizamos a tarefa 2 em conjunto!"));
			for(int i = 0; i < 4; i++)
				service2.submit(() -> tsc.fazendoTarefasEmEquipe(c1,c2));
		} finally {
			service2.shutdown();
		}
	}
}