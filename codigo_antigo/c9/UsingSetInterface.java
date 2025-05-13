import java.util.*;

public class UsingSetInterface{
	public static void main(String[] args){
		Set<Integer> setInt = new HashSet<>();

		boolean b1 = setInt.add(12);
		boolean b2 = setInt.add(12);
		boolean b3 = setInt.add(32);
		boolean b4 = setInt.add(42);

		setInt.forEach(x -> System.out.println(x));
	}
}