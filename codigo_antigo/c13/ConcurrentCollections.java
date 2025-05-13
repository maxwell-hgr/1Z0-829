import java.util.*;
import java.util.concurrent.*;

public class ConcurrentCollections{
	public static void main(String[] args){
		List<Integer> favNumbers = new CopyOnWriteArrayList<>(List.of(4,3,42));
		for(var n : favNumbers){
			System.out.println(n + "");
			favNumbers.add(n+1);
		}
	}
}