import java.util.stream.*;
import java.util.*;

public class PrimitiveStreams{
	public static final void main(String[] args){
		IntStream ints = IntStream.of(1,2,3,4,5,6);
		OptionalDouble average = ints.average();
		System.out.println(average);

		DoubleStream infinite = DoubleStream.iterate(.5, doub -> doub / 2 );
		infinite.limit(3).forEach(System.out::println);

		Stream<String> strings = Stream.of("dole", "dieimes", "silva");
		strings.mapToInt(s -> s.length()).forEach(System.out::println);
	}
}