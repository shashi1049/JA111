import java.util.ArrayList;

public class CollectionExample {
	
	public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Names: " + names);

        if (names.contains("Bob")) {
            System.out.println("Bob is in the list.");
        }
    }

}
