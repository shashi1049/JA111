import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetSortExample {
	
	public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(8);
        hashSet.add(1);
        hashSet.add(7);

        ArrayList<Integer> arrayList = new ArrayList<>(hashSet);

        // Sort the ArrayList
        Collections.sort(arrayList);

        // Create a new HashSet and add the sorted elements
        HashSet<Integer> sortedHashSet = new HashSet<>(arrayList);

        System.out.println("Original HashSet: " + hashSet);
        System.out.println("Sorted HashSet: " + sortedHashSet);
    }

}
