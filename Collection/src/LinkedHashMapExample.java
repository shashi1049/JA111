import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	
	public static void main(String[] args) {
        // Creating a LinkedHashMap to store grades associated with names
        Map<String, Integer> gradeMap = new LinkedHashMap<>();

        // Adding key-value pairs to the map
        gradeMap.put("Alice", 85);
        gradeMap.put("Bob", 92);
        gradeMap.put("Charlie", 78);

        // Retrieving values based on keys
        int aliceGrade = gradeMap.get("Alice");
        System.out.println("Grade of Alice: " + aliceGrade);

        // Updating an existing key's value
        gradeMap.put("Alice", 90);

        // Removing a key-value pair
        gradeMap.remove("Bob");

        // Iterating through the map to print grades
        for (Map.Entry<String, Integer> entry : gradeMap.entrySet()) {
            String name = entry.getKey();
            int grade = entry.getValue();
            System.out.println(name + ": " + grade);
        }
    }

}
