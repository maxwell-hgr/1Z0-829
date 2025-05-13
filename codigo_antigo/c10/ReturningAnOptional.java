import java.util.*;

public class ReturningAnOptional{
	public static void main(String[] args){
		int[] nums = new int[]{1,2,3,4,5,6};
		Optional<Double> optionalComMedia = average(nums);
		optionalComMedia.ifPresent(System.out::println);
		Optional<Double> vazio = average();
		System.out.println(optionalComMedia);
		System.out.println(vazio);
		System.out.println("Valor literal: " + optionalComMedia.get());
	}

	public static Optional<Double> average(int... scores){
		if(scores.length == 0) return Optional.empty();
		int sum = 0;
		for(int score : scores) sum += score;
		return Optional.of((double) sum / scores.length);
	}
}