import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
	
	public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("First");
        deque.addLast("Last");
        deque.offerFirst("Front");
        deque.offerLast("End");

        System.out.println("Deque: " + deque);

        String first = deque.getFirst();
        String last = deque.getLast();
        System.out.println("First: " + first);
        System.out.println("Last: " + last);

        deque.removeFirst();
        System.out.println("Deque after removing first: " + deque);
    }

}
