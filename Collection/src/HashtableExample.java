import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
	
	public static void main(String[] args) {
        // Creating a Hashtable to store phone numbers associated with names
        Map<String, String> phoneBook = new Hashtable<>();

        // Adding key-value pairs to the map
        phoneBook.put("Alice", "123-456-7890");
        phoneBook.put("Bob", "987-654-3210");
        phoneBook.put("Charlie", "555-123-4567");

        // Retrieving values based on keys
        String aliceNumber = phoneBook.get("Alice");
        System.out.println("Alice's Phone Number: " + aliceNumber);

        // Updating an existing key's value
        phoneBook.put("Alice", "555-555-5555");

        // Removing a key-value pair
        phoneBook.remove("Bob");

        // Iterating through the map to print phone numbers
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            String name = entry.getKey();
            String number = entry.getValue();
            System.out.println(name + ": " + number);
        }
    }

}
