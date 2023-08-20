import java.util.HashSet;
import java.util.Set;

public class SetExample {
	
	public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // Duplicate, won't be added
        fruits.add("Orange");

        System.out.println("Set: " + fruits);
        System.out.println("Size: " + fruits.size());

        System.out.println("Contains 'Apple'? " + fruits.contains("Apple"));

        fruits.remove("Banana");
        System.out.println("Set after removing 'Banana': " + fruits);
    }

}
