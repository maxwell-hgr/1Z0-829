import java.util.*;

public class UsingQueueAndDeque{
	public static final void main(String[] args){
		Queue<Integer> filaDeNum = new LinkedList<>();
		filaDeNum.add(12);
		filaDeNum.add(22);
		filaDeNum.add(32);
		filaDeNum.add(42);
		filaDeNum.add(22);

		System.out.println("Queue: " + filaDeNum);

		System.out.println(filaDeNum.element());

		filaDeNum.remove();

		System.out.println(filaDeNum);


		Deque<Integer> dequeDeNum = new LinkedList<>();
		dequeDeNum.addFirst(12);
		dequeDeNum.addLast(22);
		dequeDeNum.addLast(32);
		dequeDeNum.addFirst(42);
		dequeDeNum.addFirst(22);

		System.out.println("Deque: " + dequeDeNum);

		System.out.println(dequeDeNum.getFirst());
		System.out.println(dequeDeNum.getLast());

		dequeDeNum.removeFirst();

		System.out.println(dequeDeNum);


		Deque<Integer> stackDeNum = new LinkedList<>();
		stackDeNum.push(12);
		stackDeNum.push(22);
		stackDeNum.push(32);
		stackDeNum.push(42);
		stackDeNum.push(22);

		System.out.println("Stack: " + stackDeNum);

		System.out.println(stackDeNum.peek());

		stackDeNum.pop();

		System.out.println(stackDeNum);
	}
}