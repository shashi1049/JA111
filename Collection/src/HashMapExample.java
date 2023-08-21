import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
	public static void main(String[] args) {
        // Creating a HashMap to store names and ages
        Map<String, Integer> ageMap = new HashMap<>();

        // Adding key-value pairs to the map
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 28);

        // Retrieving values based on keys
        int aliceAge = ageMap.get("Alice");
        System.out.println("Age of Alice: " + aliceAge);

        // Updating an existing key's value
        ageMap.put("Alice", 26);

        // Removing a key-value pair
        ageMap.remove("Bob");

        // Iterating through the map using entrySet()
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            String name = entry.getKey();
            int age = entry.getValue();
            System.out.println(name + ": " + age);
        }
    }

}
