import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	
	public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple"); // Duplicate, won't be added
        linkedHashSet.add("Orange");

        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("Size: " + linkedHashSet.size());

        System.out.println("Contains 'Apple'? " + linkedHashSet.contains("Apple"));

        linkedHashSet.remove("Banana");
        System.out.println("LinkedHashSet after removing 'Banana': " + linkedHashSet);
    }

}
