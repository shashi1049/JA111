import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) {
        Map<String, Integer> ageMap = new HashMap<>();

        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 28);
        ageMap.put("Alice", 26); // Replaces the value for key "Alice"

        System.out.println("Map: " + ageMap);
        System.out.println("Size: " + ageMap.size());

        System.out.println("Age of Alice: " + ageMap.get("Alice"));

        ageMap.remove("Bob");
        System.out.println("Map after removing Bob: " + ageMap);
    }

}
