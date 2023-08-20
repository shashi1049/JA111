import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSortExample {
	
	public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(7);

        // Convert the LinkedList to an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>(numbers);

        // Sort the ArrayList
        Collections.sort(arrayList);

        // Create a new LinkedList from the sorted ArrayList
        LinkedList<Integer> sortedNumbers = new LinkedList<>(arrayList);

        System.out.println("Original LinkedList: " + numbers);
        System.out.println("Sorted LinkedList: " + sortedNumbers);
    }

}
