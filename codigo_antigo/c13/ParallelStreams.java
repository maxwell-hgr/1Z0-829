import java.util.List;

public class ParallelStreams{

	public static int doWork(int i){
		try{
			Thread.sleep(1500);
		}catch(Exception e){}
		return i;
	}


	public static void main(String... args){
		long start = System.currentTimeMillis();

		List.of(1,2,3,4,5)
			.parallelStream()
			.map(e -> doWork(e))
			.forEach(s -> System.out.println(s + " "));

		System.out.println((System.currentTimeMillis() - start)/1000);
	}
}