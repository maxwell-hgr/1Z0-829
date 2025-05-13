import java.util.concurrent.*;

public class ConcurrencyApi{
	public static void main(String[] args) throws Exception{
		Runnable printLine = () -> {
			System.out.println("Sou o executor thread!");
		};
		Runnable printLine2 = () -> {
			System.out.println("Fui agendado pelo atFixedRate");
		};
		Runnable printLine3 = () -> {
			System.out.println("Fui agendado pelo withFixedDelay");
		};


		ExecutorService service = Executors.newSingleThreadExecutor();
		try{
			System.out.println("Sou a thread main!");
			service.execute(printLine);
			Future<?> future = service.submit(() -> System.out.println("Submit!"));
			service.execute(() -> System.out.println(future.isDone()));

			service.execute(printLine);
			service.execute(printLine);
			System.out.println("Fim da thread main!");

		} finally{
			service.shutdown();
		}


		var service2 = Executors.newSingleThreadExecutor();
		try{
			Future<Integer> result2 = service2.submit(() -> 13 + 13);
			System.out.println(result2.get());
		}finally{
			service2.shutdown();
		}


		ScheduledExecutorService service3 = Executors.newSingleThreadScheduledExecutor(); // para agendar tarefas
		ScheduledFuture<?> r1 = service3.scheduleAtFixedRate(printLine2, 5, 4, TimeUnit.SECONDS); // cria uma tarefa a cada 3 segundos independente de qualquer variável
		ScheduledFuture<?> r2 = service3.scheduleWithFixedDelay(printLine3, 0, 3, TimeUnit.SECONDS); // cria uma nova tarefa após a última ser finalizada
	}
}