import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayDequeSortExample {
	
	public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.add(2);
        deque.add(8);
        deque.add(1);
        deque.add(7);

        ArrayList<Integer> arrayList = new ArrayList<>(deque);

        // Sort the ArrayList
        Collections.sort(arrayList);

        // Clear the deque
        deque.clear();

        // Add the sorted elements back to the deque
        for (Integer element : arrayList) {
            deque.add(element);
        }

        System.out.println("Original ArrayDeque: " + deque);
    }

}
